package Lectures.Lec7.AboutCompare;

public class Fraction {
    private int numerator, denominator;
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public double getRatio(){ return (double)numerator/denominator; }
    public String toString(){
        return String.format("%d/%d %.2f", numerator, denominator, getRatio());
    }
}