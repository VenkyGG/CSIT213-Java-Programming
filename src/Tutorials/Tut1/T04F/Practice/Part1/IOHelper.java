package Tutorials.Tut1.T04F.Practice.Part1;

import java.util.Scanner;

public class IOHelper {
    public static String getString(String prompt) {
        print(prompt);

        Scanner kb = new Scanner(System.in);
        String s = kb.nextLine();
        return s;
    }

    public static int getInt(String prompt) {
        print(prompt);

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        return n;
    }

    public static double getDouble(String prompt) {
        print(prompt);

        Scanner kb = new Scanner(System.in);
        double d = kb.nextDouble();
        return d;
    }

    public static void print(String prompt) {
        System.out.print(prompt);
    }

    public static void println(String prompt) {
        System.out.println(prompt);
    }
}
