package Tutorials.Tut1.T04F.Practice.Part1;

public class Q2 {
    public static void main(String[] args) {
        double temp = IOHelper.getDouble("Enter temp in degree Celsius: ");

        double kelvin = temp + 273.15;
        double fahrenheit = (temp * 9 / 5) + 32;

        IOHelper.println(kelvin + "K " + fahrenheit + "F");
    }
}
