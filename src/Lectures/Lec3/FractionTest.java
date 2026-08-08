package Lectures.Lec3;

public class FractionTest {
    public static void main(String[] argv){
        testFraction();
        testEquals();
    }
    public static void testEquals(){
        Fraction f1 = new Fraction(1, 10);
        Fraction f2 = new Fraction(1, 10);
        Fraction f3 = new Fraction(2, 20);
        System.out.println(f1.equals(f2));
        System.out.println(f2.equals(f3));
        System.out.println(f2.equals("Error"));
        
    }
    public static void testFraction(){
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(1, 10);
        Fraction f3 = new Fraction(1, 0);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }
}
