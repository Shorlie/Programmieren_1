package Block_2;

import java.util.Scanner;

public class Auf_8_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] tage = {"Montag" , "Dienstag", "Mittwoch" , "Donnerstag" , "Freitag" , "Samstag" , "Sonntag"};

        boolean valid = false;
        while (!valid) {

            try {
                System.out.print("Bitte geben Sie die Zahl ein: ");
                int a = input.nextInt();

                if (a >= 1 && a <= 7) {
                    System.out.println(tage[a - 1]);
                    valid = true;
                }else {
                    System.out.println("Die Zahl liegt ausserhalb des definierten Bereichs");
                }



            } catch (Exception e) {
                valid = false;
                System.out.println("Das war keine Ganzzahl nochmal bitte: ");
                input.nextLine();
            }


        }
    }
}
