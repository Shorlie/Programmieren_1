package Block_2;

public class Auf_2 {
    public static void main(String[] args) {



        // int zu kleiner Datentyp für 20! deswegen long verwenden
        System.out.println(intfakul(20));

        System.out.println(longfakul(20));



    }

    public static int intfakul(int n){
        int fakultaet = 1;

        for(int i = 1; i <= n; i++) {

            fakultaet *= i;

        }
        return fakultaet;
    }
    public static long longfakul(int n){
        long fakultaet = 1;

        for(int i = 1; i <= n; i++) {

            fakultaet *= i;

        }
        return fakultaet;
    }

}
