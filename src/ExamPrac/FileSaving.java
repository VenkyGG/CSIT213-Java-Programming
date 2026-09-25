package ExamPrac;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileSaving {
    private static String fileToSave = "data/prac_save.txt";

    public static void main(String[] args) {
        PrintWriter writer = null;

        try {
            writer = new PrintWriter(new File(fileToSave));

            for (int i = 0; i < 100; i++) {
                writer.append("hiiii " + i + "\n");
            }
        }
        catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}
