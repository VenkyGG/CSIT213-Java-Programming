package Lectures.Lec7.AboutCompare;

public class AboutInterfaceAndSorting {
    public static void main(String[] argv){
        int[] data = {80, 30, 50, 70, 20, 10};
        sortNumber(data);
        for (int value : data)
            System.out.print(value + " ");
        System.out.println();

        Rectangle[] rects = { new Rectangle(50, 40), new Rectangle(20, 10), new Rectangle(5, 1) };
        sortAll(rects, new RectCompare());

        Fraction[] fracts = { new Fraction(1, 2), new Fraction(1, 3), new Fraction(1, 4) };
        sortAll(fracts, new FracCompare());

        // Verify Results
        for (Rectangle r : rects) {
            System.out.println(r);
        }

        for (Fraction f : fracts) {
            System.out.println(f);
        }
    }

    public static void sortAll(Object[] data, ICompare comp) {
        // Bubble sort
        for (int i = 0; i < data.length - 1; i++ ){
            for (int curr = 0; curr < data.length - 1; curr++){
                if (comp.compare(data[curr], data[curr + 1])){
                    Object temp = data[curr];
                    data[curr] = data[curr+1];
                    data[curr+1] = temp;
                }
            }
        }
    }

    public static void sortNumber(int[] data){
        // Bubble sort
        for (int i = 0; i < data.length - 1; i++ ){
            for (int curr = 0; curr < data.length - 1; curr++){
                if (data[curr] > data[curr+1]){
                    int temp = data[curr];
                    data[curr] = data[curr+1];
                    data[curr+1] = temp;
                }
            }
        }
    }
}
