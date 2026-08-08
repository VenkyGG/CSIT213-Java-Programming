package Lectures.Lec4;

import java.util.HashMap;

public class AboutHashMap {
    public static void main(String[] args) {
        test1();
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
