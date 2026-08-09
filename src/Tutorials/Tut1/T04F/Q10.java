package Tutorials.Tut1.T04F;

import java.util.Random;

public class Q10 {
    public static void main(String[] args) {
        int[] nums = getIntArray();

        for (int n : nums) {
            IOHelper.println("n: " + n);
        }

        // Sort the int array!

    }

    public static int[] getIntArray()
    {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            int n = IOHelper.getInt("Enter an int: ");
            numbers[i] = n;
        }

        return numbers;
    }
}
