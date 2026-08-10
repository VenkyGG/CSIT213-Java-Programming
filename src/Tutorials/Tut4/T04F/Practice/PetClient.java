package Tutorials.Tut4.T04F.Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PetClient {
    public static void main(String[] args) {
        try {
            run("data/lab_4_pet_data.csv");
        } catch (FileNotFoundException ex) {
            System.out.println("Data file not found.");
        }
    }

    private static void run(String filename) throws FileNotFoundException {
        Scanner file = new Scanner(new File(filename));

        ArrayList<PetInterface> pets = new ArrayList<>();

        while(file.hasNextLine()) {
            String line = file.nextLine();
            String[] data = line.split(",");

            String type = data[0].strip();
            String name = data[1].strip();
            String breed = data[2].strip();
            double weight = Double.parseDouble(data[3].strip());

            PetInterface pet = null;

            if (type.equalsIgnoreCase("Dog")) {
                boolean chip = Boolean.parseBoolean(data[4].strip());
                // Dog has implemented PetInterface, so it can be assigned to pet which is of a type PetInterface.
                pet = new Dog(name, breed, weight, chip);
            }
            else if (type.equalsIgnoreCase("Cat")) {
                pet = new Cat(name, breed, weight);
            }

            pets.add(pet);
        }

        for (PetInterface p : pets) {
            p.display();
            p.sound();
            p.eat();
            p.eat("fish");
            p.eat("cookies");
        }
    }
}
