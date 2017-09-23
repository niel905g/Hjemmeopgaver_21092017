//Hjemmeopgave 2.23 Created by Niels Bo Dissing, 23.09.2017 Hjemmeopgave 2.23, deadline: 25.09.2017

/* (Cost of driving) Write a program that prompts the user to enter the distance
 * to drive, the fuel efficiency of the car in miles per gallon, and the price per gallon,
 *  and displays the cost of the trip. */


import java.util.Scanner;

public class Hjemmeopgave223 {
    // Import Scanner and declare variables
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double distance;
        double milesPerGallon;
        double pricePerGallon;

        //Input prompt
        System.out.print("Enter the driving distance: ");
        distance = input.nextDouble();

        System.out.print("Enter miles per gallon: ");
        milesPerGallon = input.nextDouble();

        System.out.print("Enter price per gallon: ");
        pricePerGallon = input.nextDouble();

        double total = distance / milesPerGallon * pricePerGallon;

        //Total costs
        System.out.printf("The cost of driving is $%.2f", total);
    }
}
