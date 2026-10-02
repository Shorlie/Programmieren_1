package Block_1;
import java.util.*;
public class Auf_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Zahl 1: ");
        int zahl1 = input.nextInt();

        System.out.println("Zahl 2: ");
        int zahl2 = input.nextInt();

        if (zahl1 > zahl2) {
            System.out.println("Zahl 1 ist größer");
        } else if (zahl2 > zahl1) {
            System.out.println("Zahl 2 ist größer");
        }else {
            System.out.println("Beide zahlen sind gleich groß");
        }

    }
}
