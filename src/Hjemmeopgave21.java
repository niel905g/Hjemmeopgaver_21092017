import java.util.Scanner;

/** Hjemmeopgaver givet den 21.09.2017, Datamatiker 1 semester, v/Niels Bo Dissing
 *
 * (Convert mile to kilometre) Write a program that reads miles in a double value from console,
 * then converts it to kilometres and displays the result. The formula for the conversion is as follows:
 *  1 mile = 1.6 kilometres
 *  */
public class Hjemmeopgave21 {
    //Først indlæse, så deklarere variablerne!;

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in); //Får skanneren med!

        System.out.print("\nEnter mile(s): "); //Starter på ny linje
       double mile = input.nextDouble(); // Her indsættes et tal f.eks 62,5 der er lig 100.0 km

        double kilometres = 1.6;
        double result = mile * kilometres;

    String mileText = "\n" + mile + " miles is " + result + " kilometres.";

        System.out.println(mileText);

        // Alternativ løsning, der også fungerer med decimaler
        // fordi den ene variabel som ganges med, er deklareret som double. En er nok!
        // System.out.println(mile + " miles svarer til "
          //      + mile * 1.6 + " kilometres");
        // Her fungerer det også med decimaler, 62,5 miles er lig 100.0 km!
    }
}