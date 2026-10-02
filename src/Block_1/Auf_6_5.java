package Block_1;

import java.util.*;

public class Auf_6_5 {
    public static void main(String[] args) {
        int summe = 0;

        Scanner input = new Scanner(System.in);

        //Grenzen einlesen
        System.out.print("Untergrenze: ");
        int untergrenze = input.nextInt();
        System.out.print("Obergrenze: ");
        int obergrenze = input.nextInt();

        //von Untergrenze bis Obergrenze hochzählen und für jede erhöhung einmal ausführen

        if (untergrenze < obergrenze) {

            System.out.println(berechneSumme(obergrenze, untergrenze));

        } else {
            System.out.println("Untergrenze muss kleiner als Obergrenze sein");
        }


    }

    //Methode mit Übergabeparamertern
    public static int berechneSumme(int oberG, int unterG) {
        int summe = 0;
        for (int i = unterG; i <= oberG; i++) {

            //entspricht: summe = summe + i;
            summe += i;
        }
        return summe;

    }
}