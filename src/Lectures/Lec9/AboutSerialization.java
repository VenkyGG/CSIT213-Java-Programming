package Lectures.Lec9;

import java.util.*;
import java.io.*;

public class AboutSerialization {
    public static void main(String[] args) {
        //saveInvoice("data/lec_9_invoice_binary.txt");
        readInvoice("data/lec_9_invoice_binary.txt");
    }

    public static void readInvoice(String filename) {
        try(ObjectInputStream reader = new ObjectInputStream(new FileInputStream(filename))) {
            ArrayList<Invoice> data = (ArrayList<Invoice>) reader.readObject();

            for (Invoice i : data) {
                System.out.println(i);
            }

        } catch (ClassNotFoundException | IOException err) {
            System.out.println(err);
        }
    }

    public static void saveInvoice(String filename) {
        ArrayList<Invoice> data = Invoice.getSample();

        try(ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(filename))) {
            writer.writeObject(data);
        } catch(IOException err) {
            System.out.println(err);
        }
    }
}
