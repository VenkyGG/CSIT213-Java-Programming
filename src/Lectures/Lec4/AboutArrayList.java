package Lectures.Lec4;

import java.util.ArrayList;

public class AboutArrayList {
    public static void main(String[] args) {
        //test1();
        test2();
    }

    public static void test2() {
        ArrayList<String> aList = new ArrayList<String>();
        aList.add("First");
        aList.add("Second");
        aList.add("Last");
        System.out.println(aList.size());
        aList.remove(1);

        for (String s : aList) {
            System.out.println(s);
        }
    }

    public static void test1() {
        ArrayList aList = new ArrayList();
        System.out.println(aList.size()); // 0
        aList.add("first item");
        aList.add(123);
        aList.add(12.34);
        aList.add(false);
        System.out.println(aList.size()); // 4

        // Use get method + loop
        for (int i = 0; i < aList.size(); i++) {
            System.out.println(aList.get(i));
        }

        // for each loop
        for (Object item : aList) {
            System.out.println(item);
        }
    }
}
