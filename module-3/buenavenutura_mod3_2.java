/* Roxanne Buenaventura
CSD402
Assignment 3.2 */
public class buenavenutura_mod3_2 {
    public static void main(String[] args) {
        for( int row =1; row<=7; row++) {

            for (int space = 1; space <=7 - row; space++) {
                System.out.print("  ");
            }

            for (int column = 1; column <= row; column++) {
                int number = (int) Math.pow(2, column - 1);
                System.out.print(number + " ");
            }

            for (int column = row -1; column >= 1; column--) {
                int number = (int) Math.pow(2, column - 1);
                System.out.print(number + " ");
            }

            System.out.println("@");
        }
    }

}

