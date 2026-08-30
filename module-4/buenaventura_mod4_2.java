/* Roxanne Buenaventura
CSD402
Assignment 4.2 */

import java.util.Arrays;

public class buenaventura_mod4_2 {

    // Method to calculate the average of an array of short values
    public static short average(short[] array) {

        // Use long to prevent overflow when summing short values
        long sum = 0;
            
        for (int i =0; i < array.length; i++) {

            sum += array[i];
        }

        // Return the average as a short value        
        return (short) (sum / array.length);
        }
    
    // Method to calculate the average of an array of int values
    public static int average(int[] array) {

        // Use long to prevent overflow when summing int values
        long sum = 0;

        for(int i=0; i < array.length; i++) {

            sum += array[i];

        }

        // Return the average as an int value
        return (int) (sum / array.length);
    }

    // Method to calculate the average of an array of long values
    public static long average(long[] array) {

        long sum = 0;

        for(int i = 0; i < array.length; i++ ) {

            sum += array[i];

        }

        return sum / array.length;
    }

    // Method to calculate the average of an array of double values
    public static double average(double[] array) {

        double sum = 0;

        for (int i = 0; i < array.length; i++) {

            sum += array[i];

        }

        return sum / array.length;
    }

    public static void main(String[] args) {

        // Create arrays of different primitive data types
        short[] shortArray = {10, 20, 30};

        int[] intArray = {100, 200, 300, 400};

        long[] longArray = {1000, 2000, 3000, 4000, 5000};

        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5};

        // Display the arrays and their averages
        System.out.println("Short Array: ");
        System.out.println(Arrays.toString(shortArray));
        System.out.println("Average: " + average(shortArray));
        System.out.println();

        System.out.println("Int Array: ");
        System.out.println(Arrays.toString(intArray));
        System.out.println("Average: " + average(intArray));
        System.out.println();

        System.out.println("Long Array: ");
        System.out.println(Arrays.toString(longArray));
        System.out.println("Average: " + average(longArray));
        System.out.println();

        System.out.println("Double Array: ");
        System.out.println(Arrays.toString(doubleArray));
        System.out.println("Average: " + average(doubleArray));

        
    }
}
