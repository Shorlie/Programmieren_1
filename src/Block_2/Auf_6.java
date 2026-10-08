package Block_2;

import java.util.Scanner;

public class Auf_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bitte geben Sie ihre Punktzahl ein: ");
        boolean valid = false;

        // Fehler abfang für nicht Ganzzahlige Eingaben
        while(!valid) {

            try {
                int a = input.nextInt();
                valid = true;

                // überprüfung ist die eingegebene Zahl im Bereich 1 - 100
                if(a < 1 || a > 100) {
                    System.out.println("Zahl muss zwischen 1 und 100 sein:");
                    valid = false;
                    input.nextLine();
                }else {
                    System.out.println("Note: " + noteausgeben(a));
                }


            } catch (Exception e) {
                valid = false;
                System.out.println("Das war keine Ganzzahl nochmal bitte: ");
                input.nextLine();
            }
        }




    }

    public static String noteausgeben(int n){
        if (n >= 90) {
            return("Sehr Gut");
        }else if (n >= 75) {
            return("Gut");
        }else if (n >= 50) {
            return("Bestanden");
        }else{
            return("nicht bestanden");
        }
    }
}
