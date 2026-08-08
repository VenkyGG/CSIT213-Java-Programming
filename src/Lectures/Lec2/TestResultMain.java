package Lectures.Lec2;

public class TestResultMain {
    public static void main(String[] args) {
        System.out.println(TestResult.getP1Weighting());

        TestResult tr1 = new TestResult("s1", 50, 50);
        TestResult tr2 = new TestResult("s2", 30, 80);

        // Calling instance methods
        System.out.println(tr1.getOverallScore());
        System.out.println(tr2.getOverallScore());

        // Printing instances
        System.out.println(tr1);
        System.out.println(tr2);

        // Change the weightings
        TestResult.setWeightings(0.4, 0.6);
        System.out.println(TestResult.getP1Weighting());
        System.out.println(TestResult.getP2Weighting());

        // Printing instances
        System.out.println(tr1);
        System.out.println(tr2);
    }
}
