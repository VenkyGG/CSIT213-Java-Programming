package Tutorials.Tut4.T01F;


import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class PaymentManager {
    private ArrayList<Payable> items;

    public PaymentManager() {
        items = new ArrayList<>();
    }

    public void load(String filename) {
        Scanner reader = null;

        try {
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            reader = new Scanner(new File(filename));

            while (reader.hasNext()) {
                String oneLine = reader.nextLine();

                String[] values = oneLine.split(",");

                String subscriptionType = values[0];

                if (values[0].equals("R")) {
                    LocalDate dRented = LocalDate.parse(values[3], fmt); // values[3]
                    int qty = Integer.parseInt(values[4]);
                    double cost = Double.parseDouble(values[5]);

                    if (qty <= 0 || cost <= 0)
                        continue;

                    // Create instance
                    EquipRental r = new EquipRental(values[1], values[2], dRented, qty, cost);
                    // Check for duplicated instances
                    if (items.contains(r) == false)
                        items.add(r);
                }
                else {
                    // Subscription or PremiumSubscription
                    LocalDate sDate = LocalDate.parse(values[3], fmt);
                    LocalDate eDate = LocalDate.parse(values[4], fmt);
                    double fee = Double.parseDouble(values[5]);

                    if (values[0].equals("S")) {
                        if (fee <= 0)
                            continue;

                        Subscription s = new Subscription(values[1], values[2], sDate, eDate, fee);

                        if (items.contains(s) == false)
                            items.add(s);
                    }
                    else {
                        double disRate = Double.parseDouble(values[6]);

                        if (fee <= 0 || disRate < 0)
                            continue;

                        PremiumSubscription p = new PremiumSubscription(values[1], values[2], sDate,eDate, fee, disRate);

                        if (items.contains(p) == false)
                            items.add(p);
                    }
                }
            }
        }
        catch (FileNotFoundException err) {
            System.out.println(err);
        }
        finally {
            if (reader != null)
                reader.close();
        }
    }

    public boolean has(Payable item) {
        return false;
    }

    public double getTotalAmount() {
        double total = 0;

        for (Payable p : items) {
            total = total + p.getAmount();
        }

        return total;
    }

    public double getTotalSubscription() {
        double total = 0;

        for (Payable p : items) {
            if (p instanceof Subscription) {
                total = total + p.getAmount();
            }
        }

        return total;
    }

    public double getTotalRental() {
        double total = 0;

        for (Payable p : items) {
            if (p instanceof EquipRental) {
                total = total + p.getAmount();
            }
        }

        return total;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();

        for (Payable item : items) {
            result.append(item + "\n");
        }

        return result.toString();
    }
}
