package Block_1;

import java.util.Scanner;

public class Auf_9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Zahl 1: ");
        int zahl1 = input.nextInt();

        System.out.println("Zahl 2: ");
        int zahl2 = input.nextInt();

        System.out.println("Zahl 3: ");
        int zahl3 = input.nextInt();

        if ((zahl1 > zahl2 && zahl1 > zahl3) || (zahl1 > zahl2 && zahl1 >= zahl3)) {
            System.out.println("Zahl 1 ist größten");
        } else if ((zahl2 > zahl1 && zahl2 > zahl3) || (zahl2 >= zahl1 && zahl2 > zahl3)){
            System.out.println("Zahl 2 ist am größten");
        }
        else if ((zahl3 > zahl1 && zahl3 > zahl2) || (zahl3 >= zahl1 && zahl3 > zahl2) ) {
            System.out.println("Zahl 3 ist am größten");

        }else {
            System.out.println("Beide zahlen sind gleich groß");
        }
    }
}
