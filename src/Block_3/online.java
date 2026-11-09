package Block_3;

import java.util.Scanner;

public class online extends zahlung {
    private int cvv;

    online(int betrag, int cvv) {
        super(betrag);
        this.cvv = cvv;
    }


    @Override
    public void bezahlen() {
        super.bezahlen();
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie ihre CVV ein: ");
        if (this.cvv == input.nextInt()) {
            System.out.println("ist bezahlt");
        }
    }
}
