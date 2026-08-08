package Lectures.Lec5;

import java.util.ArrayList;
import java.util.HashMap;

public class AboutHashMap {
    public static void main(String[] args) {
        //test1();

        // Below is covered in Lecture 5
        //test2();
        test3();
    }

    public static void test3() {
        HashMap<String, ArrayList<Product>> prodByCat = new HashMap<>();

        ArrayList<Product> sample = getSample();

        for (Product p : sample) {
            String category = p.getCategory();
            if (prodByCat.containsKey(category)) {
                ArrayList<Product> currentList =  prodByCat.get(category);
                currentList.add(p);
            }
            else {
                // New entry
                ArrayList<Product> newList = new ArrayList<>();
                newList.add(p);
                prodByCat.put(category, newList);
            }
        }

        // Access the Product instances in the HashMap
        for (String category : prodByCat.keySet()) {
            System.out.println(category);

            ArrayList<Product> prods = prodByCat.get(category);

            for (Product p : prods) {
                System.out.println(p);
            }
        }
    }

    public static void test2() {
        HashMap<String, Product> products = new HashMap<>();

        ArrayList<Product> someData = getSample();
        for (Product p : someData) {
            products.put(p.getCode(), p);
        }

        // Get all the keys
        for (String pCode : products.keySet()) {
            System.out.println(pCode);
        }

        // Get all the values (products)
        for (Product p : products.values()) {
            System.out.println(p);
        }

        // Use the key (String) to get the value (Product instance)
        for (String pCode : products.keySet()) {
            Product prod = products.get(pCode);
            System.out.println(pCode + " " + prod);
        }
    }

    public static ArrayList<Product> getSample() {
        ArrayList<Product> sample = new ArrayList<>();
        sample.add(new Product("p1", "name 1", "cat 1", 10));
        sample.add(new Product("p2", "name 2", "cat 2", 10));
        sample.add(new Product("p3", "name 3", "cat 3", 10));
        sample.add(new Product("p4", "name 4", "cat 1", 10));
        sample.add(new Product("p5", "name 5", "cat 2", 10));
        sample.add(new Product("p6", "name 6", "cat 3", 10));
        sample.add(new Product("p7", "name 7", "cat 3", 10));
        return sample;
    }

    public static void test1() {
        HashMap<String, Integer> enrolment = new HashMap<>();
        enrolment.put("CSIT121", 280);
        enrolment.put("CSIT115", 150);
        enrolment.put("CSIT213", 250);
        enrolment.put("CSIT121", 300); // Replace original value

        // Accessing HashMap
        // Accessing the Keys only
        for (String modCode : enrolment.keySet()) {
            System.out.println(modCode);
        }

        // Accessing the Values only
        for (int classSize : enrolment.values()) {
            System.out.println(classSize);
        }

        // Use the key to get the values
        for (String modCode : enrolment.keySet()) {
            System.out.println(modCode + " " + enrolment.get(modCode));
        }
    }
}
