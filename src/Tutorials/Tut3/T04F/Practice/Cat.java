package Tutorials.Tut3.T04F.Practice;

public class Cat extends Pet {

    public Cat(String name, String breed, double weight) {
        super(name, breed, weight);
    }

    @Override
    public void sound() { System.out.println(this.getName() + ": meow."); }
}
