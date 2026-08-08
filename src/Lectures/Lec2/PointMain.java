package Lectures.Lec2;

public class PointMain {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        Point p2 = new Point();
        System.out.println(p1);
        System.out.println(p2);
        Point p3 = new Point(20, 80);
        System.out.println(p1.getDistance());
        System.out.println(p1.getDistance(p3));
    }
}
