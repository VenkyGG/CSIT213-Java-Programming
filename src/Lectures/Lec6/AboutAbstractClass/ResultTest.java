package Lectures.Lec6.AboutAbstractClass;

public class ResultTest {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        OralResult r1 = new OralResult("test 1", "c1", 60, 60, 60);
        System.out.println(r1.getFinalScore());
        System.out.println(r1.getGrade());
        System.out.println(r1);

        WrittenResult r2 = new WrittenResult("test 2", "c1", 50, 70);
        System.out.println(r2.getFinalScore());
        System.out.println(r2.getGrade());
        System.out.println(r2);
    }
}
