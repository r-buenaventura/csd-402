/* 
Roanne Buenaventura
CSD 340
Assignment 2.2: Rock Paper Scissors
 */

import java.util.Scanner;

public class buenaventura_mod2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.print("Enter your choice:\n1. Rock\n2. Paper\n3. Scissors\n");
        int userChoice = input.nextInt();
        int computerChoice = (int) (Math.random() * 3) + 1;
        System.out.println("Computer chose: " + (computerChoice));
        System.out.println("You chose: " + (userChoice));
        if (userChoice == computerChoice) {
            System.out.println("Looks like we have a tie!");
            } else if (userChoice == 1 && computerChoice == 2) {
            System.out.println("Paper beats Rock! You lose!");
            } else if (userChoice == 1 && computerChoice == 3) {
            System.out.println("Rock beats Scissors! You win!");
            } else if (userChoice == 2 && computerChoice == 1) {
                System.out.println("Paper beats Rock! You win!");
            } else if (userChoice == 2 && computerChoice == 3) {
                System.out.println("Scissors beats Paper! You lose!");
            } else if (userChoice == 3 && computerChoice == 1) {
                System.out.println("Rock beats Scissors! You lose!");
            } else if (userChoice == 3 && computerChoice == 2) {
                System.out.println("Scissors beats Paper! You win!");
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
            }
        }
}
