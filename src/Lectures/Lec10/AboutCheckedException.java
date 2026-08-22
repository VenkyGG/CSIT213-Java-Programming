package Lectures.Lec10;

public class AboutCheckedException {
    public static void main(String[] args) {
        //test1();
        test2();
        System.out.println("End of main");
    }

    public static void test2() {
        try {
            method2(-100);
            System.out.println("test2 OK");
        }
        catch (Exception err) {
            System.out.println(err);
        }
    }

    public static void method2(int num) throws Exception {
        if (num < 0) {
            throw new Exception("Negative number not allowed");
        }
        System.out.println("method2 OK");
    }

    public static void test1() {
        // Checked Exception
//        try {
//            method1(-100);
//            System.out.println("test1 OK");
//        }
//        catch (RuntimeException ex) {
//            System.out.println("Oops");
//            System.out.println(ex);
//        }

        // Unchecked Exception because there is no try, catch
        method1(-100);
        System.out.println("test1 OK");
    }

    public static void method1(int num) {
        if (num < 0) {
            throw new RuntimeException("Number must be >= 0");
        }

        // No error
        System.out.println("method1 OK");
    }
}
