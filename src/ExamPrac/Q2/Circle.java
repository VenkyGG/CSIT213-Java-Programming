package ExamPrac.Q2;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) throws DimensionException {
        if (radius < 0) {
            throw new DimensionException("Values cannot be less than 0!");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || !(other instanceof Circle))
            return false;

        Circle circle = (Circle) other;

        return circle.radius == radius;
    }

    @Override
    public String toString() {
        return String.format("%s {%.2f, %.2f}", getClass().getSimpleName(), getCircumference(), getArea());
    }
}
