package Lectures.Lec5;

public class CircleTest {
    public static void main(String[] args) {
        //test1();
        test2();
    }

    public static void test2() {
        // Base class reference and subclass instance
        Circle something = new Cylinder(1, 10);
        System.out.println(something.getArea());
        System.out.println(something);
        something = new Circle(1);
        System.out.println(something.getArea());
        System.out.println(something);
        // Polymorphism
    }

    public static void test1() {
        Circle c1 = new Circle(1);
        System.out.println(c1);
        //System.out.println(c1.getVolume()); // Error as this function "getVolume()" does not belong to parent class Circle

        // Cylinder
        Cylinder cy1 = new Cylinder(1, 10);
        System.out.println(cy1.getRadius());
        System.out.println(cy1.getArea());
        System.out.println(cy1.getVolume());
        System.out.println(cy1);
    }
}
