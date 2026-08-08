package Tutorials.Tut4.T01F;

import java.time.LocalDate;

public class Subscription implements Payable {
    private String code;
    private String name;
    private LocalDate startDate;
    private LocalDate expiryDate;
    private double fee;

    public Subscription(String code, String name, LocalDate startDate, LocalDate expiryDate, double fee) {
        this.code = code;
        this.name = name;
        this.startDate = startDate;
        this.expiryDate = expiryDate;
        this.fee = fee;
    }

    public double getAmount() { return this.fee; }

    public boolean equals(Object sub) {
        if (sub == null || !(sub instanceof Subscription))
            return false;

        Subscription tmp  = (Subscription) sub;

        return tmp.code.equals(this.code);
    }

    public String toString() {
        String className = this.getClass().getSimpleName();
        return String.format("%s %s %s %s $%.2f", className, code, startDate, expiryDate, getAmount());
    }
}
