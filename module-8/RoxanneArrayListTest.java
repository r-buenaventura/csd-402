/* Roxanne Buenaventurea
CSD 402
Module 8.2 Programming Assignment */

import java.util.ArrayList;
import java.util.Scanner;

public class RoxanneArrayListTest {
    
    public static void main(String[] args) {
        // Create an ArrayList to store the integers entered by the user
        ArrayList<Integer> numbers = new ArrayList<>();
        // Create a Scanner to read user input
        Scanner input = new Scanner(System.in);
        int number = 0;
        // Give instructions to user on how to enter values
        System.out.println("Enter integers to add to the list.");
        System.out.println("Enter 0 when you are finished.");
        // Continue accepting integers until the user enters 0
        do {
            System.out.print("Enter an integer: ");
            number = input.nextInt();
            numbers.add(number);
        } while (number != 0);
        // Call the max method and display the largest value
        Integer largest = max(numbers);
        System.out.println("The largest value is: " + largest);
        // Close Scanner
        input.close();
    }
    // Returns the largest integer stored in the ArrayList
    public static Integer max(ArrayList list) {
        // Return 0 if the ArrayList is empty
        if (list.isEmpty()) {
            return 0;
        }
        // Use the first value as the initial largest value
        Integer largest = (Integer) list.get(0);
        // Compare each value in the list to the current largest value
        for (int i = 0; i < list.size(); i++) {
            if ((Integer) list.get(i) > largest) {
                largest = (Integer) list.get(i);
            }
        }
    // Return the largest value found
    return largest;
    }
}
