package Tutorials.Tut2.T04F.Practice;

import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<String>();
        shoppingList.add("Milk");
        shoppingList.add("Bread");
        shoppingList.add("Eggs");
        shoppingList.add("Butter");

        System.out.println(shoppingList);

        System.out.println();
        System.out.println(shoppingList.get(2));

        System.out.println();
        // Method overload -> add(item), add(int index, String item)
        shoppingList.add(1, "Coffee");
        System.out.println(shoppingList);

        shoppingList.remove("Eggs");
        System.out.println(shoppingList);
        System.out.println();

        System.out.println(shoppingList.size());
        System.out.println();

        System.out.println(shoppingList.contains("Bread"));
        System.out.println(shoppingList.contains("Kaya"));
        System.out.println();

        for (String item : shoppingList) {
            System.out.println(item);
        }

        System.out.println();

        for (int i = 0; i < shoppingList.size(); i++) {
            String item = shoppingList.get(i);
            System.out.println(i + ": " + item);
        }

        System.out.println();
        // int divide by int -> int
        // size -> 5, 5 divide by 2 -> 2 (ignore decimal places)
        System.out.println(shoppingList);
        int middleIndex = shoppingList.size() / 2;
        shoppingList.add(middleIndex, "Espresso");
        System.out.println(shoppingList);

        for (int i = 0; i < shoppingList.size(); i++) {
            String item = shoppingList.get(i).toUpperCase();
            shoppingList.set(i, item);
        }

        System.out.println(shoppingList);

        // remove(String value) or remove(int index)
        //shoppingList.remove(2);
        //System.out.println(shoppingList);

        for (int i = 0; i < shoppingList.size(); i++) {
            String item = shoppingList.get(i);
            if (item.length() > 5) {
                shoppingList.remove(i);
                i--; // Adjustment here (more of an offset)
            }
        }

        System.out.println(shoppingList);
    }
}
