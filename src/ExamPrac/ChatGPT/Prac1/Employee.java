package ExamPrac.ChatGPT.Prac1;

import java.util.ArrayList;

public abstract class Employee implements Payable {
    private String empId;
    private String name;

    public Employee(String empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract String getEmployeeType();

    @Override
    public abstract double calculatePay();

    public static void main(String[] args) {
        try {
            FullTimeEmployee e1 = new FullTimeEmployee("E001", "Alice", 5000);
            PartTimeEmployee e2 = new PartTimeEmployee("E002", "Bob", 80, 20);

            ArrayList<Employee> eList = new ArrayList<>();
            eList.add(e1);
            eList.add(e2);

            for (Employee e : eList) {
                StringBuilder sb = new StringBuilder();

                sb.append(e.getName() + " (");
                sb.append(e.getEmployeeType() + "): $");
                sb.append(String.valueOf(e.calculatePay()));

                System.out.println(sb.toString());
            }
        }
        catch (InvalidHoursException ex) {
            System.out.println(ex);
        }
    }
}
