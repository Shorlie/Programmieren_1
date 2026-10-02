package Block_1;
import java.util.*;


public class Auf_5 {
    public static void main(String[] args) {
        //Scanner erstellen
        Scanner input = new Scanner(System.in);

        //Zahlen als double einlesen
        System.out.print("Zahl Nummer 1 bitte: ");
        double n = input.nextDouble();
        System.out.print("Zahl Nummer 2 bitte: ");
        double m = input.nextDouble();

        //Summe berechen
        double summe = n + m;

        //Differenz berechen
        double differenz = n - m;

        //Produkt berechnen
        double produkt = n * m;

        //Quotient berechnen
        double quotient = n / m;

        // nur für die Ästhetik
        System.out.println("");

        //Ausgabe
        System.out.println("Summe: " + summe);
        System.out.println("Differenz: " + differenz);
        System.out.println("Produkt: " + produkt);
        System.out.println("Quotient: " + quotient);

    }
}
