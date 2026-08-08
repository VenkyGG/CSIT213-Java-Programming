package Lectures.Lec3;

import java.util.Arrays;

public class PointMain {
    public static void main(String[] argv){
        //testPoint();
        //comparePoint();
        compareArray();
    }
    public static void compareArray(){
        Point[] a1 = {new Point(1,1), new Point(2,2)};
        Point[] a2 = {new Point(1,1), new Point(2,2)};
        Point[] a3 = a2;
        System.out.println(equalsArray(a1, a2));    // true
        System.out.println(Arrays.equals(a1, a2));  // true
    }
    public static boolean equalsArray(Point[] a1, Point[] a2){
        for (int i = 0; i < a1.length; i++){
            if (a1[i].equals(a2[i]) == false){
                return false;
            }
        }
        return true;
    }
    public static boolean equals(Object[] a1, Object[] a2){
        for (int i = 0; i < a1.length; i++){
            if (a1[i].equals(a2[i]) == false){
                return false;
            }
        }
        return true;
    }
	
    public static void testPoint(){
        Point p1 = new Point(10, 20);
        Point p2 = new Point();
        System.out.println(p1);
        System.out.println(p2);
        Point p3 = new Point(20, 80);
        System.out.println(p1.getDistance());
        System.out.println(p1.getDistance(p3));        
    }

    public static void comparePoint(){
        Point p1 = new Point(10, 20);
        Point p2 = new Point(10, 20);
        Point p3 = p2;
        // Comparing Point instances
        System.out.println(p1 == p2);  // false
        System.out.println(p2 == p3);  // true
        
        // But ...
        Point dummy = null;
        // ...
        System.out.println(p1.equals(dummy)); // false
        
        System.out.println(p1.equals(p2));  // true
        System.out.println(p2.equals(p1));  // true
        System.out.println(p2.equals(p3));  // true
        
    }
}
