package ExamPrac;

public class ArrayTest {
    public static void main(String[] args) {
        int[] a1;
        int[] a2 = new int[3];
        int[] a3 = a2;

        a2[0] = 1;

        StringBuilder x = new StringBuilder("[");
        for (int i : a2) {
            x.append(i + ", ");
        }
        x.append("]");
        System.out.println(x.toString());
        x.setLength(0);

        x.append("[");
        for (int i : a3) {
            x.append(i + ", ");
        }
        x.append("]");
        System.out.println(x.toString());
        x.setLength(0);
    }
}
