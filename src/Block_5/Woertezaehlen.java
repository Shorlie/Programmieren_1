package Block_5;

public class Woertezaehlen {
    static void main() {
        String a = "Das ist    ein Test   gut";
        int count = 1;
        boolean lastsymbol = false;
        for (int i = 0; i < a.trim().length(); i++) {
            if (a.charAt(i) == ' ' && !lastsymbol) {
                count++;
                lastsymbol = true;
            }else  if (a.trim().charAt(i) != ' ' ){
                lastsymbol = false;
            }



        }

        System.out.println(count);
    }
}
