package Tutorials.Tut3.T04F;

import java.time.LocalDate;

/**
 * Transport claim. Amount is computed as distance (km) multiplied by a per-km rate.
 */
public class ClaimTpt extends Claim {
    /** Per-kilometer rate (modifiable via setRate/getRate */
    private static double PER_KM = 0.5;

    private final double distance;

    public ClaimTpt(String empId, LocalDate dateOfWork, double distance) {
        super(empId, dateOfWork);

        if (distance < 0)
            throw new IllegalArgumentException("Distance cannot be negative.");

        this.distance = distance;
    }

    public double getDistance() { return this.distance; }

    @Override
    public double getClaimAmount() { return distance * PER_KM; }

    public String toString() {
        return String.format("ClaimTpt{empId='%s', date=%s, distance=%.2f km, rate=%.2f, amount=%.2f}", getEmpId(), getDateOfClaim(), distance, PER_KM, getClaimAmount());
    }

    public static void setRate(double rate) {
        if (rate < 0)
            throw new IllegalArgumentException("Rate cannot be negative.");

        PER_KM = rate;
    }

    public static double getRate() { return PER_KM; }
}
