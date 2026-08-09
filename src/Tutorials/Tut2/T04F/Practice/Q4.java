package Tutorials.Tut2.T04F.Practice;

import java.util.HashMap;

public class Q4 {
    public static void main(String[] args) {
        HashMap<String, String> friends = new HashMap<String, String>();
        //           key    value
        friends.put("Ada", "ada@email.com");
        friends.put("Bob", "bob@email.com");
        friends.put("Charles", "charles@email.com");
        friends.put("Don", "don@email.com");
        friends.put("Eric", "eric@email.com");

        System.out.println(friends.get("Bob"));
        System.out.println();
        System.out.println(friends.get("Gina"));
        System.out.println(friends.getOrDefault("Gina", "Not found"));

        System.out.println();
        // Key exists -> overwrite the old value
        // Key does not exist -> create a new key value pair
        friends.put("Bob", "bob@gmail.com");
        System.out.println(friends.get("Bob"));

        friends.remove("Bob");
        System.out.println(friends.getOrDefault("Bob", "Not found"));
        System.out.println(friends.size());
    }
}
