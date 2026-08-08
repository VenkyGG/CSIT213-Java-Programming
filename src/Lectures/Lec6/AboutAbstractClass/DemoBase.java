package Lectures.Lec6.AboutAbstractClass;

public abstract class DemoBase {
    private int value;

    public DemoBase(int value) { this.value = value; }

    public int getValue() { return value; }

    public abstract void doWork();

    public String toString() { return String.format("DemoBase %d", value); }
}
