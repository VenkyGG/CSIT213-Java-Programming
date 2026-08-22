package Tutorials.Tut4.T04F;

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

    @Override
    public double getAmount() {
        return fee;
    }

    public static void main(String[] args) {
        String code = "code1";
        String name = "Peter";
        LocalDate startDate = LocalDate.of(2026, 2, 1);
        LocalDate expiryDate = LocalDate.of(2028, 2, 1);
        double fee = 100;

        Subscription s = new Subscription(code, name, startDate, expiryDate, fee);
        System.out.println(s);
    }
}
