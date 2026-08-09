package Tutorials.Tut4.T04F.Practice;

public class Dog extends Pet implements PetInterface {
    private boolean microchipped;

    public Dog(String name, String breed, double weight, boolean microchipped) {
        super(name, breed, weight);
        this.microchipped = microchipped;
    }

    @Override
    public void sound() {
        System.out.println(this.name + ": Woof woof.");
    }

    @Override
    public void eat() {
        System.out.println(this.name + " is eating cookies.");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("cookies")) {
            System.out.println(this.name + " is eating " + food + ".");
        }
        else {
            System.out.println(this.name + " does not eat " + food + ".");
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Microchipped: " + this.microchipped);
    }
}
