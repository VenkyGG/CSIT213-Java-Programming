package Lectures.Lec1;

public class SquareTest {
    public static void main(String[] args) {
        // Creating instances of Square
        Square s1 = new Square(10);
        Square s2 = new Square(10);
        Square s3 = new Square(20);
        // new is a keyword
        System.out.println(s1.getArea());
        System.out.println(s3.getArea());

        System.out.println("Testing");
    }
}
