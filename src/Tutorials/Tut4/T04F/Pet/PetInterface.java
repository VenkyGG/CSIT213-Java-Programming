package Tutorials.Tut4.T04F.Pet;

public interface PetInterface {
    // Method declaration in interface are all abstract by default
    public void display();

    public void sound();

    public void eat();

    public void eat(String food);
}
