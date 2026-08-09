package Tutorials.Tut1.T04F.Practice.Part2.Q2;

public class Counter {
    // Static variable - belongs to the class
    // All objects share ONE copy of the static variable
    private static int counter = 0;

    // Instance variable
    // Each object has their own unique instance variable
    private int id;

    // Constructor -> public, name of the class
    public Counter() {
        counter++;
        this.id = counter;
    }

    public int getID() {
        return this.id;
    }

    public static int getCounter() {
        // Error! Static has no access to object(this)
        //System.out.println(this.id);
        return counter;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        // Instance method -> must be called from the object
        System.out.println(c1.getID());
        System.out.println(c2.getID());
        System.out.println(c3.getID());

        // Static method -> call from class or object
        System.out.println(Counter.getCounter());
        System.out.println(c1.getCounter());
    }
}
