package Block_3;

public class zahlung {
    protected int betrag;
    zahlung(int betrag) {
        this.betrag = betrag;
    }
    public void bezahlen(){
        System.out.println(this.betrag + " müssen bezahlt werden");


    }
}
