package oop;

public class Produkt {
    private String name;
    private double preis;
    private static int count = 0;

    public Produkt(String name) {
        this.name = name;
        count++;
    }

    public Produkt(String name, double preis) {
        this.name = name;
        this.preis = preis < 0 ? 0 : preis;
        count++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPreis(double preis) {
        if (preis < 0) {
            System.out.println("Preis darf nicht 0 oder negativ sein");
        } else {
            this.preis = preis;
        }
    }

    public double getPreis() {
        return preis;
    }

    public void preisErhohen(double prozent) {
        if (prozent < 0) {
            System.out.println("Prozent darf nicht <= 0 sein");
        } else {
            this.preis = preis * prozent;
        }
    }

    @Override
    public String toString() {
        return "Produkt[name=" + name + ", preis=" + preis + "]";
    }

    public boolean istTeurerAls(Produkt anderesProdukt) {
        return this.preis > anderesProdukt.preis;
    }

    public static void anzahlProdukte() {
        System.out.println("Es wurden " + count + " Produkte erzeugt");
    }

    public static void main(String[] args) {
        Produkt apfel = new Produkt("Apfel");
        apfel.setName("Apple");
        apfel.setPreis(25);
        System.out.println(apfel);

        Produkt banana = new Produkt("Banana");
        banana.setPreis(50);

        Produkt caffe = new Produkt("Caffe", 50);
        Produkt ananas = new Produkt("Ananas");
        Produkt.anzahlProdukte();
    }
}
