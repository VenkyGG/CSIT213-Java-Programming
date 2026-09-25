package Tutorials.Tut4.T04F;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class PaymentManager {
    private ArrayList<Payable> items;
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public PaymentManager() {
        items = new ArrayList<>();
    }

    public void load(String filename) {
        items.clear();

        try {
            Scanner file = new Scanner(new File(filename));
            int line = 0;

            while (file.hasNextLine()) {
                String data = file.nextLine().strip();
                line++;

                if (data.startsWith("#"))
                    continue;

                String[] parts = data.split(",");
                String type = parts[0].strip();

                // No error checks!
                try {
                    if (type.equals("R")) {
                        String code = parts[1].strip();
                        String desc = parts[2].strip();
                        LocalDate dateRented = LocalDate.parse(parts[3].strip(), fmt);
                        int qty = Integer.parseInt(parts[4].strip());
                        double cost = Double.parseDouble(parts[5].strip());

                        EquipRental r = new EquipRental(code, desc, dateRented, qty, cost);
                        items.add(r);
                    }
                    else if (type.equals("S") || type.equals("P")) {
                        String code = parts[1].strip();
                        String name = parts[2].strip();
                        LocalDate startDate = LocalDate.parse(parts[3].strip(), fmt);
                        LocalDate expiryDate = LocalDate.parse(parts[4].strip(), fmt);
                        double fee = Double.parseDouble(parts[5].strip());

                        if (type.equals("S")) {
                            Subscription s = new Subscription(code, name, startDate, expiryDate, fee);
                            items.add(s);
                        }
                        else if (type.equals("P")) {
                            double discountRate = Double.parseDouble(parts[6].strip());

                            PremiumSubscription s = new PremiumSubscription(code, name, startDate, expiryDate, fee, discountRate);
                            items.add(s);
                        }
                    }
                }
                catch (DateTimeParseException ex) {
                    System.out.println("Invalid date at line " + line);
                }
            }
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found.");
        }
    }

    public void display() {
        for (Payable item : items) {
            System.out.println(item);
        }
    }

    public boolean has(Payable item) {
        return items.contains(item);
    }

    public double getTotalAmount(int year, int month) {
        double total = 0;

        for (Payable p : items) {
//            if (p.isInPayableYearMonth(year, month) {
//                total += p.getAmount();
//            }
        }

        return total;
    }

    public double getTotalSubscription(int year, int month) {
        double total = 0;

//        for (Payable p : items) {
//            if (p instanceof Subscription && p.isInPayableYearMonth(year, month)) {
//                total += p.getAmount();
//            }
//        }

        return total;
    }

    public double getTotalRental(int year, int month) {
        double total = 0;

//        for (Payable p :items) {
//            if (p instanceof EquipRental && p.isInPayableYearMonth(year, month)) {
//                total += p.getAmount();
//            }
//        }

        return total;
    }

    public static void main(String[] args) {
        PaymentManager pm = new PaymentManager();
        pm.load("data/lab_4_data.txt");
        pm.display();

        double totalRental = pm.getTotalRental(2025, 6);
        System.out.println("Total Rental: $" + totalRental);

        double totalSubscription = pm.getTotalSubscription(2020, 6);
        System.out.println("Total Subscription: $" + totalSubscription);

        double totalAmount = pm.getTotalAmount(2020, 6);
        System.out.println("Total Amount: $" + totalAmount);
    }
}
