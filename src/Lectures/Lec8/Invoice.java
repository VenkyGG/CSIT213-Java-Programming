package Lectures.Lec8;

import java.util.ArrayList;

public class Invoice {
    private String code;

    private int hours;

    private double rate;

    public Invoice(String code, int hours, double rate) {
        this.code = code;
        this.hours = hours;
        this.rate = rate;
    }

    public String getCode() { return code; }

    public int getHours() { return hours; }

    public double getRate() { return rate; }

    public double getTotal() { return hours * rate; }

    @Override
    public boolean equals(Object other) {
        if (other == null)
            return false;

        if (!(other instanceof Invoice))
            return false;

        Invoice tmp = (Invoice) other;
        return tmp.code.equalsIgnoreCase(code);
    }

    public String toString() {
        return String.format("%s %d %.2f $%.2f", code, hours, rate, getTotal());
    }

    public static ArrayList<Invoice> getSample() {
        ArrayList<Invoice> dummy = new ArrayList<>();

        dummy.add(new Invoice("C501", 50, 25));
        dummy.add(new Invoice("C301", 30, 35));
        dummy.add(new Invoice("C101", 18, 60));
        dummy.add(new Invoice("C202", 25, 25));
        dummy.add(new Invoice("C401", 40, 50));
        dummy.add(new Invoice("C303", 23, 35));
        dummy.add(new Invoice("C701", 70, 40));
        dummy.add(new Invoice("C109", 50, 25));

        return dummy;
    }
}