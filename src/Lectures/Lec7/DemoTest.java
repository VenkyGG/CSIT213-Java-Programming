package Lectures.Lec7;

public class DemoTest {
    public static void main(String[] args) {
        DemoA a = new DemoA();
        a.doWork();

        // What instance is this?
        DemoI ref = new DemoA();
        ref.doWork();

        ref = new DemoB();
        ref.doWork();

        // Not applicable to class DemoC
        DemoC c = new DemoC();
        c.doWork();

        //ref = c; // Error

        doSomething(a);
        doSomething(new DemoB());
        //doSomething(c); // Error
    }

    public static void doSomething(DemoI what) {
        what.doWork();
    }
}
