package Lectures.Lec8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoopAndTryCatch {
    public static void main(String[] args) {
        //test1();
        test2();
    }

    public static void test1() {
        Scanner reader = new Scanner(System.in);

        int total = 0;

        try {

            while (true) {
                System.out.println("Integer?");
                int num = reader.nextInt();

                if (num < 0) {
                    break;
                }

                total += num;
            }
        } catch (InputMismatchException err) {
            System.out.println(err);
        }

        System.out.println(total);
    }

    public static void test2() {
        Scanner reader = new Scanner(System.in);

        int total = 0;

        while (true) {
            try {
                System.out.println("Integer?");
                int num = reader.nextInt();

                if (num < 0) {
                    break;
                }

                total += num;
            } catch (InputMismatchException err) {
                System.out.println(err);
                reader.nextLine();
            }
        }
        System.out.println(total);
    }
}
