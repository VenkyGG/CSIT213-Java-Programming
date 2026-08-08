package Assignments.A1;

import javax.sound.midi.SysexMessage;
import java.text.spi.BreakIteratorProvider;
import java.util.ArrayList;

/*
Assignment 1 — Practice Questions
Each question is a stand alone function with parameters and a return value.
For every function you will find a question as comments
The first function is provided for your reference with no mark awarded
- A1_Assertion.java is available for testing.
- The first 10 questions Assertion test are available for your reference.
- Work on the rest of the Assertion test to test your assignment.

Message to Students
This assignment is designed to help you revise and become confident with essential Java syntax and problem‑solving. 
While we understand that AI tools can generate answers quickly, your learning comes from attempting each question on your own first.
Please remember:
- Your final exam is handwritten, closed‑book, with no laptop, no IDE, and no AI assistance.
- That means your ability to write Java code from your own understanding is absolutely critical.
- You may score full marks for the assignment with external help, but if you score below 40 marks on the final exam, 
  you will fail the module and will have to repeat it. 
- Copying answers now might feel convenient, but it will not help you when it matters most.
- So, give yourself the chance to truly learn.
- Attempt every question independently first, then use AI only to check, compare, or refine your solution.
- Do it right the first time, your future self will thank you.
*/

public class A1 {

	//Q0 - Write a function to return the sum of all numbers in the int array
	public static int Q0(int[] nums) {
		int total = 0;
		for(int i=0;i<nums.length;i++) {
			total+=nums[i];
		}
		return total;
	}
		
	/* =====================================================================
	 *  SECTION A: int[] ARRAY MANIPULATION (Q1 - Q18)
	 * ===================================================================== */

	//Q1 - Write a function to return the sum of all odd numbers in the int array
	public static int Q1(int[] nums) {
		int sum = 0;

		for (int i : nums)
		{
			if (i % 2 == 1)
				sum += i;
		}

		return sum;
	}

	//Q2 - Write a function to return the largest value in the int array
	public static int Q2(int[] nums) {
		int largest = 0;

		for (int i : nums)
		{
			if (i > largest)
				largest = i;
		}
		
		return largest;
	}


	//Q3 - Write a function to return a new int array that is the reverse of the input array
	public static int[] Q3(int[] nums) {
		int[] reversed = new int[nums.length];

		for (int i = nums.length - 1; i >= 0; i--)
		{
			reversed[nums.length - i - 1] = nums[i];
		}

		return reversed;
	}

