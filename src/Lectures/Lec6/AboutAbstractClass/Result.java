package Lectures.Lec6.AboutAbstractClass;

public abstract class Result {
    public String test, candidate;

    public Result(String test, String candidate) {
        this.test = test;
        this.candidate = candidate;
    }

    public String getTest() { return test; }

    public String getCandidate() { return candidate; }

    public abstract double getFinalScore();

    public String getGrade() {
        double finalScore = getFinalScore();

        if (finalScore >= 50)
            return "Pass";
        else
            return "Fail";
    }

    public String toString() {
        String className = this.getClass().getSimpleName();

        return String.format("%s %s %s %.1f %s", className, test, candidate, getFinalScore(), getGrade());
    }
}
