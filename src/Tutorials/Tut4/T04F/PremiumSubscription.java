package Tutorials.Tut4.T04F;

import java.time.LocalDate;

public class PremiumSubscription extends Subscription {
    private double disRate;

    public PremiumSubscription(String code, String name, LocalDate startDate, LocalDate expiryDate, double fee, double disRate) {
        super(code, name, startDate, expiryDate, fee);
        this.disRate = disRate;
    }

    public void setDisRate(double disRate) {
        this.disRate = disRate;
    }

    @Override
    public double getAmount() {
        return super.getAmount() * (1.0 - disRate);
    }

    @Override
    public String toString() {
        return String.format("PremiumSubscription{%s, discount rate: %.2f}", super.toString(), this.disRate);
    }

    // Testing
    public static void main(String[] args) {
        String code = "code1";
        String name = "Peter";
        LocalDate startDate = LocalDate.of(2026, 2, 1);
        LocalDate expiryDate = LocalDate.of(2028, 2, 1);
        double fee = 100;
        double discountRate = 0.2;

        PremiumSubscription s = new PremiumSubscription(code, name, startDate, expiryDate, fee, discountRate);
        System.out.println(s);
    }
}
