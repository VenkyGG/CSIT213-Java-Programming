package Tutorials.Tut4.T04F.Practice;

public class Cat extends Pet implements PetInterface {
    public Cat(String name, String breed, double weight) {
        super(name, breed, weight);
    }

    @Override
    public void sound() {
        System.out.println(this.name + ": Meow meow.");
    }

    @Override
    public void eat() {
        System.out.println("Feed some food to " + this.name + ".");
    }

    @Override
    public void eat(String food) {
        System.out.println(this.name + " is eating " + food + ".");
    }
}
