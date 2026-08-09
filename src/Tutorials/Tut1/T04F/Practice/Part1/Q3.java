package Tutorials.Tut1.T04F.Practice.Part1;

public class Q3 {
    public static void main(String[] args) {
        double annual_pay = IOHelper.getDouble("Enter annual pay: $");
        int years_curr_job = IOHelper.getInt("Enter years at current job: ");

        // and - &&
        // or - ||
        if (annual_pay >= 50000 && years_curr_job >= 2) {
            IOHelper.println("Qualify for the loan.");
        }
        else {
            IOHelper.println("Not qualified for the loan.");
        }
    }
}
