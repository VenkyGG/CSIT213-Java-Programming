package Lectures.Lec8;

import java.util.Scanner;

public class AboutExceptionClass {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        try {
            System.out.println("Enter an integer");
            int size = reader.nextInt();
            int[] sample = new int[size];
            sample[10] = 10;
            System.out.println("Enter another integer");
            int divisor = reader.nextInt();
            System.out.println(sample[10] / divisor);
        } catch (RuntimeException err) {
            System.out.println(err);
        }

        System.out.println("End of main.");
    }
}
