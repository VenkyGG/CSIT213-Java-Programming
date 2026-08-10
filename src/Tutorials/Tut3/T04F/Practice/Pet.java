package Tutorials.Tut3.T04F.Practice;

public class Pet {
    private String name;
    private String breed;
    private double weight;

    public Pet(String name, String breed, double weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    public void setName(String name) { this.name = name; }

    public String getName() { return this.name; }

    public double getWeight() { return this.weight; }

    public void display() {
        System.out.println(toString() + "}");
    }

    @Override
    public String toString() {
        return String.format("%s {name: {%s} breed: {%s} weight: {%.2f}", getClass(), this.name, this.breed, this.weight);
    }

    public void sound() {
        System.out.println(name + " make no sound.");
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food + ".");
    }
}
