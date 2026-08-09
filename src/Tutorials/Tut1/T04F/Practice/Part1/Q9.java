package Tutorials.Tut1.T04F.Practice.Part1;

public class Q9 {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "Ada";
        names[1] = "Bob";
        names[2] = "Charles";
        names[3] = "Don";
        names[4] = "Eric";

        String[] emails = {
                "ada@gmail.com",
                "bob@gmail.com",
                "charles@gmail.com",
                "don@gmail.com",
                "eric@gmail.com"
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println("Name: " + names[i] + "\t\t\t\t| Email: " + emails[i]);
        }
    }
}
