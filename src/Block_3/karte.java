package Block_3;

import java.util.Scanner;

public class karte extends zahlung{
    private int pin;
    karte(int betrag, int pin) {
        super(betrag);
        this.pin = pin;
    }


    @Override
    public void bezahlen() {
        super.bezahlen();
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie ihre Pin ein: ");
        if (this.pin == input.nextInt()) {
            System.out.println("ist bezahlt");
        }
    }
}
