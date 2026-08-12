// Roxanne Buenaventura
// CSD402
// Assignment-3
// 11 August 2026

import java.util.Scanner;

public class EnergyCalculation {
    public static void main(String[] args) {

        double WaterMass;
        double InitialTemperature;
        double FinalTemperature;

        double Q;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter water mass in Kilograms: ");
        WaterMass = input.nextDouble();
        System.out.print("Enter initial temperature in Celsius: ");
        InitialTemperature = input.nextDouble();
        System.out.print("Enter final temperature in Celsius: ");
        FinalTemperature = input.nextDouble();

        Q = WaterMass * (FinalTemperature - InitialTemperature) * 4184;

        System.out.println("You will need "+ Q + " Joules of energy to heat the water.");

    }
}