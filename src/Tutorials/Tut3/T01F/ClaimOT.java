package Tutorials.Tut3.T01F;

import java.time.LocalDate;

public class ClaimOT extends Claim {
    private static double CLAIM_MAX = 100;
    private static double CLAIM_PER_HOUR = 20;
    private int hoursOT;

    public ClaimOT(String empId, LocalDate dateOfWork, int hours) {
        super(empId, dateOfWork);
        this.hoursOT = hours;
    }

    public int getHoursOT() { return this.hoursOT; }

    public double getClaimAmount() {
        double total = hoursOT * CLAIM_PER_HOUR;

        if (total > CLAIM_MAX) {
            total = CLAIM_MAX;
        }

        return total;
    }

    public String toString() {
        return String.format("ClaimOT Hour(s): %d %s", hoursOT, super.toString());
    }

    public static void setMaxClaim(double max) { CLAIM_MAX = max; }

    public static double getMaxClaim() { return CLAIM_MAX; }

    public static void setClaimPerHour(double rate) { CLAIM_PER_HOUR = rate; }

    public static double getClaimPerHour() { return CLAIM_PER_HOUR; }
}
