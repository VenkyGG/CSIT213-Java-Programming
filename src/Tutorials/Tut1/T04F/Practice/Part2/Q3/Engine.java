package Tutorials.Tut1.T04F.Practice.Part2.Q3;

public class Engine
{
    private String name;
    private int power;

    public Engine(String name, int power)
    {
        this.name = name;
        this.power = power;
    }

    public void display()
    {
        System.out.println("Dump.Engine: " + name);
        System.out.println("Power: " + power + "hp");
    }
}
