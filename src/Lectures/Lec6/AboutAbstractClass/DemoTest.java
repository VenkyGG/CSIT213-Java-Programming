package Lectures.Lec6.AboutAbstractClass;

public class DemoTest {
    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test2() {
        //DemoBase b = new DemoBase(10); // Error as it is an Abstract class
        DemoSub s = new DemoSub(10);
        System.out.println(s.getValue());
        System.out.println(s);
    }

    public static void test1() {
        //DemoBase a = new DemoBase(10); // Error
    }
}
