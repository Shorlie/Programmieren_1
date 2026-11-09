package Block_5;

import java.util.Locale;

public class Vokale {
    static void main() {
        String a = "Programmieren macht Spaß";
        String b = "aeiou";
        String c = "qwrtzpsdfghjklxcvbnm";
        String d = "öüäy";
        int ergebnis = 0;
        int ergebnis2 = 0;
        int ergebnis3 = 0;
        for (int i = 0; i < a.length(); i++) {
            if (b.contains(a.toLowerCase().substring(i, i + 1))) {
                ergebnis++;
            }
        }
        for (int i = 0; i < a.length(); i++) {
            if (c.contains(a.toLowerCase().substring(i, i + 1))) {
                ergebnis2++;
            }
        }
        for (int i = 0; i < a.length(); i++) {
            if (d.contains(a.toLowerCase().substring(i, i + 1))) {
                ergebnis3++;
            }
        }

        System.out.println(ergebnis + " Vokale");
        System.out.println(ergebnis2 + " Konsonaten");
        System.out.println(ergebnis3 + " Umlaute und y");


    }
}
