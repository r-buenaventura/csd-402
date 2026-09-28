// Roxanne Buenaventura
// CSD 402
// Module 9.2 Assignment
// 27 September 2026

import java.util.ArrayList;
import java.util.Scanner;

public class RoxanneArrayList {

    public static void main(String[] args) {

        // Creates an ArrayList to store the names of ten coffee drinks.
        ArrayList<String> drinks = new ArrayList<String>();

        // Adds each coffee drink to the ArrayList.
        drinks.add("Latte");
        drinks.add("Cappuccino");
        drinks.add("Americano");
        drinks.add("Mocha");
        drinks.add("Drip Coffee");
        drinks.add("Pour Over");
        drinks.add("Hot Tea");
        drinks.add("Iced Tea");
        drinks.add("Chai Latte");
        drinks.add("Iced Latte");

        // Uses a for-each loop to display each drink in the ArrayList.
        for (String drink : drinks) {
        System.out.println(drink);
        }

        // Creates a Scanner to receive input from the user.
        Scanner input = new Scanner(System.in);

        // Asks the user which ArrayList element they would like to see again.
        System.out.print("Enter the index of the drink you would like to see again (0-9): ");
        String userInput = input.nextLine();

    // Attempts to convert the user's input and retrieve the selected element.
    try {
        // Converts the user's String input into an Integer object.
        Integer selectedIndex = Integer.valueOf(userInput);

        // Auto-unboxes the Integer object into a primitive int.
        int index = selectedIndex;

        // Autoboxes the primitive int back into an Integer object.
        Integer boxedIndex = index;

        // Displays the element at the user's selected index.
        System.out.println("Selected drink: " + drinks.get(boxedIndex));

        } catch (IndexOutOfBoundsException e) {
            // Displays a message if the index is outside the ArrayList.
            System.out.println("Exception thrown: Out of Bounds");

        } catch (NumberFormatException e) {
            // Displays a message if the user enters something other than an integer.
            System.out.println("Invalid input. Please enter a number.");
        }

        // Closes the Scanner after user input is complete.
        input.close();

    }
}
