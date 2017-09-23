//Created by Niels Bo Dissing, 23.09.2017 Hjemmeopgave 2.8
// to be presented 25.09.2017

/* (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
 the current time in GMT. Revise the program so that it prompts the user to enter
  the time zone offset to GMT and displays the time in the specified time zone. */

import java.util.Scanner;

public class Hjemmeopgave28 {
//First solve the 2.7 ShowCurrentTime.java to show the GMT time zone.
// Then import the scanner, prompt for offset time zone and declare the variables

    public static void main(String[] args) {
        //Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        //Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        //Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        //Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        //Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        //Obtain the total hours
        long totalHours = totalMinutes / 60;

        //Compute the current hour
        long currentHour = totalHours % 24;

        //Displays results
        System.out.println("\nCurrent time is " + currentHour + ":"
        + currentMinute + ":" + currentSecond + " GMT");

        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the time zone offset to GMT: "); //Prompts for user input
        int offsetTime = input.nextInt();

        System.out.println("\nThe current time is " + ((currentHour + offsetTime)+ ":"
                + currentMinute + ":" + currentSecond) );
    }
}
