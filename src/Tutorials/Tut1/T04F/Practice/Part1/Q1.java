package Tutorials.Tut1.T04F.Practice.Part1;

public class Q1 {
    public static void main(String[] args) {
        String name = IOHelper.getString("Enter name: ");
        IOHelper.println("Name: " + name);

        int age = IOHelper.getInt("Enter age: ");
        IOHelper.println("Age: " + age);

        double height = IOHelper.getDouble("Enter height: ");
        IOHelper.println("Height: " + height);
    }
}
