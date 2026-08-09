package Tutorials.Tut1.T04F.Practice.Part2.Q1;

public class Student {
    private String name;
    private String id;
    private double[] scores;

    public Student(String name, String id, double[] scores)
    {
        this.name = name;
        this.id = id;
        this.scores = scores;
    }

    public void display()
    {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Scores: ");
        for (double score: scores)
        {
            System.out.println(score);
        }
    }

    public String getName()
    {
        return this.name;
    }

    public String getId()
    {
        return this.id;
    }

    public double getGPA()
    {
        int totalValue = 0;

        for (double score: scores) {
            totalValue += getGPAValue(score);
        }

        // int divide by int -> int (drop the decimal places)
        // double divide by int -> double (retain the decimal places)
        double gpa = (totalValue * 1.0) / scores.length;

        return gpa;
    }

    public int getGPAValue(double score)
    {
        int value = 0;

        if (score > 85)
            value = 4;
        else if (score >= 75)
            value = 3;
        else if (score >= 65)
            value = 2;
        else if (score >= 50)
            value = 1;

        return value;
    }

    // For testing
    public static void main(String[] args)
    {
        double[] scores = { 60, 80.5, 90.5, 73 };
        Student s1 = new Student("Peter", "S111", scores);
        s1.display();
        double gpa = s1.getGPA();
        System.out.println("GPA: " + gpa);
    }
}
