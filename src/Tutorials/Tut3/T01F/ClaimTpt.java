package Tutorials.Tut3.T01F;

import java.time.LocalDate;

public class ClaimTpt extends Claim {
    private static double PER_KM = 1.5;
    private double distance;

    public ClaimTpt(String empId, LocalDate dateOfWork, double distance) {
        super(empId, dateOfWork);
        this.distance = distance;
    }

    public double getDistance() { return this.distance; }

    @Override
    public double getClaimAmount() { return distance * PER_KM; }

    public String toString() {
        return String.format("ClaimTpt %.1f %s", distance, super.toString());
    }

    public static void setRate(double rate) { PER_KM = rate; }

    public static double getRate() { return PER_KM; }
}
