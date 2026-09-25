package ExamPrac.Q2;

import ExamPrac.Q1.Parcel;

import java.util.ArrayList;

public class Q2Test {
    public static void main(String[] argv) {
        ArrayList<double[]> values = new ArrayList<double[]>();

        // Sample data, ArrayList containing array
        values.add(new double[] { 10 }); // radius
        values.add(new double[] { 10, 5 }); // length and width
        values.add(new double[] { 10, 15 });
        values.add(new double[] { 5 });
        values.add(new double[] { 8 });
        values.add(new double[] { 10, 15 }); // duplicate
        values.add(new double[] { 8 }); // duplicate
        values.add(new double[] { 10, 20 });
        values.add(new double[] { -8 }); //invalid dimension
        values.add(new double[] { -10, 20 }); //invalid dimension
        values.add(new double[] { 10, -20 }); //invalid dimension

        // Write code to create Circle/Rectangle instances based
        // on values, and add to an ArrayList.
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        for (double[] array : values) {
            if (array.length == 1) {
                try {
                    Circle newCircle = new Circle(array[0]);

                    if (!shapes.contains(newCircle)) {
                        shapes.add(newCircle);
                    }
                }
                catch (DimensionException ex) {
                    System.out.println(ex);
                }
            }
            else if (array.length == 2) {
                try {
                    if (array[0] > array[1]) {
                        Rectangle newRect = new Rectangle(array[0], array[1]);

                        if (!shapes.contains(newRect)) {
                            shapes.add(newRect);
                        }
                    }
                    else {
                        Rectangle newRect = new Rectangle(array[1], array[0]);

                        if (!shapes.contains(newRect)) {
                            shapes.add(newRect);
                        }
                    }
                }
                catch (DimensionException ex) {
                    System.out.println(ex);
                }
            }
        }

        // Duplicate instance must not be added to the ArrayList
        // check all shape added without duplicate
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        // Write code to add the total area of all the
        // Circle instances in the ArrayList
        double total = 0;

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                total += shape.getArea();
            }
        }

        System.out.println("total circle area: " + total);
    }
}
