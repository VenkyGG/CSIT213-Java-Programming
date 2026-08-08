package Lectures.Lec2;

public class TestResult {
    private String id;
    private double paper1, paper2;
    private static double p1Weighting = 0.3;
    private static double p2Weighting = 0.7;

    public TestResult(String sId, double score1, double score2) {
        this.id = sId;
        paper1 = score1;
        paper2 = score2;
    }

    public double getOverallScore() {
        return paper1 * p1Weighting + paper2 * p2Weighting;
    }

    public String getGrade() {
        double finalScore = getOverallScore();

        if (finalScore >= 50) {
            return "Pass";
        }
        else {
            return "Fail";
        }
    }

    public String toString() {
        return String.format("TestResult: %s %.2f %.2f %.2f %s", id, paper1, paper2,
                             getOverallScore(),
                             getGrade());
    }

    public static double getP1Weighting() { return p1Weighting; }

    public static double getP2Weighting() { return p2Weighting; }

    public static void setWeightings(double pw1, double pw2) {
        if (pw1 + pw2 == 1) {
            p1Weighting = pw1;
            p2Weighting = pw2;
        }

        p1Weighting = pw1;
        p2Weighting = pw2;
    }
}
