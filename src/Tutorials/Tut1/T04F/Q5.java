package Tutorials.Tut1.T04F;

public class Q5 {
    public static void main(String[] args) {
        String gender = IOHelper.getString("Enter gender (m/f): " );
        double amount = IOHelper.getDouble("Enter amount spent: $");

        if (amount >= 100) {
            String gift = "";

            if (gender.equalsIgnoreCase("m")) {
                gift = "Shaver";
            }
            else if (gender.equalsIgnoreCase("f")) {
                gift = "Hand Cream";
            }

            IOHelper.println("You get a free " + gift + "!");
        }

        IOHelper.println("Thank you for shopping!");
    }

    public static void testString() {
        char gender = 'f'; // Single-quote -> Char

        if (gender == 'm') {
            IOHelper.println("Male");
        }
        else if (gender == 'f') {
            IOHelper.println("Female");
        }

        String genderS = "male"; // Double-quote -> String

        // For string compare use .equals() or .equalsIgnoreCase()
        if (genderS.equalsIgnoreCase("male")) {
            IOHelper.println("Male");
        }
        else if (genderS.equalsIgnoreCase("female")) {
            IOHelper.println("Female");
        }
        else {
            IOHelper.println("Unknown");
        }
    }
}
