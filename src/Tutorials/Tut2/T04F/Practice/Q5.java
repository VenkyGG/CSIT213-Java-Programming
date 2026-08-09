package Tutorials.Tut2.T04F.Practice;

import java.util.HashMap;
import java.util.Map;

public class Q5 {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<String, Integer>();

        scores.put("Alice", 85);
        scores.put("Ben", 72);
        scores.put("Cara", 90);
        scores.put("Dev", 65);

        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + ": " + value);
        }

        System.out.println();
        System.out.println(scores.keySet());
        for (String key : scores.keySet()) {
            int value = scores.get(key);
            System.out.println(key + ": " + value);
        }

        System.out.println();
        System.out.println(scores.values());
        int total = 0;
        for (int score : scores.values()) {
            total += score;
        }
        double average = (total * 1.0) / scores.size();
        System.out.println("Average: " + average);

        System.out.println();
        System.out.println(scores.containsKey("Cara"));
        System.out.println(scores.containsKey("David"));

        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            int value = entry.getValue();
            // Increment all the values by 5
            entry.setValue(value + 5);
        }

        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
