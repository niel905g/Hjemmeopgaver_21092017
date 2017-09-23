// Hjemmeopgave 2.2 af Niels Bo Dissing, aflevering 25.09.2017.

import java.util.Scanner;

/* Compute the volume of a triangle - Write a program that reads in the length
 *  of sides of an equallateral triangle and computes the area and volume using
 *  the following formulas:
 *  area = quadratroden of 3, divided with 4 and
 *  multiplied with (the lengh of sides)^2 */

public class Hjemmeopgave22 {
// Først importeres scanneren og så etableres variablerne
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("\nEnter length of the sides"
                + " and height of the equilateral triangle: ");
        double length = input.nextDouble();

        double area = (Math.sqrt(3)/4) * (length * length);
        double volume = area * length;

    System.out.println("The length is " + length);
    System.out.println("The area is " + area);
    System.out.println("The volume of the Triangular prism is " + volume);

    }
}
