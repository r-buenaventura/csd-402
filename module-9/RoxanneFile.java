// Roxanne Buenaventura
// CSD 402
// Module 9.2 Assignment
// 27 September 2026

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RoxanneFile {

    public static void main(String[] args) {

        // Creates a File object representing data.file.
        File file = new File("data.file");

        // Checks whether data.file already exists.
        if (file.exists()) {
            System.out.println("data.file already exists. New numbers will be appended.");
        } else {
            System.out.println("data.file does not exist. A new file will be created.");
        }

        // Attempts to write 10 randomly generated numbers to data.file.
        try {

            // Creates a FileWriter in append mode so existing data is not overwritten.
            FileWriter writer = new FileWriter(file, true);

            // Creates a Random object to generate random integers.
            Random random = new Random();

            // Generates and writes 10 random integers to the file.
            for (int i = 0; i < 10; i++) {
                int number = random.nextInt(100);
                writer.write(number + " ");
            }

            // Closes the FileWriter after all numbers have been written.
            writer.close();

            System.out.println("10 random numbers were added to data.file.");

        } catch (IOException e) {
            // Displays an error message if there is a problem writing to the file.
            System.out.println("An error occurred while writing to the file.");
        }

        // Attempts to reopen data.file and read its contents.
        try {

            // Creates a Scanner to read data from the file.
            Scanner fileReader = new Scanner(file);

            System.out.println("Contents of data.file:");

            // Reads and displays each integer stored in the file.
            while (fileReader.hasNextInt()) {
                int number = fileReader.nextInt();
                System.out.print(number + " ");
            }

            System.out.println();

            // Closes the Scanner after the file has been read.
            fileReader.close();

        } catch (IOException e) {
            // Displays an error message if there is a problem reading the file.
            System.out.println("An error occurred while reading the file.");
        }

    }
}
