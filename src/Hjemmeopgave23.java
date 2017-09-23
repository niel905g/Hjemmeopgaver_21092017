//Created by Niels Bo Dissing, 23.09.2017 to be presented 25.09.2017

import java.util.Scanner;

/*
(Convert meters into feet) Write a program that reads a number in meters,
converts it to feet, and displays the result. One meter is 3.2786 feet.
*/
public class Hjemmeopgave23 {
    //First import the scanner, then declare the variables.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter a value for meter: ");
        double meter = input.nextDouble();
        double feet = meter * 3.2786;

        System.out.println("\n" + meter + " meters is " + feet + " feets.");
    }
}
