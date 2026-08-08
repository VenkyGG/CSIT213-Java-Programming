package Assignments.A1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A1_Assertion {

	public static void main(String[] args) {
		int score = 0;

		System.out.println("Questions need re-doing: 20");

		// ---------- Q0 ----------
		try {
			int[] nums = { 1, 2, 3, 4 };
			assert A1.Q0(nums) == 10;
			System.out.println("Q0 test passed");
			score += 0;
		} catch (AssertionError ex) {
			System.out.println("Q0 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q0 test failed - Exception");
		}

		// ---------- Q1 ----------
		try {
			int[] nums = { 1, 2, 3, 4 };
			assert A1.Q1(nums) == 4;
			System.out.println("Q1 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q1 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q1 test failed - Exception");
		}

		// ---------- Q2 ----------
		try {
			int[] nums = { 3, 7, 2, 9, 4 };
			assert A1.Q2(nums) == 9;
			System.out.println("Q2 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q2 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q2 test failed - Exception");
		}

		// ---------- Q3 ----------
		try {
			int[] nums = { 1, 2, 3 };
			assert Arrays.equals(A1.Q3(nums), new int[] { 3, 2, 1 });
			System.out.println("Q3 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q3 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q3 test failed - Exception");
		}

		// ---------- Q4 ----------
		try {
			int[] nums = { 4, 8, 15, 16 };
			assert A1.Q4(nums, 15) == 2;
			assert A1.Q4(nums, 99) == -1;
			System.out.println("Q4 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q4 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q4 test failed - Exception");
		}

		// ---------- Q5 ----------
		try {
			int[] nums = { 1, 2, 3, 4 };
			assert A1.Q5(nums) == 24;
			System.out.println("Q5 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q5 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q5 test failed - Exception");
		}

		// ---------- Q6 ----------
		try {
			int[] nums = { 1, 2, 2, 3, 2 };
			assert A1.Q6(nums, 2) == 3;
			System.out.println("Q6 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q6 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q6 test failed - Exception");
		}

		// ---------- Q7 ----------
		try {
			int[] nums = { 1, 2, 3 };
			assert Arrays.equals(A1.Q7(nums), new int[] { 2, 4, 6 });
			System.out.println("Q7 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q7 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q7 test failed - Exception");
		}

		// ---------- Q8 ----------
		try {
			int[] nums = { 4, 1, 7, 3 };
			assert A1.Q8(nums) == 4;
			System.out.println("Q8 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q8 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q8 test failed - Exception");
		}

		// ---------- Q9 ----------
		try {
			int[] nums = { 3, 7, 2, 9 };
			assert A1.Q9(nums) == 7;
			System.out.println("Q9 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q9 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q9 test failed - Exception");
		}

		// ---------- Q10 ----------
		try {
			int[] nums = { 3, 1, 2 };
			assert Arrays.equals(A1.Q10(nums), new int[] { 1, 2, 3 });
			System.out.println("Q10 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q10 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q10 test failed - Exception");
		}

		// ---------- Q11 ----------
		try {
			int[] nums = { 2, 7, 2, 9, 5, 6, 4, 1, 4 };
			assert A1.Q11(nums) == 7;
			System.out.println("Q11 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q11 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q11 test failed - Exception");
		}

		// ---------- Q12 ----------
		try {
			int[] nums = { 2, 7, 2, 9, 5, 6, 4, 1, 4 };
			assert Arrays.equals(A1.Q12(nums), new int[] { 4, 2, 7, 2, 9, 5, 6, 4, 1 });
			assert Arrays.equals(A1.Q12(new int[] { 1, 2, 3, 4 }), new int[] { 4, 1, 2, 3 });
			System.out.println("Q12 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q12 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q12 test failed - Exception");
		}

		// ---------- Q13 ----------
		try {
			assert A1.Q13("I am visting the hospital.") == 8;
			System.out.println("Q13 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q13 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q13 test failed - Exception");
		}

		// ---------- Q14 ----------
		try {
			assert A1.Q14("I am visting the hospital.").equals(".latipsoh eht gnitsiv ma I");
			System.out.println("Q14 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q14 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q14 test failed - Exception");
		}

		// ---------- Q15 ----------
		try {
			assert !A1.Q15("Racecar");
			//assert A1.Q15("Racecar");
			assert A1.Q15("racecar");
			assert !A1.Q15("firetruck");
			assert !A1.Q15("taco cat");
			//assert A1.Q15("taco cat");
			assert A1.Q15("lol");
			System.out.println("Q15 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q15 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q15 test failed - Exception");
		}

		// ---------- Q16 ----------
		try {
			assert A1.Q16("The longest single-word palindrome in the English language is tattarrattat.").equals("The_longest_single-word_palindrome_in_the_English_language_is_tattarrattat.");
			assert A1.Q16("Nothing.").equals("Nothing.");
			System.out.println("Q16 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q16 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q16 test failed - Exception");
		}

		// ---------- Q17 ----------
		try {
			assert A1.Q17("Nothing.") == 1;
			assert A1.Q17("GibBeRRisHIng.") == 6;
			assert A1.Q17("11111111") == 0;
			System.out.println("Q17 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q17 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q17 test failed - Exception");
		}

		// ---------- Q18 ----------
		try {
			assert A1.Q18("Nothing.").equals("Nthng.");
			assert A1.Q18("What are you doing here lmao.").equals("Wht r y dng hr lm.");
			System.out.println("Q18 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q18 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q18 test failed - Exception");
		}

		// ---------- Q19 ----------
		try {
			assert A1.Q19("listen", "silent");
			assert A1.Q19("race", "care");
			assert !A1.Q19("hello", "world");
			assert !A1.Q19("aab", "bba");
			assert !A1.Q19("Race", "care");
			assert A1.Q19("", "");
			System.out.println("Q18 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q19 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q19 test failed - Exception");
		}

		// ---------- Q20 ----------
		try {
			assert A1.Q20("swiss") == 'w';
			assert A1.Q20("lol") == 'o';
			assert A1.Q20("lololol") == ' ';
			assert A1.Q20("swiSS") == 's';
			System.out.println("Q20 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q20 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q20 test failed - Exception");
		}

		// ---------- Q21 ----------
		try {
			assert A1.Q21("i dont know What to do").equals("I Dont Know What To Do");
			assert A1.Q21("what do u want SIA").equals("What Do U Want Sia");
			System.out.println("Q21 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q21 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q21 test failed - Exception");
		}

		// ---------- Q22 ----------
		try {
			assert A1.Q22("hello") == 'l';
			assert A1.Q22("abcabc") == 'a';
			assert A1.Q22("Testing This") == 'T';
			assert A1.Q22("") == '\0';
			System.out.println("Q22 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q22 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q22 test failed - Exception");
		}

		// ---------- Q23 ----------
		try {
			assert A1.Q23("aaaa", "aa") == 2;
			assert A1.Q23("hello i am lola", "lo") == 2;
			assert A1.Q23("banana", "ana") == 1;
			assert A1.Q23("spacex", "i") == 0;
			System.out.println("Q23 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q23 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q23 test failed - Exception");
		}

		// ---------- Q24 ----------
		try {
			assert !A1.Q24("Nothing.");
			assert !A1.Q24("1246*");
			assert A1.Q24("1245666");
			System.out.println("Q24 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q24 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q24 test failed - Exception");
		}

		// ---------- Q25 ----------
		try {
			assert A1.Q25("Nothing.").equals("Nothing.");
			assert A1.Q25("Hello.").equals("Helo.");
			assert A1.Q25("parallel").equals("parle");
			System.out.println("Q25 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q25 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q25 test failed - Exception");
		}

		// ---------- Q26 ----------
		try {
			assert !A1.Q26(0);
			assert A1.Q26(2);
			assert A1.Q26(3);
			assert !A1.Q26(100);
			assert A1.Q26(67);
			System.out.println("Q26 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q26 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q26 test failed - Exception");
		}

		// ---------- Q27 ----------
		try {
			assert A1.Q27(5) == 120;
			assert A1.Q27(10) == 3628800;
			System.out.println("Q27 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q27 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q27 test failed - Exception");
		}

		// ---------- Q28 ----------
		try {
			//Write assertion code to test your function
			assert A1.Q28(5) == 5;
			assert A1.Q28(10) == 55;
			assert A1.Q28(0) == 0;
			assert A1.Q28(8) == 21;
			System.out.println("Q28 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q28 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q28 test failed - Exception");
		}

		// ---------- Q29 ----------
		try {
			assert A1.Q29(1234) == 10;
			assert A1.Q29(1000) == 1;
			assert A1.Q29(9756574) == 43;
			assert A1.Q29(11111111) == 8;
			assert A1.Q29(0) == 0;
			System.out.println("Q29 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q29 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q29 test failed - Exception");
		}

		// ---------- Q30 ----------
		try {
			assert A1.Q30(123456789) == 9;
			assert A1.Q30(1000000) == 7;
			assert A1.Q30(1000) == 4;
			assert A1.Q30(-1000) == -1;
			assert A1.Q30(0) == 1;
			System.out.println("Q30 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q30 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q30 test failed - Exception");
		}

		// ---------- Q31 ----------
		try {
			assert A1.Q31(1234) == 4321;
			assert A1.Q31(1001) == 1001;
			assert A1.Q31(52125) == 52125;
			assert A1.Q31(5) == 5;
			assert A1.Q31(1000) == 1;
			assert A1.Q31(1111) == 1111;
			System.out.println("Q31 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q31 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q31 test failed - Exception");
		}

		// ---------- Q32 ----------
		try {
			assert A1.Q32(1600);
			assert !A1.Q32(1900);
			assert !A1.Q32(2003);
			assert A1.Q32(2004);
			System.out.println("Q32 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q32 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q32 test failed - Exception");
		}

		// ---------- Q33 ----------
		try {
			assert A1.Q33(252, 105) == 21;
			assert A1.Q33(8, 12) == 4;
			assert A1.Q33(15, 15) == 15;
			assert A1.Q33(7, 13) == 1;
			assert A1.Q33(-12, 18) == 6;
			assert A1.Q33(0, 5) == 5;
			assert A1.Q33(17, 34) == 17;
			System.out.println("Q33 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q33 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q33 test failed - Exception");
		}

		// ---------- Q34 ----------
		try {
			assert A1.Q34(9) == 3;
			assert A1.Q34(10) == 3;
			assert A1.Q34(300) == 100;
			assert A1.Q34(13) == 4;
			assert A1.Q34(1000000) == 333333;
			System.out.println("Q34 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q34 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q34 test failed - Exception");
		}

		// ---------- Q35 ----------
		try {
			assert A1.Q35(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }).equals(new ArrayList<>(List.of(2, 4, 6, 8, 10)));
			assert A1.Q35(new int[] { 0, 1, 2, 3 }).equals(new ArrayList<>(List.of(0, 2)));
			assert A1.Q35(new int[] { }).equals(new ArrayList<>(List.of()));
			assert A1.Q35(new int[] { -1, -2, -3, -4 }).equals(new ArrayList<>(List.of(-2, -4)));
			assert A1.Q35(new int[] { 1, 1, -2, 2, 5, 4, 4, 2, -2 }).equals(new ArrayList<>(List.of(-2, 2, 4, 4, 2, -2)));
			System.out.println("Q35 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q35 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q35 test failed - Exception");
		}

		// ---------- Q36 ----------
		try {
			assert A1.Q36(new ArrayList<>(List.of())) == 0;
			assert A1.Q36(new ArrayList<>(List.of(1, 2, 3, 4))) == 10;
			assert A1.Q36(new ArrayList<>(List.of(1, 2, 3, -4))) == 2;
			assert A1.Q36(new ArrayList<>(List.of(1, 10, 100, 1000, 10000))) == 11111;
			System.out.println("Q36 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q36 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q36 test failed - Exception");
		}

		// ---------- Q37 ----------
		try {
			assert A1.Q37(new ArrayList<>(List.of())).equals(new ArrayList<>(List.of()));
			assert A1.Q37(new ArrayList<>(List.of(1, 2, 3, 4))).equals(new ArrayList<>(List.of(1, 2, 3, 4)));
			assert A1.Q37(new ArrayList<>(List.of(1, 2, 2, 3, 1, 4))).equals(new ArrayList<>(List.of(1, 2, 3, 4)));
			assert A1.Q37(new ArrayList<>(List.of(5, 5, 5, 5, 5))).equals(new ArrayList<>(List.of(5)));
			assert A1.Q37(new ArrayList<>(List.of(1, 2, 1, 2, 1, 2))).equals(new ArrayList<>(List.of(1, 2)));
			System.out.println("Q37 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q37 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q37 test failed - Exception");
		}

		// ---------- Q38 ----------
		try {
			assert A1.Q38(new ArrayList<>(List.of(10000, 1000, 100, 10, 1)), 500).equals(new ArrayList<>(List.of(10000, 1000)));
			assert A1.Q38(new ArrayList<>(List.of(1, 2, 3, 4, 5)), 10).equals(new ArrayList<>(List.of()));
			assert A1.Q38(new ArrayList<>(List.of(3, 6, 9, 12, 15)), 9).equals(new ArrayList<>(List.of(12, 15)));
			assert A1.Q38(new ArrayList<>(List.of(-5, -2, 0, 3, 7)), -3).equals(new ArrayList<>(List.of(-2, 0, 3, 7)));
			assert A1.Q38(new ArrayList<>(List.of()), 5).equals(new ArrayList<>(List.of()));
			System.out.println("Q38 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q38 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q38 test failed - Exception");
		}

		// ---------- Q39 ----------
		try {
			assert A1.Q39(new ArrayList<>(List.of())) == 0;
			assert A1.Q39(new ArrayList<>(List.of(1, 5, 3, 9, 2))) == 9;
			assert A1.Q39(new ArrayList<>(List.of(1, 10, 100, 1000, 10000))) == 10000;
			assert A1.Q39(new ArrayList<>(List.of(10000, 1000, 100, 10, 1))) == 10000;
			assert A1.Q39(new ArrayList<>(List.of(4, 9, 9, 2, 9))) == 9;
			assert A1.Q39(new ArrayList<>(List.of(-5, -12, -3, -8))) == -3;
			System.out.println("Q39 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q39 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q39 test failed - Exception");
		}

		// ---------- Q40 ----------
		try {
			assert A1.Q40(new int[][] {	{ 1, 2 },
										{ 3, 4}}) == 10;
			assert A1.Q40(new int[][] {	{ 1, 2, 3 },
										{ 4, 5, 6 },
										{ 7, 8, 9 }}) == 45;
			assert A1.Q40(new int[][] {	{ 1, 2, 3 },
										{ 4, 5, 6 }}) == 21;
			assert A1.Q40(new int[][] {	{ 1, 2 },
										{ 3 },
										{ 4, 5, 6 }}) == 21;
			assert A1.Q40(new int[][] {	{ -1, 2 },
										{ -3, 4}}) == 2;
			System.out.println("Q40 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q40 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q40 test failed - Exception");
		}

		// ---------- Q41 ----------
		try {
			assert A1.Q41(new int[][] {	{ 1, 2 },
										{ 3, 4}}, 1) == 3;
			assert A1.Q41(new int[][] {	{ 1, 2, 3 },
										{ 4, 5, 6 },
										{ 7, 8, 9 }}, 4) == 0;
			assert A1.Q41(new int[][] {	{ 1, 2, 3 },
										{ 4, 5, 6 }}, 2) == 15;
			assert A1.Q41(new int[][] {	{ 1, 2 },
										{ 3 },
										{ 4, 5, 6 }}, 2) == 3;
			assert A1.Q41(new int[][] {	{ -1, 2 },
										{ -3, 4}} , 2) == 1;
			assert A1.Q41(new int[][] {	{ -1, 2 },
										{ -3, 4}} , 0) == 0;
			System.out.println("Q41 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q41 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q41 test failed - Exception");
		}

		// ---------- Q42 ----------
		try {
			assert A1.Q42(new int[][] {	{ 1, 2 },
										{ 3, 4}}, 1) == 4;
			assert A1.Q42(new int[][] {	{ 1, 2, 3 },
										{ 4, 5, 6 },
										{ 7, 8, 9 }}, 4) == 0;
			assert A1.Q42(new int[][] {	{ 1, 2, 3 },
										{ 4, 5, 6 }}, 2) == 7;
			assert A1.Q42(new int[][] {	{ 1, 2 },
										{ 3 },
										{ 4, 5, 6 }}, 2) == 7;
			assert A1.Q42(new int[][] {	{ -1, 2 },
										{ -3, 4}} , 1) == -4;
			assert A1.Q42(new int[][] {	{ -1, 2 },
										{ -3, 4}} , 0) == 0;
			System.out.println("Q42 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q42 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q42 test failed - Exception");
		}

		// ---------- Q43 ----------
		try {
			assert A1.Q43(new int[][] {	{ 1, 2 },
										{ 3, 4}}) == 4;
			assert A1.Q43(new int[][] {	{ 1, 46, 25 },
										{ 7, 10, 6 },
										{ 5, 3, 9 }}) == 46;
			assert A1.Q43(new int[][] {	{ 1, 2, 3 },
										{ 4, 5, 6 }}) == 6;
			assert A1.Q43(new int[][] {	{ 1, 2 },
										{ 3 },
										{ 4, 25, 6 }}) == 25;
			assert A1.Q43(new int[][] {	{ -52, -100 },
										{ -31, -25}}) == -25;
			assert A1.Q43(new int[][] {	{ },
										{ }}) == 0;
			System.out.println("Q43 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q43 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q43 test failed - Exception");
		}

		// ---------- Q44 ----------
		try {
			assert A1.Q44(new int[][] {	{ 1, 46, 25 },
										{ 7, 10, 6 },
										{ 5, 3, 9 }}) == 20;
			assert A1.Q44(new int[][] {	{ 10 }}) == 10;
			assert A1.Q44(new int[][] {	{ 1, 46, 25 },
										{ 7 },
										{ 5, 3 }}) == 0;
			assert A1.Q44(new int[][] {	{ 1, 46 },
										{ 7, 10 }}) == 11;
			System.out.println("Q44 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q44 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q44 test failed - Exception");
		}

		// ---------- Q45 ----------
		try {
			assert A1.Q45(new int[][] {	{ 1, 46, 25 },
										{ 7, 10, 6 },
										{ 5, 3, 9 }}) == 40;
			assert A1.Q45(new int[][] {	{ 10 }}) == 10;
			assert A1.Q45(new int[][] {	{ 1, 46, 25 },
										{ 7 },
										{ 5, 3 }}) == 0;
			assert A1.Q45(new int[][] {	{ 1, 46 },
										{ 7, 10 }}) == 53;
			System.out.println("Q45 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q45 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q45 test failed - Exception");
		}

		// ---------- Q46 ----------
		try {
			// Target appears several times
			assert A1.Q46(new int[][]{
					{1, 2, 3},
					{2, 4, 2},
					{5, 2, 6}
			}, 2) == 4;

			// Target does not appear
			assert A1.Q46(new int[][]{
					{1, 2, 3},
					{4, 5, 6}
			}, 10) == 0;

			// Target appears once
			assert A1.Q46(new int[][]{
					{1, 2},
					{3, 4},
					{5, 6}
			}, 4) == 1;

			// Every element is the target
			assert A1.Q46(new int[][]{
					{7, 7},
					{7, 7},
					{7, 7}
			}, 7) == 6;

			// Rows with different lengths
			assert A1.Q46(new int[][]{
					{3},
					{3, 1, 3},
					{2, 3}
			}, 3) == 4;

			// Negative target
			assert A1.Q46(new int[][]{
					{-1, -2, -1},
					{3, -1},
					{-4, -5}
			}, -1) == 3;

			// Zero as the target
			assert A1.Q46(new int[][]{
					{0, 1, 0},
					{2, 0},
					{0}
			}, 0) == 4;

			// Empty rows
			assert A1.Q46(new int[][]{
					{},
					{1, 2, 1},
					{}
			}, 1) == 2;

			// Empty grid
			assert A1.Q46(new int[][]{}, 5) == 0;

			// One element
			assert A1.Q46(new int[][]{
					{9}
			}, 9) == 1;

			System.out.println("Q46 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q46 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q46 test failed - Exception");
		}

		// ---------- Q47 ----------
		try {
			// Normal rectangular grid
			assert Arrays.equals(
					A1.Q47(new int[][]{
							{1, 2, 3},
							{4, 5, 6},
							{7, 8, 9}
					}),
					new int[]{6, 15, 24}
			);

			// Rows with different lengths
			assert Arrays.equals(
					A1.Q47(new int[][]{
							{1, 2},
							{3, 4, 5},
							{6}
					}),
					new int[]{3, 12, 6}
			);

			// Negative values
			assert Arrays.equals(
					A1.Q47(new int[][]{
							{-1, -2, -3},
							{-4, 10},
							{-5}
					}),
					new int[]{-6, 6, -5}
			);

			// Positive and negative values
			assert Arrays.equals(
					A1.Q47(new int[][]{
							{5, -2, 3},
							{-10, 4, 6},
							{0, 0, 1}
					}),
					new int[]{6, 0, 1}
			);

			// One row
			assert Arrays.equals(
					A1.Q47(new int[][]{
							{10, 20, 30}
					}),
					new int[]{60}
			);

			// One element in each row
			assert Arrays.equals(
					A1.Q47(new int[][]{
							{5},
							{-3},
							{10}
					}),
					new int[]{5, -3, 10}
			);

			// Empty row should have a sum of 0
			assert Arrays.equals(
					A1.Q47(new int[][]{
							{},
							{1, 2, 3},
							{}
					}),
					new int[]{0, 6, 0}
			);

			// All zeroes
			assert Arrays.equals(
					A1.Q47(new int[][]{
							{0, 0},
							{0, 0, 0}
					}),
					new int[]{0, 0}
			);

			// Empty grid
			assert Arrays.equals(
					A1.Q47(new int[][]{}),
					new int[]{}
			);

			System.out.println("Q47 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q47 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q47 test failed - Exception");
		}

		// ---------- Q48 ----------
		try {
			// Normal rectangular grid
			assert Arrays.equals(
					A1.Q48(new int[][]{
							{1, 2, 3},
							{4, 9, 6},
							{7, 8, 5}
					}),
					new int[]{3, 9, 8}
			);

			// Rows with different lengths
			assert Arrays.equals(
					A1.Q48(new int[][]{
							{1, 5},
							{3, 4, 9, 2},
							{6}
					}),
					new int[]{5, 9, 6}
			);

			// All negative values
			assert Arrays.equals(
					A1.Q48(new int[][]{
							{-8, -3, -10},
							{-20, -5},
							{-1, -7}
					}),
					new int[]{-3, -5, -1}
			);

			// One row
			assert Arrays.equals(
					A1.Q48(new int[][]{
							{10, 50, 30, 20}
					}),
					new int[]{50}
			);

			// One element in each row
			assert Arrays.equals(
					A1.Q48(new int[][]{
							{4},
							{-2},
							{9}
					}),
					new int[]{4, -2, 9}
			);

			// Duplicate largest values
			assert Arrays.equals(
					A1.Q48(new int[][]{
							{5, 5, 2},
							{8, 1, 8},
							{3, 3, 3}
					}),
					new int[]{5, 8, 3}
			);

			// Values containing zero
			assert Arrays.equals(
					A1.Q48(new int[][]{
							{-5, 0, -2},
							{0, 0, 0},
							{-10, -1, -4}
					}),
					new int[]{0, 0, -1}
			);

			// Empty grid
			assert Arrays.equals(
					A1.Q48(new int[][]{}),
					new int[]{}
			);

			System.out.println("Q48 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q48 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q48 test failed - Exception");
		}

		// ---------- Q49 ----------
		try {
			// 2 rows × 3 columns becomes 3 rows × 2 columns
			assert Arrays.deepEquals(
					A1.Q49(new int[][]{
							{1, 2, 3},
							{4, 5, 6}
					}),
					new int[][]{
							{1, 4},
							{2, 5},
							{3, 6}
					}
			);

			// 3 rows × 2 columns becomes 2 rows × 3 columns
			assert Arrays.deepEquals(
					A1.Q49(new int[][]{
							{1, 2},
							{3, 4},
							{5, 6}
					}),
					new int[][]{
							{1, 3, 5},
							{2, 4, 6}
					}
			);

			// Square grid
			assert Arrays.deepEquals(
					A1.Q49(new int[][]{
							{1, 2, 3},
							{4, 5, 6},
							{7, 8, 9}
					}),
					new int[][]{
							{1, 4, 7},
							{2, 5, 8},
							{3, 6, 9}
					}
			);

			// One row becomes one column
			assert Arrays.deepEquals(
					A1.Q49(new int[][]{
							{10, 20, 30}
					}),
					new int[][]{
							{10},
							{20},
							{30}
					}
			);

			// One column becomes one row
			assert Arrays.deepEquals(
					A1.Q49(new int[][]{
							{10},
							{20},
							{30}
					}),
					new int[][]{
							{10, 20, 30}
					}
			);

			// One element
			assert Arrays.deepEquals(
					A1.Q49(new int[][]{
							{5}
					}),
					new int[][]{
							{5}
					}
			);

			// Negative values and zero
			assert Arrays.deepEquals(
					A1.Q49(new int[][]{
							{-1, 0},
							{2, -3}
					}),
					new int[][]{
							{-1, 2},
							{0, -3}
					}
			);

			System.out.println("Q49 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q49 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q49 test failed - Exception");
		}

		// ---------- Q50 ----------
		try {
			assert A1.Q50(new int[][] {	{ 1, 46, 25 },
										{ 7, 10, 6 },
										{ 5, 3, 9 }});
			assert A1.Q50(new int[][] {	{ 10 }});
			assert !A1.Q50(new int[][] {{1, 2, 3},
										{4, 5, 6},
										{7, 8}});
			assert A1.Q50(new int[][] {	{ 1, 46, 19 },
										{ 7, 10, 20 }});
			assert !A1.Q50(new int[][] {{ },
										{ 7, 10 }});
			assert A1.Q50(new int[][] {	{ },
										{ },
										{ }});
			System.out.println("Q50 test passed");
			score += 1;
		} catch (AssertionError ex) {
			System.out.println("Q50 test failed - AssertionError");
		} catch (Exception ex) {
			System.out.println("Q50 test failed - Exception");
		}

		System.out.println("~~~ End of Main() ~~~");
		System.out.println("Total Score: " + score + " / 50");
	}
}