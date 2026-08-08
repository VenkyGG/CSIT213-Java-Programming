package Lectures.Lec7;

public class RectCompare implements ICompare {
    public boolean compare(Object obj1, Object obj2) {
        Rectangle r1 = (Rectangle) obj1;
        Rectangle r2 = (Rectangle) obj2;

        if (r1.getArea() > r2.getArea())
            return true;

        return false;
    }
}

