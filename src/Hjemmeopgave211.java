// Hjemmeopgave 2.11 created by Niels Bo Dissing, Deadline by 25.09.2017.

/* (Population projection) Rewrite Programming Exercise 1.11 to prompt the user
 to enter the number of years and displays the population after the number of years.
  Use the hint in Programming Exercise 1.11 for this program. The population should
   be cast into an integer. */

import java.util.Scanner;

public class Hjemmeopgave211 {
    //
    public static void main(String[] args) {
        //Prompt for year input
        Scanner input = new Scanner(System.in);
        System.out.println("Insert number of years: ");
        int years = input.nextInt();

        //Info given in exercise 1.11
        double birthRateInSeconds = 7.0;
        double deathRateInSeconds = 13.0;
        double newImmigrantRateInSeconds = 45.0;

        double currentPopulation = 312032486.0;
        //How many seconds is there in a year.
        double secondsInYears = 60.0 * 60.0 * 24.0 * 365.0;
        //Find the rate of: births, deaths and new immigrants in a year
        double numBirths = secondsInYears / birthRateInSeconds;
        double numDeaths = secondsInYears / deathRateInSeconds;
        double numImmigrants = secondsInYears / newImmigrantRateInSeconds;

        for (int i = 0; i < years; i++) {

            currentPopulation += numBirths + numImmigrants - numDeaths;
        }
        System.out.println("The population in " + years + " years"
                + " is " + (long) currentPopulation + " people.");
    }
}
