package Block_3;

public class fahrrad extends fahrzeug{
    private boolean angeschlossen;

    public fahrrad(String name, String fuehrerscheinklasse, boolean kofferaum, int sitze, double maxSpeed, String farbe, boolean angeschlossen) {
        super(name, fuehrerscheinklasse, kofferaum, sitze, maxSpeed, farbe);
        this.angeschlossen = angeschlossen;
    }

    public boolean isAngeschlossen() {
        return angeschlossen;
    }

    public void setAngeschlossen(boolean angeschlossen) {
        this.angeschlossen = angeschlossen;
    }
}
