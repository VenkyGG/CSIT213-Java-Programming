package ExamPrac.ChatGPT.Prac1;

public class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String empId, String name, double monthlySalary) {
        super(empId, name);
        this.monthlySalary = monthlySalary;
    }

    public String getEmployeeType() {
        return "Full Time";
    }

    @Override
    public double calculatePay() {
        return this.monthlySalary;
    }
}
