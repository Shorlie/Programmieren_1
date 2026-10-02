package Block_1;

import java.util.Scanner;

public class Auf_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Deine Zahl ist: " + zahlenraten(0,100));

    }

    public static double zahlenraten(int uG, int oG){
        Scanner input = new Scanner(System.in);
        if(uG == oG){
            return uG;
        }else {
            int n = (oG + uG) /2;

            while(true){
                System.out.println("Ist deine Zahl Größer als " + n + "? (ja/nein/gleich)");
                String antwort = input.next();

                if (antwort.equals("ja")){

                    return zahlenraten(n,oG);
                } else if(antwort.equals("nein")) {
                    return zahlenraten(uG, n);
                } else if(antwort.equals("gleich")) {
                    return (oG + uG) /2;
                }
            }


        }
    }
}
