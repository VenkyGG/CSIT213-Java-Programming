package Lectures.Lec6.AboutAbstractClass;

/**
 * There are 2 papers
 * Paper 1 Weighting is 40%
 * Paper 2 Weighting is 60%
 */
public class WrittenResult extends Result {
    private static double P1_WEIGHT = 0.4;
    private static double P2_WEIGHT = 0.6;

    private double score1, score2;

    public WrittenResult(String test, String candidate, double score1, double score2) {
        super(test, candidate);
        this.score1 = score1;
        this.score2 = score2;
    }

    @Override
    public double getFinalScore() {
        return (score1 * 0.4) + (score2 * 0.6);
    }
}
