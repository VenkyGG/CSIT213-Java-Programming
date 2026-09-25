package ExamPrac.ChatGPT.Prac1;

public class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String empId, String name, int hoursWorked, double hourlyRate) throws InvalidHoursException {
        super(empId, name);
        if (hoursWorked < 0 || hoursWorked > 200)
            throw new InvalidHoursException("Hours worked must be between 0 and 200.");

        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String getEmployeeType() {
        return "Part Time";
    }

    @Override
    public double calculatePay() {
        return this.hoursWorked * this.hourlyRate;
    }
}
