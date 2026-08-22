package Lectures.Lec10;

public class AboutOverloading {
    public static void main(String[] args) {
        test(1.234);
        test(100);
        test("123");
        test("1.234");
    }

    public static void test(String value) {
        System.out.println("test(string) " + value);
    }

    public static void test(int value) {
        System.out.println("test(int) " + value);
    }

    public static void test(double value) {
        System.out.println("test(double) " + value);
    }
}
