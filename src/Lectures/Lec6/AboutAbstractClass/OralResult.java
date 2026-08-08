package Lectures.Lec6.AboutAbstractClass;

public class OralResult extends Result {
    private double score1, score2, score3;

    public OralResult(String test, String candidate, double score1, double score2, double score3) {
        super(test, candidate);
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    public double getFinalScore() {
        return (score1 + score2 + score3) / 3;
    }
}
