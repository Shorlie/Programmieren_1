package Block_3;

public class fahrzeugTest {
    public static void main(String[] args) {
        auto a1 = new auto("Auto1", "B", true, 5,180.00,"Blau", true);
        fahrrad f1 = new fahrrad("Fahrrad1", "keine", false, 1,50.00,"Grün", false);

        a1.fahren();
        a1.setWinterreifen(false);
        a1.fahren();

        f1.fahren();
        f1.setAngeschlossen(true);
        f1.fahren();
    }
}
