package Lectures.Lec7.AboutCompare;

public class Rectangle {
    private double length, width;
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double getArea(){ return length * width; }
    public String toString(){
        return String.format("(%.1f %.1f %.1f)", length, width, getArea());
    }
}