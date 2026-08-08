package Lectures.Lec6;

public class LessonTest {
    public static void main(String[] args) {
        //test1();
        //test2();
        test3();
    }

    public static void test3() {
        LabLesson lab1 = new LabLesson("name 1", 3, 100, 50);
        System.out.println(lab1.getTotalFee());

        // Another example
        Lesson l1 = new LabLesson("name 2", 3, 100, 50);
        System.out.println(l1.getTotalFee());
    }

    public static void test2() {
        Lesson l1 = new Lesson("name 1", 3, 100);
        System.out.println(l1.getFacilityFee());

        LabLesson lab1 = new LabLesson("name 2", 3, 100, 50);
        System.out.println(lab1.getFacilityFee());
    }

    public static void test1() {
        Lesson l1 = new Lesson("name 1", 3, 100);
        System.out.println(l1);
    }
}
