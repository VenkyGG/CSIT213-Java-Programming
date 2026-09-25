package ExamPrac.Q2;

public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) throws DimensionException {

        if (length < 0 || width < 0) {
            throw new DimensionException("Values cannot be less than 0!");
        }

        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getPerimeter() {
        return 2 * this.length + 2 * this.width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || !(other instanceof Rectangle))
            return false;

        Rectangle rect = (Rectangle) other;

        return rect.length == length && rect.width == width;
    }

    @Override
    public String toString() {
        return String.format("%s {%.2f, %.2f}", getClass().getSimpleName(), getPerimeter(), getArea());
    }
}
