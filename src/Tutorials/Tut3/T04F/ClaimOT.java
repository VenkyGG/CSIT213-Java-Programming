package Tutorials.Tut3.T04F;

import java.time.LocalDate;

/**
 * Overtime claim. Amount is hours multiplied by a per-hour rate, capped by a maximum.
 */
public class ClaimOT extends Claim {
    /** Maximum claimable amount for OT (modifiable) */
    private static double CLAIM_MAX = 120;
    /** Claim per hours for OT (modifiable)1 */
    private static double CLAIM_PER_HOUR = 15; // Default rate

    private final int hoursOT;

    public ClaimOT(String empId, LocalDate dateOfWork, int hours) {
        super(empId, dateOfWork);
        if (hours < 0)
            throw new IllegalArgumentException("Hours cannot be negative.");

        this.hoursOT = hours;
    }

    public int getHoursOT() { return this.hoursOT; }

    @Override
    public double getClaimAmount() {
        double amt = hoursOT * CLAIM_PER_HOUR;

        return Math.min(amt, CLAIM_MAX);
    }

    public String toString() {
        return String.format("ClaimOT{empId='%s', date=%s, hours=%d, rate=%.2f, max=%.2f, amount=%.2f}", getEmpId(), getDateOfClaim(), hoursOT, CLAIM_PER_HOUR, CLAIM_MAX, getClaimAmount());
    }

    public static void setMaxClaim(double max) {
        if (max < 0)
            throw new IllegalArgumentException("Max cannot be negative.");

        CLAIM_MAX = max;
    }

    public static double getMaxClaim() { return CLAIM_MAX; }

    public static void setClaimPerHour(double rate) {
        if (rate < 0)
            throw new IllegalArgumentException("Rate cannot be negative.");

        CLAIM_PER_HOUR = rate;
    }

    public static double getClaimPerHour() { return CLAIM_PER_HOUR; }
}
