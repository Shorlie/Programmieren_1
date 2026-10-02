package Block_1;

import java.util.*;

public class Auf_6_2 {
    public static void main(String[] args) {
        int summe = 0;

        Scanner input = new Scanner(System.in);

        //Grenzen einlesen
        System.out.print("Untergrenze: ");
        int untergrenze = input.nextInt();
        System.out.print("Obergrenze: ");
        int obergrenze = input.nextInt();

        //von Untergrenze bis Obergrenze hochzählen und für jede erhöhung einmal ausführen
        for (int i = untergrenze; i <= obergrenze; i++) {

            summe += i;

            System.out.println(summe);


        }
    }
}