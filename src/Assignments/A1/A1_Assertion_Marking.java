package Assignments.A1;

import java.util.ArrayList;
import java.util.Arrays;

public class A1_Assertion_Marking {

	public static void main(String[] args) {

		int score = 0;

		// ---------- Q1 ----------
		try {
			int[] nums = {1,2,3,4};
			assert A1.Q1(nums) == 4;
			System.out.println("Q1 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q1 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q1 test failed - Exception");
		}

		

		// ---------- Q2 ----------
		try {
			int[] nums = {3,7,2,9,4};
			assert A1.Q2(nums) == 9;
			System.out.println("Q2 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q2 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q2 test failed - Exception");
		}

		// ---------- Q3 ----------
		try {
			int[] nums = {1,2,3};
			assert Arrays.equals(A1.Q3(nums), new int[]{3,2,1});
			System.out.println("Q3 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q3 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q3 test failed - Exception");
		}

		// ---------- Q4 ----------
		try {
			int[] nums = {4,8,15,16};
			assert A1.Q4(nums, 15) == 2;
			assert A1.Q4(nums, 99) == -1;
			System.out.println("Q4 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q4 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q4 test failed - Exception");
		}

		

		// ---------- Q5 ----------
		try {
			int[] nums = {1,2,3,4};
			assert A1.Q5(nums) == 24;
			System.out.println("Q5 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q5 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q5 test failed - Exception");
		}

		// ---------- Q6 ----------
		try {
			int[] nums = {1,2,2,3,2};
			assert A1.Q6(nums, 2) == 3;
			System.out.println("Q6 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q6 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q6 test failed - Exception");
		}

		// ---------- Q7 ----------
		try {
			int[] nums = {1,2,3};
			assert Arrays.equals(A1.Q7(nums), new int[]{2,4,6});
			System.out.println("Q7 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q7 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q7 test failed - Exception");
		}

		// ---------- Q8 ----------
		try {
			int[] nums = {4,1,7,3};
			assert A1.Q8(nums) == 4;
			System.out.println("Q8 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q8 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q8 test failed - Exception");
		}

		// ---------- Q9 ----------
		try {
			int[] nums = {3,7,2,9};
			assert A1.Q9(nums) == 7;
			System.out.println("Q9 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q9 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q9 test failed - Exception");
		}

		// ---------- Q10 ----------
		try {
			int[] nums = {3,1,2};
			assert Arrays.equals(A1.Q10(nums), new int[]{1,2,3});
			System.out.println("Q10 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q10 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q10 test failed - Exception");
		}

		// ---------- Q11 ----------
		try {
			int[] nums = {1,2,2,3,3,3};
			assert A1.Q11(nums) == 3;
			System.out.println("Q11 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q11 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q11 test failed - Exception");
		}


		// ---------- Q12 ----------
		try {
			int[] nums = {1,2,3,4};
			assert Arrays.equals(A1.Q12(nums), new int[]{4,1,2,3});
			System.out.println("Q12 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q12 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q12 test failed - Exception");
		}

		// ---------- Q13 ----------
		try {
			assert A1.Q13("hello world") == 3;
			System.out.println("Q13 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q13 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q13 test failed - Exception");
		}

		// ---------- Q14 ----------
		try {
			assert A1.Q14("abc").equals("cba");
			System.out.println("Q14 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q14 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q14 test failed - Exception");
		}

		// ---------- Q15 ----------
		try {
			assert A1.Q15("racecar") == true;
			assert A1.Q15("hello") == false;
			System.out.println("Q15 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q15 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q15 test failed - Exception");
		}


		// ---------- Q16 ----------
		try {
			assert A1.Q16("a b c").equals("a_b_c");
			System.out.println("Q16 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q16 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q16 test failed - Exception");
		}

		// ---------- Q17 ----------
		try {
			assert A1.Q17("Hello World") == 2;
			System.out.println("Q17 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q17 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q17 test failed - Exception");
		}

		// ---------- Q18 ----------
		try {
			assert A1.Q18("hello").equals("hll");
			System.out.println("Q18 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q18 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q18 test failed - Exception");
		}

		// ---------- Q19 ----------
		try {
			assert A1.Q19("listen", "silent") == true;
			assert A1.Q19("hello", "world") == false;
			System.out.println("Q19 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q19 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q27 test failed - Exception");
		}

		// ---------- Q20 ----------
		try {
			assert A1.Q20("swiss") == 'w';
			System.out.println("Q20 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q20 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q20 test failed - Exception");
		}

		// ---------- Q21 ----------
		try {
			assert A1.Q21("hello world").equals("Hello World");
			System.out.println("Q21 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q21 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q21 test failed - Exception");
		}


		// ---------- Q22 ----------
		try {
			assert A1.Q22("aabbbc") == 'b';
			System.out.println("Q22 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q22 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q22 test failed - Exception");
		}

		// ---------- Q23 ----------
		try {
			assert A1.Q23("ababab", "ab") == 3;
			System.out.println("Q23 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q23 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q23 test failed - Exception");
		}

		// ---------- Q24 ----------
		try {
			assert A1.Q24("12345") == true;
			assert A1.Q24("12a45") == false;
			System.out.println("Q24 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q24 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q24 test failed - Exception");
		}

		// ---------- Q25 ----------
		try {
			assert A1.Q25("banana").equals("ban");
			System.out.println("Q25 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q25 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q25 test failed - Exception");
		}

		// ---------- Q26 ----------
		try {
			assert A1.Q26(7) == true;
			assert A1.Q26(8) == false;
			System.out.println("Q26 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q26 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q26 test failed - Exception");
		}

		// ---------- Q27 ----------
		try {
			assert A1.Q27(5) == 120;
			System.out.println("Q27 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q27 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q27 test failed - Exception");
		}

		// ---------- Q28 ----------
		try {
			assert A1.Q28(7) == 13;
			System.out.println("Q28 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q28 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q28 test failed - Exception");
		}

		// ---------- Q29 ----------
		try {
			assert A1.Q29(1234) == 10;
			System.out.println("Q29 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q29 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q29 test failed - Exception");
		}

		// ---------- Q30 ----------
		try {
			assert A1.Q30(9876) == 4;
			System.out.println("Q39 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q30 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q30 test failed - Exception");
		}

		// ---------- Q31 ----------
		try {
			assert A1.Q31(1234) == 4321;
			System.out.println("Q31 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q31 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q31 test failed - Exception");
		}

		// ---------- Q32 ----------
		try {
			assert A1.Q32(2000) == true;
			assert A1.Q32(1900) == false;
			assert A1.Q32(2024) == true;
			assert A1.Q32(2023) == false;
			System.out.println("Q32 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q32 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q32 test failed - Exception");
		}

		// ---------- Q33 ----------
		try {
			assert A1.Q33(48, 18) == 6;
			System.out.println("Q33 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q33 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q33 test failed - Exception");
		}


		// ---------- Q34 ----------
		try {
			assert A1.Q34(10) == 3;
			System.out.println("Q34 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q34 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q34 test failed - Exception");
		}

		// ---------- Q35 ----------
		try {
			int[] nums = {1,2,3,4,5,6};
			assert A1.Q35(nums).equals(Arrays.asList(2,4,6));
			System.out.println("Q35 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q35 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q35 test failed - Exception");
		}

		// ---------- Q36 ----------
		try {
			ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
			assert A1.Q36(list) == 10;
			System.out.println("Q36 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q36 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q36 test failed - Exception");
		}

		// ---------- Q37 ----------
		try {
			ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,2,3,1));
			assert A1.Q37(list).equals(Arrays.asList(1,2,3));
			System.out.println("Q37 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q37 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q37 test failed - Exception");
		}

		// ---------- Q38 ----------
		try {
			ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,5,3,8,2));
			assert A1.Q38(list, 3).equals(Arrays.asList(5,8));
			System.out.println("Q38 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q38 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q38 test failed - Exception");
		}

		// ---------- Q39 ----------
		try {
			ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(3,9,2,7));
			assert A1.Q39(list) == 9;
			System.out.println("Q39 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q39 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q39 test failed - Exception");
		}

		// ---------- Q40 ----------
		try {
			int[][] grid = {{1,2},{3,4}};
			assert A1.Q40(grid) == 10;
			System.out.println("Q40 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q40 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q40 test failed - Exception");
		}
		// ---------- Q41 ----------
		try {
			int[][] grid = {{1,2,3},{4,5,6}};
			assert A1.Q41(grid, 1) == 15;
			System.out.println("Q41 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q41 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q41 test failed - Exception");
		}

		// ---------- Q42 ----------
		try {
			int[][] grid = {{1,2,3},{4,5,6}};
			assert A1.Q42(grid, 0) == 5;
			System.out.println("Q42 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q42 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q42 test failed - Exception");
		}

		// ---------- Q43 ----------
		try {
			int[][] grid = {{1,9,3},{4,5,2}};
			assert A1.Q43(grid) == 9;
			System.out.println("Q43 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q43 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q43 test failed - Exception");
		}

		// ---------- Q44 ----------
		try {
			int[][] grid = {{1,2,3},{4,5,6},{7,8,10}};
			assert A1.Q44(grid) == 16;
			System.out.println("Q44 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q44 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q44 test failed - Exception");
		}

		// ---------- Q45 ----------
		try {
			int[][] grid = {{1,2,3},{4,5,6},{7,8,10}};
			assert A1.Q45(grid) == 15;
			System.out.println("Q45 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q45 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q45 test failed - Exception");
		}

		// ---------- Q46 ----------
		try {
			int[][] grid = {{1,2,2},{2,3,2}};
			assert A1.Q46(grid, 2) == 4;
			System.out.println("Q46 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q46 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q46 test failed - Exception");
		}

		// ---------- Q47 ----------
		try {
			int[][] grid = {{1,2,3},{4,5,6}};
			assert Arrays.equals(A1.Q47(grid), new int[]{6,15});
			System.out.println("Q47 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q47 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q47 test failed - Exception");
		}

		// ---------- Q48 ----------
		try {
			int[][] grid = {{1,9,3},{8,5,2}};
			assert Arrays.equals(A1.Q48(grid), new int[]{9,8});
			System.out.println("Q48 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q48 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q48 test failed - Exception");
		}

		// ---------- Q49 ----------
		try {
			int[][] grid = {{1,2,3},{4,5,6}};
			assert Arrays.deepEquals(A1.Q49(grid), new int[][]{{1,4},{2,5},{3,6}});
			System.out.println("Q49 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q49 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q49 test failed - Exception");
		}

		// ---------- Q50 ----------
		try {
			int[][] rectangular = {{1,2},{3,4}};
			int[][] jagged = {{1,2},{3}};
			assert A1.Q50(rectangular) == true;
			assert A1.Q50(jagged) == false;
			System.out.println("Q50 test passed");
			score+=1;
		}catch(AssertionError ex) {
			System.out.println("Q50 test failed - AssertionError");
		}catch(Exception ex) {
			System.out.println("Q50 test failed - Exception");
		}


		System.out.println("Score:"+score);
	}

}
