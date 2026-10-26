package Block_3;

public class auto extends fahrzeug{
    private boolean winterreifen;

    public auto(String name, String fuehrerscheinklasse, boolean kofferaum, int sitze, double maxSpeed, String farbe, boolean winterreifen) {
        super(name, fuehrerscheinklasse, kofferaum, sitze, maxSpeed, farbe);
        this.winterreifen = winterreifen;
    }

    public auto(boolean winterreifen) {
        this.winterreifen = winterreifen;
    }

    public boolean hasWinterreifen() {
        return winterreifen;
    }

    public void setWinterreifen(boolean winterreifen) {
        this.winterreifen = winterreifen;
    }
}
