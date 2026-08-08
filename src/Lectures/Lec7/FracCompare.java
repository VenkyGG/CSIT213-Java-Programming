package Lectures.Lec7;

public class FracCompare implements ICompare {
    @Override
    public boolean compare(Object obj1, Object obj2) {
        Fraction frac1 = (Fraction) obj1;
        Fraction frac2 = (Fraction) obj2;

        if (frac1.getRatio() > frac2.getRatio())
            return true;

        return false;
    }
}
