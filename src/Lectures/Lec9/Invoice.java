package Lectures.Lec9;

import java.io.Serializable;
import java.util.ArrayList;

public class Invoice implements Serializable {
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

// Exam Scope: Lecture 1-11
// Lecture 1: Basic java stuff, should know by now
// Lecture 2: Basic java stuff, should know by now
// Lecture 4: Java Package not tested, Import statements not required to write in the exam
// Lecture 5: Only need to know how to use an ArrayList/HashMap the rest (E.g. LinkedList, PriorityQueue, ArrayDeque, HashSet) not tested
// Lecture 7: What is a base class, what is a subclass
// Lecture 8: Understand what is an Interface, how to define an Interface, how to define the methods belonging to an interface
// Lecture 9: For file input & output, only testing how to read, open save files
// Lecture 10: Try & Catch exception handling
// Lecture 11: JavaFX
// Not in exam: Lectures 12, 13, 14