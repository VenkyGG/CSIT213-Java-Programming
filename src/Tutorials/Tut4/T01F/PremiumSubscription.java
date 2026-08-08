package Tutorials.Tut4.T01F;

import java.time.LocalDate;

public class PremiumSubscription extends Subscription {
    private double disRate;

    public PremiumSubscription(String code, String name, LocalDate startDate, LocalDate expiryDate, double fee, double dRate) {
        super(code, name, startDate, expiryDate, fee);
        disRate = dRate;
    }

    @Override
    public double getAmount() {
        return super.getAmount() * (1 - disRate);
    }

}
