/* Roxanne Buenaventura
CSD402
Assignment 5.2: Programming Assignment */

public class buenaventura_mod5_2 {
    // Method to locate the largest value in a 2D array of integers and return its position
    public static int[] locateLargest(int[][] arrayParam) {
        // Initialize variables to track the largest value and its position
        int largest = arrayParam[0][0];
        int largestRow= 0;
        int largestColumn = 0;

        // Iterate through the 2D array to find the largest value and its position
        for (int row = 0; row <arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                // Compare the current element with the largest found so far
                if (arrayParam[row][column] > largest) {
                    largest = arrayParam[row][column];
                    largestRow = row;
                    largestColumn = column;
                }
            }
        }
        // Return the position of the largest value as an array containing the row and column indices
        return new int[]{largestRow, largestColumn};
    }
    // Method to locate the largest value in a 2D array of doubles and return its position
    public static double [] locateLargest(double [][] arrayParam) {
        // Initialize variables to track the largest value and its position
        double largest = arrayParam[0][0];
        int largestRow= 0;
        int largestColumn = 0;

        // Iterate through the 2D array to find the largest value and its position
        for (int row = 0; row <arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                // Compare the current element with the largest found so far
                if (arrayParam[row][column] > largest) {
                    largest = arrayParam[row][column];
                    largestRow = row;
                    largestColumn = column;
                }
            }
        }
        // Return the position of the largest value as an array containing the row and column indices
        return new double[]{largestRow, largestColumn};
    }
    // Method to locate the smallest value in a 2D array of integers and return its position
    public static int [] locateSmallest(int [][] arrayParam) {
        // Initialize variables to track the smallest value and its position
        int smallest = arrayParam[0][0];
        int smallestRow = 0;
        int smallestColumn = 0;

        // Iterate through the 2D array to find the smallest value and its position
        for (int row =0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                // Compare the current element with the smallest found so far
                if (arrayParam[row][column] < smallest) {
                    smallest = arrayParam[row][column];
                    smallestRow = row;
                    smallestColumn = column;
                }
            }
        }
        // Return the position of the smallest value as an array containing the row and column indices
        return new int[]{smallestRow, smallestColumn};
    }
    // Method to locate the smallest value in a 2D array of doubles and return its position
    public static double [] locateSmallest(double [][] arrayParam) {
        // Initialize variables to track the smallest value and its position
        double smallest = arrayParam[0][0];
        int smallestRow = 0;
        int smallestColumn = 0;

        // Iterate through the 2D array to find the smallest value and its position
        for (int row =0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                // Compare the current element with the smallest found so far
                if (arrayParam[row][column] < smallest) {
                    smallest = arrayParam[row][column];
                    smallestRow = row;
                    smallestColumn = column;
                }
            }
        }
        // Return the position of the smallest value as an array containing the row and column indices
        return new double[]{smallestRow, smallestColumn};
    }
}
