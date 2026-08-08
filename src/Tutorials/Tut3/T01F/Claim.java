package Tutorials.Tut3.T01F;

import java.time.LocalDate;

public class Claim {
    private String empId;
    private LocalDate dateOfClaim;

    public Claim(String empId, LocalDate dateOfWork) {
        this.empId = empId;
        this.dateOfClaim = dateOfWork;
    }

    public String getEmpId() { return this.empId; }

    public int getYearOfClaim() { return this.dateOfClaim.getYear(); }

    public int getMonthOfClaim() { return this.dateOfClaim.getMonthValue(); }

    public double getClaimAmount() { return 20; }

    @Override
    public String toString() {
        return String.format("%s %s $%.2f", this.empId, this.dateOfClaim.toString(), getClaimAmount());
    }
}
