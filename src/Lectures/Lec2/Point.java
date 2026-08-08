package Lectures.Lec2;

public class Point {
    private double x, y;

    public Point() {
        x = 1;
        y = 1;
    }

    public Point(double xyCoord) {
        x = xyCoord;
        y = xyCoord;
    }

    public Point(double xCoord, double yCoord) {
        this.x = xCoord;
        this.y = yCoord;
    }

    public double getDistance() {
        double sumSq = x * x + y * y;
        return Math.sqrt(sumSq);
    }

    public double getDistance(Point other) {
        double xDiff = x - other.x;
        double yDiff = y - other.y;

        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public String toString() {
        return String.format("(%.1f, %.1f)", x, y);
    }
}