	//Q4 - Write a function to return the index of target in the array, or -1 if it is not found (linear search)
	public static int Q4(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] == target)
				return i;
		}

		return -1;
	}

	//Q5 - Write a function to return the product of all elements in the int array
	public static int Q5(int[] nums) {
		int product = 1;

		for (int i : nums)
		{
			product *= i;
		}
		
		return product;
	}

	//Q6 - Write a function to return how many times target appears in the array
	public static int Q6(int[] nums, int target) {
		int count = 0;

		for (int i : nums)
		{
			if (i == target)
				count++;
		}
		
		return count;
	}

	//Q7 - Write a function to return a new int array where every element is doubled
	public static int[] Q7(int[] nums) {
		int[] multiplied = new int[nums.length];

		for (int i = 0; i < nums.length; i++)
		{
			multiplied[i] = nums[i] * 2;
		}

		return multiplied;
	}

	//Q8 - Write a function to return the second largest distinct value in the array
	public static int Q8(int[] nums) {
		int largest = nums[0], second = nums[0];

		for (int i : nums) {
			if (i >= second) {
				if (i > largest) {
					second = largest;
					largest = i;
				}
				else {
					second = i;
				}
			}
		}

		return second;
	}

	//Q9 - Write a function to return the range of the array (largest value minus smallest value)
	public static int Q9(int[] nums) {
		int smallest = nums[0], largest = nums[0];

		for (int i : nums) {
			if (i > largest)
				largest = i;

			if (i < largest)
				smallest = i;
		}

		return largest - smallest;
	}

	//Q10 - Write a function to return a new int array sorted in ascending order
	public static int[] Q10(int[] nums) {
		int[] result = nums.clone();

		for (int i = 0; i < result.length - 1; i++) {
			for (int j = 0; j < result.length - 1 - i; j++) {

				if (result[j] > result[j + 1]) {
					int temp = result[j];
					result[j] = result[j + 1];
					result[j + 1] = temp;
				}
			}
		}

		return result;
	}

	//Q11 - Write a function to return the number of distinct (unique) values in the array
	public static int Q11(int[] nums) {
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			boolean repeat = false;

			for (int j = 0; j < i; j++) {
				if (nums[i] == nums[j]) {
					repeat = true;
					break;
				}
			}

			if (!repeat)
				count++;
		}

		return count;
	}

	//Q12 - Write a function to return a new int array rotated one place to the right
	//      e.g. {1,2,3,4} becomes {4,1,2,3}
	public static int[] Q12(int[] nums) {
		int[] rotated = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			if (i == nums.length - 1) {
				rotated[0] = nums[i];
			}
			else {
				rotated[i + 1] = nums[i];
			}
		}

		return rotated;
	}


	/* =====================================================================
	 *  SECTION B: STRING MANIPULATION (Q19 - Q34)
	 * ===================================================================== */

	//Q13 - Write a function to return the number of vowels (a, e, i, o, u) in the string
	public static int Q13(String s) {
		int totalVowels = 0;

		for (int i = 0; i < s.length(); i++) {
			char currChar = Character.toLowerCase(s.charAt(i));

			if (	currChar == 'a' ||
					currChar == 'e' ||
					currChar == 'i' ||
					currChar == 'o' ||
					currChar == 'u') {
				totalVowels++;
			}
		}

		return totalVowels;
	}

	//Q14 - Write a function to return the reverse of the string
	public static String Q14(String s) {
		String reversed = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			reversed += s.charAt(i);
		}

		return reversed;
	}

	//Q15 - Write a function to return true if the string is a palindrome, otherwise false
	public static boolean Q15(String s) {
		// Note: i treat each upper case and lower case as different characters
		// So in my case Racecar a palindrome, same goes for taco cat -> tac ocat (by right it should be palindrome)
		// I did not use equalsIgnoreCase
		if (s == null) {
			return false;
		}

		StringBuilder reversed = new StringBuilder();

		for (int i = s.length() - 1; i >= 0; i--) {
			reversed.append(s.charAt(i));
		}

		return s.equals(reversed.toString());

		// Equals ignore case code below
/*		String nospace = s.trim().replaceAll("\\s", "");
		StringBuilder reversed = new StringBuilder();

		for (int i = nospace.length() - 1; i >= 0; i--) {
			reversed.append(Character.toLowerCase(nospace.charAt(i)));
		}

		if (nospace.equalsIgnoreCase(reversed.toString()))
			return true;

		return false;*/
	}

	//Q16 - Write a function to return the string with every space replaced by an underscore '_'
	public static String Q16(String s) {
		return s.replace(' ', '_');
	}

	//Q17 - Write a function to return the number of uppercase letters in the string
	public static int Q17(String s) {
		int upperCount = 0;

		for (char c : s.toCharArray()) {
			if (Character.isUpperCase(c))
				upperCount++;
		}

		return upperCount;
	}

	//Q18 - Write a function to return the string with all vowels removed
	public static String Q18(String s) {
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char currChar = Character.toLowerCase(s.charAt(i));

			if (currChar != 'a' && currChar != 'e' && currChar != 'i' && currChar != 'o' && currChar != 'u') {
				result.append(s.charAt(i));
			}
		}

		return result.toString();
	}

	//Q19 - Write a function to return true if the two strings are anagrams of each other, otherwise false
	//      (an anagram uses exactly the same letters the same number of times)
	public static boolean Q19(String a, String b) {
		if (a == null || b == null) {
			return false;
		}

		if (a.length() != b.length()) {
			return false;
		}

		int[] counts = new int[65536];

		for (int i = 0; i < a.length(); i++) {
			counts[a.charAt(i)]++;
			counts[b.charAt(i)]--;
		}

		for (int count : counts) {
			if (count != 0) {
				return false;
			}
		}

		return true;
	}

	//Q20 - Write a function to return the first character that does not repeat in the string
	//      e.g. "swiss" returns 'w'. Return a space ' ' if every character repeats.
	public static char Q20(String s) {
		// Note: i treat each upper case and lower case as different characters
		// So in this case if 'swiSS', 's' would be the first char that doesnt repeat
		// I did not use equalsIgnoreCase, but the spare code is below
		
		if (s == null || s.length() == 0) {
			return ' ';
		}

		int[] counts = new int[65536];

		// Count how many times each character appears
		for (int i = 0; i < s.length(); i++) {
			counts[s.charAt(i)]++;
		}

		// Find the first character that appears only once
		for (int i = 0; i < s.length(); i++) {
			if (counts[s.charAt(i)] == 1) {
				return s.charAt(i);
			}
		}

		return ' ';

		// Equals ignore case code below
/*		for (int i = 0; i < s.length(); i++) {
			boolean dupe = false;
			for (int j = 0; j < s.length(); j++) {
				if (	i != j &&
						Character.toLowerCase(s.toCharArray()[i]) ==
						Character.toLowerCase(s.toCharArray()[j])) {
					dupe = true;
					break;
				}
			}

			if (!dupe) {
				return s.toCharArray()[i];
			}
		}

		return ' ';*/
	}

	//Q21 - Write a function to return the string in title case
	//      (the first letter of each word is uppercase, the rest are lowercase)
	public static String Q21(String s) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char upperCased = Character.toUpperCase(s.toCharArray()[i]);

			if (i == 0) {
				sb.append(upperCased);
			}
			else if (s.toCharArray()[i - 1] == ' ') {
				sb.append(upperCased);
			}
			else {
				sb.append(Character.toLowerCase(s.toCharArray()[i]));
			}
		}

		return sb.toString();
	}

	//Q22 - Write a function to return the character that appears most often in the string
	//      (if there is a tie, return the one that reaches the highest count first)
	public static char Q22(String s) {
		if (s == null || s.length() == 0) {
			return '\0';
		}

		int[] counts = new int[65536];

		char mostFrequent = s.charAt(0);
		int highestCount = 0;

		for (int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);

			counts[current]++;

			if (counts[current] > highestCount) {
				highestCount = counts[current];
				mostFrequent = current;
			}
		}

		return mostFrequent;
	}

	//Q23 - Write a function to return how many times the substring sub appears in s (non-overlapping)
	public static int Q23(String s, String sub) {
		if (s == null || sub == null || sub.length() == 0) {
			return 0;
		}

		int count = 0;
		int i = 0;

		while (i <= s.length() - sub.length()) {
			if (s.substring(i, i + sub.length()).equals(sub)) {
				count++;
				i += sub.length();   // skip past the match
			} else {
				i++;
			}
		}

		return count;
	}

	//Q24 - Write a function to return true if the string contains only digit characters (0-9), otherwise false
	//      (an empty string should return false)
	public static boolean Q24(String s) {
		if (s.isBlank()) {
			return false;
		}

		for (char c : s.toCharArray()) {
			if (c < '0' || c > '9')
				return false;
		}

		return true;
	}

	//Q25 - Write a function to return the string with duplicate characters removed, keeping the first occurrence
	//      e.g. "banana" returns "ban"
	public static String Q25(String s) {
		StringBuilder result = new StringBuilder();

		for (char c : s.toCharArray()) {
			if (result.indexOf(String.valueOf(c)) == -1) {
				result.append(c);
			}
		}
		return result.toString();
	}


	/* =====================================================================
	 *  SECTION C: NUMBERS, LOOPS AND IF/ELSE (Q35 - Q44)
	 * ===================================================================== */

	//Q26 - Write a function to return true if n is a prime number, otherwise false
	public static boolean Q26(int n) {
		if (n == 0)
			return false;
		else if (n == 2)
			return true;
		else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0)
					return false;
			}
		}

		return true;
	}

	//Q27 - Write a function to return the factorial of n (n! = 1 * 2 * 3 * ... * n). Assume n >= 0.
	public static int Q27(int n) {
		int sum = n;

		for (int i = n - 1; i > 0; i--) {
			sum *= i;
		}

		return sum;
	}

	//Q28 - Write a function to return the nth Fibonacci number where fib(0)=0, fib(1)=1
	public static int Q28(int n) {
		if (n == 0)
			return 0;

		int a = 0;
		int b = 1;

		for (int i = 2; i < n; i++) {
			if (a <= b)
				a = a + b;
			else
				b = a + b;
		}

		return a + b;
	}

	//Q29 - Write a function to return the sum of the digits of a positive integer n
	public static int Q29(int n) {
		int sum = 0;
		int tempNum = n;

		while (tempNum / 10 != 0) {
			sum += tempNum % 10;
			tempNum = tempNum / 10;
		}

		sum += tempNum % 10;

		return sum;
	}

	//Q30 - Write a function to return how many digits are in a positive integer n
	public static int Q30(int n) {
		if (n < 0)
			return -1;
		else if (n == 0)
			return 1;

		int division = 10;
		int digitCount = 1;

		while (n / division != 0) {
			division *= 10;
			digitCount++;
		}

		return digitCount;
	}

	//Q31 - Write a function to return the integer formed by reversing the digits of a positive integer n
	//      e.g. 1234 returns 4321
	public static int Q31(int n) {
		int reversed = 0;
		int remainder = 0;

		while (n != 0) {
			remainder = n % 10;
			reversed = (reversed * 10) + remainder;
			n /= 10;
		}

		return reversed;
	}

	//Q32 - Write a function to return true if year is a leap year, otherwise false
	//      (a leap year is divisible by 4, except century years which must be divisible by 400)
	public static boolean Q32(int year) {
		if (year % 400 == 0) {
			return true;
		}
		else if (year % 4 == 0) {
			if (year % 100 == 0) {
				return false;
			}

			return true;
		}

		return false;
	}

	//Q33 - Write a function to return the greatest common divisor (GCD) of two positive integers a and b
	public static int Q33(int a, int b) {
		int bigger;
		int smaller;

		if (a == 0 || b == 0) {
			if (a == 0)
				return b;
			else
				return a;
		}
		else if (a > b) {
			bigger = a;
			smaller = b;
		}
		else if (a < b) {
			bigger = b;
			smaller = a;
		}
		else {
			return a;
		}

		int remainder = bigger % smaller;

		if (remainder == 0)
			return smaller;

		while (remainder != 0) {
			if (smaller % remainder != 0) {
				remainder = smaller % remainder;
				smaller = remainder;
			}
			else {
				break;
			}
		}

		return remainder;
	}

	//Q34 - Write a function to return how many multiples of 3 there are from 1 to n (inclusive)
	public static int Q34(int n) {
		// Shortcut way
		//return n / 3;

		int count = 0;

		for (int i = 1; i < n + 1; i++) {
			if (i % 3 == 0)
				count++;
		}

		return count;
	}


	/* =====================================================================
	 *  SECTION D: ArrayList MANIPULATION (Q45 - Q49)
	 * ===================================================================== */

	//Q35 - Write a function that takes an int array and returns an ArrayList<Integer> containing only the even numbers
	public static ArrayList<Integer> Q35(int[] nums) {
		ArrayList<Integer> evenNums = new ArrayList<Integer>();

		for (int currNum : nums) {
			if (currNum % 2 == 0)
				evenNums.add(currNum);
		}

		return evenNums;
	}

	//Q36 - Write a function to return the sum of all numbers in an ArrayList<Integer>
	public static int Q36(ArrayList<Integer> list) {
		int sum = 0;

		for (int i : list) {
			sum += i;
		}

		return sum;
	}

	//Q37 - Write a function to return a new ArrayList<Integer> with duplicates removed, keeping the original order
	public static ArrayList<Integer> Q37(ArrayList<Integer> list) {
		ArrayList<Integer> newArray = new ArrayList<Integer>();

		for (int i : list) {
			if (!newArray.contains(i)) {
				newArray.add(i);
			}
		}

		return newArray;
	}

	//Q38 - Write a function to return a new ArrayList<Integer> containing only the elements greater than threshold
	public static ArrayList<Integer> Q38(ArrayList<Integer> list, int threshold) {
		ArrayList<Integer> newArray = new ArrayList<Integer>();

		for (int i : list) {
			if (i > threshold)
				newArray.add(i);
		}

		return newArray;
	}

	//Q39 - Write a function to return the largest number in an ArrayList<Integer>
	public static int Q39(ArrayList<Integer> list) {
		if (list.isEmpty())
			return 0;

		int largest = list.getFirst();

		for (int i : list) {
			if (i > largest)
				largest = i;
		}

		return largest;
	}


	/* =====================================================================
	 *  SECTION E: 2D ARRAY
	 * ===================================================================== */

	//Q40 - Write a function to return the sum of all elements in a 2D int array (a grid)
	public static int Q40(int[][] grid) {
		if (grid == null)
			return 0;

		int sum = 0;

		for (int row = 0; row < grid.length; row++) {
			for (int column = 0; column < grid[row].length; column++) {
				sum += grid[row][column];
			}
		}

		return sum;
	}

	//Q41 - Write a function to return the sum of all elements in a given row of the grid
	public static int Q41(int[][] grid, int row) {
		if (grid == null)
			return 0;

		int sum = 0;

		for (int rowx = 0; rowx < grid.length; rowx++) {
			for (int column = 0; column < grid[rowx].length; column++) {
				if (rowx + 1 == row)
					sum += grid[rowx][column];
			}
		}

		return sum;
	}

	//Q42 - Write a function to return the sum of all elements in a given column of the grid
	public static int Q42(int[][] grid, int col) {
		if (grid == null)
			return 0;

		int sum = 0;

		for (int row = 0; row < grid.length; row++) {
			for (int column = 0; column < grid[row].length; column++) {
				if (column + 1 == col)
					sum += grid[row][column];
			}
		}

		return sum;
	}

	//Q43 - Write a function to return the largest value in the whole 2D array
	public static int Q43(int[][] grid) {
		if (grid == null || grid.length == 0)
			return 0;

		int largest = 0;
		boolean foundValue = false;

		for (int row = 0; row < grid.length; row++) {
			for (int column = 0; column < grid[row].length; column++) {
				if (!foundValue) {
					largest = grid[row][column];
					foundValue = true;
				}
				else if (grid[row][column] > largest) {
					largest = grid[row][column];
				}
			}
		}

		return largest;
	}

	//Q44 - Write a function to return the sum of the main diagonal of a square grid
	//      (the main diagonal runs from the top-left corner to the bottom-right corner)
	public static int Q44(int[][] grid) {
		if (grid == null || grid.length == 0) {
			return 0;
		}

		// Check if it is a square array
		for (int row = 0; row < grid.length; row++) {
			if (grid[row] == null || grid[row].length != grid.length) {
				System.out.println("Your grid is not a Square!");
				return 0;
			}
		}

		int sum = 0;

		for (int row = 0; row < grid.length; row++) {
			sum += grid[row][row];
		}

		return sum;
	}

	//Q45 - Write a function to return the sum of the anti-diagonal of a square grid
	//      (the anti-diagonal runs from the top-right corner to the bottom-left corner)
	public static int Q45(int[][] grid) {
		if (grid == null || grid.length == 0) {
			return 0;
		}

		// Check if it is a square array
		for (int row = 0; row < grid.length; row++) {
			if (grid[row] == null || grid[row].length != grid.length) {
				System.out.println("Your grid is not a Square!");
				return 0;
			}
		}

		int sum = 0;

		for (int i = 0; i < grid.length; i++) {
			sum += grid[i][grid.length - 1 - i];
		}

		return sum;
	}

	//Q46 - Write a function to return how many times target appears in the 2D array
	public static int Q46(int[][] grid, int target) {
		int count = 0;

		if (grid == null || grid.length == 0)
			return count;

		for (int row = 0; row < grid.length; row++) {
			for (int column = 0; column < grid[row].length; column++) {
				if (grid[row][column] == target)
					count++;
			}
		}

		return count;
	}

	//Q47 - Write a function to return an int array where each element is the sum of that row in the grid
	public static int[] Q47(int[][] grid) {
		int[] result = new int[grid.length];

		for (int row = 0; row < grid.length; row++) {
			int sum = 0;

			for (int column = 0; column < grid[row].length; column++) {
				sum += grid[row][column];
			}

			result[row] = sum;
		}

		return result;
	}

	//Q48 - Write a function to return an int array where each element is the largest value in that row
	public static int[] Q48(int[][] grid) {
		int[] result = new int[grid.length];

		for (int row = 0; row < grid.length; row++) {
			int largest = grid[row][0];

			for (int column = 1; column < grid[row].length; column++) {
				if (grid[row][column] > largest) {
					largest = grid[row][column];
				}
			}

			result[row] = largest;
		}

		return result;
	}

	//Q49 - Write a function to return the transpose of a rectangular grid
	//      (the transpose turns rows into columns, so element [r][c] becomes [c][r])
	public static int[][] Q49(int[][] grid) {
		int rows = grid.length;
		int columns = grid[0].length;

		int[][] result = new int[columns][rows];

		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result[column][row] = grid[row][column];
			}
		}

		return result;
	}

	//Q50 - Write a function to return true if the grid is rectangular (every row has the same length),
	//      otherwise false
	public static boolean Q50(int[][] grid) {
		for (int row = 1; row < grid.length; row++) {
			if (grid[row].length != grid[0].length) {
				return false;
			}
		}

		return true;
	}
}
