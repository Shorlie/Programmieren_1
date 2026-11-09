package Block_3;

public class Abstraktion {
    static void main() {
        zahlung b1 = new bar(5);
        zahlung o1 = new online(20, 564);
        zahlung k1 = new karte(100, 5648);

        b1.bezahlen();
        o1.bezahlen();
        k1.bezahlen();
    }
}
