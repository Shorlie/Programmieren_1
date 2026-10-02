package Block_1;

import java.util.Scanner;

public class Auf_6_1 {
    public static void main(String[] args) {
        int summe = 0;

        Scanner input = new Scanner(System.in);


        //von 1 bis 10 und für jede erhöhung einmal ausführen
        for (int i = 1; i <= 10; i++) {

            //entspricht: summe = summe + i;
            summe += i;
        }
        System.out.println(summe);


    }
}
