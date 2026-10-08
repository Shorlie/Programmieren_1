package Block_2;

import java.util.Scanner;


public class Auf_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bitte geben Sie ihr Alter ein: ");
        boolean valid = false;

        // Fehler abfang für nicht Ganzzahlige Eingaben
        while (!valid) {

            try {
                int a = input.nextInt();
                valid = true;

                System.out.println(alterausgeben(a));

            } catch (Exception e) {
                valid = false;
                System.out.println("Das war keine Ganzzahl nochmal bitte: ");
                input.nextLine();
            }
        }


    }

    public static String alterausgeben(int n) {
        if (n >= 18) {
            return ("Erwachsen");
        } else if (n >= 6) {
            return ("Schüler");
        } else {
            return ("Kindergarten");
        }
    }
}

