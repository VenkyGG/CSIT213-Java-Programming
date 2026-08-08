package Lectures.Lec1;

public class Square {
    private int length; // Instance Variable
                        // Instance variable are global within class

    // Constructor
    // (1) NO return type
    // (2) method name must be the same as class name
    public Square () {
        this.length = 1;
    }
    public Square(int length) {
        this.length = length;
    }

    // get and set methods
    public int getLength() { return this.length; }

    public void setLength(int length) {
        this.length = length;
    }

    public int getArea() {
        return length * this.length;
    }

    public int getPerimeter() {
        return length * 4;
    }
}
