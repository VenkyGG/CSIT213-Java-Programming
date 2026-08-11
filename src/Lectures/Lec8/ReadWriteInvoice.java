package Lectures.Lec8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadWriteInvoice {
    public static void main(String[] args) {
        readInvoice("data/lec_8_invoice.txt");
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

                    data.add(new Invoice(values[0], hours, rate));

                }
                catch (NumberFormatException | InvoiceDataException err) {
                    System.out.printf("[%s] %s\n", oneLine, err);
                }
            }
        } catch (FileNotFoundException err) {
            System.out.println(err);
        }
        finally {
            if (reader != null) {
                reader.close();
            }

            for (Invoice i : data) {
                System.out.println(i);
            }
        }
    }
}
