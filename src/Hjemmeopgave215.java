// Hjemmeopgave 2.15 created by Niels Bo Dissing, 23.09.2017 15:25, deadline:  25.09.2017.

/* (Geometry: distance of two points) Write a program that prompts the user to enter
 * two points (x1, y1) and (x2, y2) and displays their distance between them.
  * The formula for computing the distance is sqrt of ((x2 - x1)*(x2 - x1)) +
  * ((y2 - y1)*(y2 - y1)). Note that you can use Math.pow(a, 0.5) to compute sqrt of a.*/

import java.util.Scanner;

public class Hjemmeopgave215 {
    //First input of scanner and input prompt

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double a = (Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2));
        double distance = Math.pow(a, 0.5);

        System.out.println("The distance between the two points is " + distance);

    }
}