package Block_2;

import java.util.Scanner;

public class Auf_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String a = "";


        boolean valid = false;
        while (!valid) {

            try {
                System.out.print("Bitte geben Sie einen Monat: ");
                a = input.next();
                valid = true;


            } catch (Exception e) {
                valid = false;
                System.out.println("Das war keine Ganzzahl nochmal bitte: ");
                input.nextLine();
            }


        }
        if (a.equalsIgnoreCase("Januar")) {
            System.out.println(31);
        } else if (a.equalsIgnoreCase("Februar")) {
            System.out.println(28);
        } else if (a.equalsIgnoreCase("März")) {
            System.out.println(31);
        } else if (a.equalsIgnoreCase("April")) {
            System.out.println(30);
        } else if (a.equalsIgnoreCase("Mai")) {
            System.out.println(31);
        } else if (a.equalsIgnoreCase("Juni")) {
            System.out.println(30);
        } else if (a.equalsIgnoreCase("Juli")) {
            System.out.println(31);
        } else if (a.equalsIgnoreCase("August")) {
            System.out.println(31);
        } else if (a.equalsIgnoreCase("September")) {
            System.out.println(30);
        } else if (a.equalsIgnoreCase("Oktober")) {
            System.out.println(31);
        } else if (a.equalsIgnoreCase("November")) {
            System.out.println(30);
        } else if (a.equalsIgnoreCase("Dezember")) {
            System.out.println(31);
        }
        else {
            System.out.println("Kein Monat Kollege");
        }
    }
}

