package Lectures.Lec8;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadWriteInvoice {
    public static void main(String[] args) {
        readInvoice("data/lec_8_invoice.txt");
    }

    public static void writeInvoice(ArrayList<Invoice> data, String filename) {
        try (PrintWriter writer = new PrintWriter(filename)) {
            for (Invoice inv : data) {
                StringBuilder sb = new StringBuilder();
                sb.append(inv.getCode() + "," + inv.getHours() + "," + inv.getRate());
                writer.println(sb.toString());
            }
        }
        catch (FileNotFoundException err) {
            System.out.println(err);
        }
    }

    public static void readInvoice(String filename) {
        ArrayList<Invoice> data = new ArrayList<Invoice>();
        Scanner reader = null;

        try {
            reader = new Scanner(new File(filename));

            while (reader.hasNextLine()) {
                String oneLine = reader.nextLine();
                //System.out.println(oneLine);
                String[] values = oneLine.split(",");

                try {
                    //String code = values[0].trim();
                    int hours = Integer.parseInt(values[1]);
                    double rate = Double.parseDouble(values[2]);

                    if (hours <= 0 || rate <= 0) {
                        // Throw Exception to interrupt thois iteration
                        throw new InvoiceDataException("Hours or Rate must be greater than 0.");
                    }

                    Invoice newInvoice = new Invoice(values[0], hours, rate);

                    if (data.contains(newInvoice)) {
                        throw new InvoiceDataException("Duplicate instance.");
                    }

                    // OK, add to ArrayList
                    data.add(newInvoice);
                }
                catch (NumberFormatException | InvoiceDataException err) {
                    System.out.printf("[%s] %s\n", oneLine, err);
                }
            }

            // After while loop
            for (Invoice i : data) {
                System.out.println(i);
            }

            // Call writeInvoice to save to another file
            writeInvoice(data, "data/lec_8_invoice_2.txt");

        } catch (FileNotFoundException err) {
            System.out.println(err);
        }
        finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}