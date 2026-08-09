package Tutorials.Tut4.T04F.Practice;

public abstract class Pet {
    // Protected -> accessible to child class
    //              not accessible to other classes
    protected String name;
    protected String breed;
    protected double weight;

    public Pet(String name, String breed, double weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Breed: " + this.breed);
        System.out.println("Weight: " + this.weight);
    }
}