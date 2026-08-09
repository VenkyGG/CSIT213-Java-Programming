package Tutorials.Tut1.T04F.Practice.Part2.Q3;

public class Car {
    private Engine engine;
    private Wheel[] wheels;

    public Car(String engineName, int power, int numOfWheels, int wheelSize)
    {
        this.engine = new Engine(engineName, power);
        wheels = new Wheel[numOfWheels];

        for (int i = 0; i < wheels.length; i++)
        {
            Wheel newWheel = new Wheel(wheelSize);
            wheels[i] = newWheel;
        }
    }

    public void display() {
        System.out.println("Car information: ");
        this.engine.display();

        for (Wheel wheel : this.wheels) {
            wheel.display();
        }
    }
}
