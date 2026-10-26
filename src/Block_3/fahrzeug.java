package Block_3;

import java.util.function.DoubleToIntFunction;

public class fahrzeug {
    private String farbe;
    private double maxSpeed;
    private int sitze;
    private boolean kofferaum;
    private String fuehrerscheinklasse;
    private String name;

    public fahrzeug(String name, String fuehrerscheinklasse, boolean kofferaum, int sitze, double maxSpeed, String farbe) {
        this.name = name;
        this.fuehrerscheinklasse = fuehrerscheinklasse;
        this.kofferaum = kofferaum;
        this.sitze = sitze;
        this.maxSpeed = maxSpeed;
        this.farbe = farbe;
    }
    public fahrzeug() {

    }

    public boolean hasKofferaum() {
        return kofferaum;
    }

    public void setKofferaum(boolean kofferaum) {
        this.kofferaum = kofferaum;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getSitze() {
        return sitze;
    }

    public void setSitze(int sitze) {
        this.sitze = sitze;
    }

    public String getFuehrerscheinklasse() {
        return fuehrerscheinklasse;
    }

    public void setFuehrerscheinklasse(String fuehrerscheinklasse) {
        this.fuehrerscheinklasse = fuehrerscheinklasse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void fahren(){
        if(this instanceof fahrrad  && ((fahrrad) this).isAngeschlossen()){
            System.out.println(this.name + " ist angeschlossen und kann nicht fahren");
        } else if(this instanceof auto && !((auto) this).hasWinterreifen()){
            System.out.println(this.name + " hat keine Winterreifen und kann nicht fahren");
        }
        else {
            System.out.println(this.name +" ist gefahren");
        }

    }
}
