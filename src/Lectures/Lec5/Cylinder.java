package Lectures.Lec5;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double getArea() {
        double topBottom = 2 * super.getArea();
        double body = height * getCircumference();
        return topBottom + body;
    }

    public double getVolume() {
        return height * super.getArea();
    }

    @Override
    public String toString() {
        return String.format("Cylinder %.1f %.1f %.1f", height, getArea(), getVolume());
    }
}
