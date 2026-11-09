package Block_3;

import java.util.Scanner;

public class bar extends zahlung{
    private int rückgeld;

    bar(int betrag) {
        super(betrag);
    }

    @Override
    public void bezahlen(){
        super.bezahlen();
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie ihren Bar Betrag an: ");
        int bezahlt = input.nextInt();
        System.out.println("Rückgeld ist: " + (bezahlt - super.betrag));
    }
}
