package Tutorials.Tut3.T04F.Practice;

public class Dog extends Pet {
    private boolean microchipped;

    public Dog(String name, String breed, double weight, boolean microchipped) {
        super(name, breed, weight);
        this.microchipped = microchipped;
    }

    @Override
    public void sound() { System.out.println(this.getName() + ": woof woof."); }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("Cookies")) {
            System.out.println(this.getName() + "is eating " + food + ".");
        }
        else {
            System.out.println(this.getName() + " does not eat " + food + ".");
        }
    }

    public void eat() {
        System.out.println(this.getName() + "is eating cookies.");
    }

    @Override
    public String toString() {
        return super.toString() + " {microchipped: " + this.microchipped + "}";
    }
}
