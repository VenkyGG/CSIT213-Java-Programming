package Lectures.Lec7.AboutFileIO;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class AboutFileIO {
    public static void main(String[] args) {
        String filename = "data/invoice.txt";

        Scanner reader = null;

        try {
            reader = new Scanner(new File(filename));

            ArrayList<Invoice> invoices = new ArrayList<>();

            while (reader.hasNext()) {
                String oneLine = reader.nextLine();
                //System.out.println(oneLine);

                // Conversion
                String[] invoiceInfo = oneLine.split(",");
                int hours = Integer.parseInt(invoiceInfo[1]);
                double rate = Double.parseDouble(invoiceInfo[2]);

                // Create instance and add to ArrayList
                invoices.add(new Invoice(invoiceInfo[0], hours, rate));
            }

            for (Invoice inv : invoices) {
                System.out.println(inv);
            }

        }
        catch (FileNotFoundException err) {
            System.out.println(err);
        }
        finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}
