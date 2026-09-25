package ExamPrac;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) {
        Scanner reader = null;
        try {
            reader = new Scanner(new File(""));
            while(reader.hasNextLine()) {
                // Do stuff here
                String oneLine = reader.nextLine(); // Gets the next line and parse as string
            }
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found!");
        }
        finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}
