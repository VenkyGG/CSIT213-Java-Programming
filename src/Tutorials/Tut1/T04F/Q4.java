package Tutorials.Tut1.T04F;

public class Q4 {
    public static void main(String[] args) {
        double temp = IOHelper.getDouble("Enter water temp: ");

        String state = "";
        if (temp >= 100) {
            state = "Gas";
        }
        else if (temp > 0) {
            state = "Liquid";
        }
        else {
            state = "Solid";
        }

        IOHelper.println("Water state: " + state);
    }
}
