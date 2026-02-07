package oop;

// ------------------- Interface -------------------
interface Fliegbar {
    void fliegen();
}

// ------------------- Basisklasse -------------------
class Tier {
    // Kapselung: private Feld
    private String name;

    // Konstruktor
    public Tier(String name) {
        this.name = name;
    }

    // Getter (für Kapselung)
    public String getName() {
        return name;
    }

    // Abstraktion: allgemeine Methode
    public void lautGeben() {
        System.out.println(name + " macht Geräusche.");
    }
}

// ------------------- Unterklasse -------------------
class Vogel extends Tier implements Fliegbar {
    private String art;

    public Vogel(String name, String art) {
        super(name); // Vererbung: Konstruktor der Basisklasse aufrufen
        this.art = art;
    }

    // Polymorphismus: Methode überschreiben
    @Override
    public void lautGeben() {
        System.out.println(getName() + " zwitschert.");
    }

    // Interface Methode implementieren
    @Override
    public void fliegen() {
        System.out.println(getName() + " fliegt durch die Luft.");
    }

    // Eigene Methode
    public void zeigeArt() {
        System.out.println(getName() + " ist ein " + art);
    }
}

// ------------------- Hauptprogramm -------------------
public class OOPDemo {
    public static void main(String[] args) {
        // Objekte erstellen
        Tier tier = new Tier("Allgemeines Tier");
        Vogel vogel = new Vogel("Piepmatz", "Sperling");

        // Methoden aufrufen
        tier.lautGeben();       // Abstraktion & Kapselung sichtbar
        vogel.lautGeben();      // Polymorphismus: Überschreiben der Methode
        vogel.fliegen();        // Interface Methode
        vogel.zeigeArt();       // Eigene Methode der Unterklasse

        // Polymorphismus durch Referenztyp
        Tier t2 = new Vogel("Flitzi", "Adler");
        t2.lautGeben();         // Aufruf der überschriebenen Methode in Vogel
    }
}
