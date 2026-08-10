package Tutorials.Tut3.T04F.Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class PetTest {
    public static void main(String[] args) {
        //test();
        readFromFile();
    }

    private static void readFromFile() {
        ArrayList<Pet> pets = new ArrayList<Pet>();

        try {
            Scanner file = new Scanner(new File("data/lab_3_pet_data.csv"));

            while (file.hasNextLine()) {
                String dataLine = file.nextLine().trim();
                System.out.println(dataLine);

                String[] data = dataLine.split(",");

                String type = data[0];
                String name = data[1];
                String breed = data[2];
                double weight = Double.parseDouble(data[3].trim());

                Pet pet = null;

                if (type.equalsIgnoreCase("Dog")) {
                    boolean chip = Boolean.parseBoolean(data[4].trim());
                    pet = new Dog(name, breed, weight, chip);
                }
                else {
                    pet = new Cat(name, breed, weight);
                }

                pets.add(pet);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        for (Pet p : pets) {
            System.out.println();
            p.display();
            p.sound();
            p.eat("cookies");

            if (p instanceof Dog) {
                ((Dog) p).eat();
            }
        }
    }

    public static void test() {
        ArrayList<Pet> pets = new ArrayList<Pet>();
        Dog dog1 = new Dog("Snoopy", "Beagle", 23, true);
        Dog dog2 = new Dog("Goofy", "Great Dane", 70, false);
        Cat cat1 = new Cat("Garfield", "Orange Tabby", 27);
        Cat cat2 = new Cat("Hello Kitty", "Japan", 5);

        // Child class can be added into the parent class ArrayList
        pets.add(dog1);
        pets.add(dog2);
        pets.add(cat1);
        pets.add(cat2);

        // Runs display(), sound() and eat()
        for (Pet p : pets) {
            System.out.println();
            p.display();
            p.sound();
            p.eat("cookies");

            if (p instanceof Dog) {
                ((Dog) p).eat();
            }
        }
    }

    public static void archive() {
        Pet pet = new Pet("Snoopy", "Beagle", 23);
        pet.display();
        pet.sound();
        pet.eat("bones");

        Dog dog = new Dog("Snoopy", "Beagle", 23, true);
        dog.sound();
        dog.eat();
        dog.eat("bones");
        dog.eat("cookies");
        dog.display();


        Cat cat = new Cat("Garfield", "Orange Tabby", 27);
        cat.sound();
        cat.eat("fish");
        cat.display();
    }
}
