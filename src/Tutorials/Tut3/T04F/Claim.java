package Tutorials.Tut3.T04F;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Claim {
    private String empId;
    private LocalDate dateOfClaim;

    public Claim(String empId, LocalDate dateOfWork) {
        this.empId = empId;
        this.dateOfClaim = dateOfWork;
    }

    public String getEmpId() { return this.empId; }

    public int getMonthOfClaim() { return this.dateOfClaim.getMonthValue(); }

    protected LocalDate getDateOfClaim() { return this.dateOfClaim; }

    public abstract double getClaimAmount();

    public boolean equals(Object other) {
        if (this == other)
            return true;

        if (other == null || getClass() != other.getClass())
            return false;

        Claim claim = (Claim) other;

        return Objects.equals(empId, claim.empId) && Objects.equals(dateOfClaim, claim.dateOfClaim);
    }

    @Override
    public String toString() {
        return String.format("%s{empId='%s', date=%s, amount=%.2f}", getClass().getSimpleName(), this.empId, this.dateOfClaim.toString(), getClaimAmount());
    }
}
