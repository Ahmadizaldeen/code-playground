package oop;

import oop.interfaces.Beweglich;
import oop.interfaces.MyInterface;

public class VererbungUndInterfacesDemo {

    // Tierklassen
    class Tier {
        String name;
        Tier(String name) { this.name = name; }
        Tier() {}
        void gibLaut() { System.out.println("Das Tier macht ein Geräusch."); }
    }

    class Hund extends Tier implements Beweglich {
        Hund(String name) { super(name); }
        Hund() { super(); }

        @Override
        void gibLaut() {
            super.gibLaut();
            System.out.println(name + " Der Hund bellt");
        }

        @Override
        public void bewegen() {
            System.out.println(name + " Der Hund läuft");
        }
    }

    class Katze extends Tier implements Beweglich {
        Katze() { super("Katze"); }

        @Override
        void gibLaut() {
            super.gibLaut();
            System.out.println(name + " Määäooo");
        }

        @Override
        public void bewegen() {
            System.out.println("Die Katze springt");
        }
    }

    // Geräteklassen
    class Lampe implements MyInterface {
        private boolean eingeschaltet;

        @Override
        public void einschalten() {
            eingeschaltet = true;
            System.out.println("Lampe ist an");
        }

        @Override
        public void ausschalten() {
            eingeschaltet = false;
            System.out.println("Lampe ist aus");
        }

        @Override
        public void status() {
            System.out.println("Lampe eingeschaltet: " + eingeschaltet);
        }
    }

    class Ventilator implements MyInterface {
        private boolean eingeschaltet;

        @Override
        public void einschalten() {
            eingeschaltet = true;
            System.out.println("Ventilator ist an");
        }

        @Override
        public void ausschalten() {
            eingeschaltet = false;
            System.out.println("Ventilator ist aus");
        }

        @Override
        public void status() {
            System.out.println("Ventilator eingeschaltet: " + eingeschaltet);
        }
    }

    public static void main(String[] args) {
        VererbungUndInterfacesDemo demo = new VererbungUndInterfacesDemo();

        Hund hund = demo.new Hund("Bello");
        Katze katze = demo.new Katze();
        Tier hund2 = demo.new Hund();
        Tier hund3 = demo.new Tier();
        Tier hund4 = demo.new Tier("hundwieHund");

        hund.gibLaut();
        katze.gibLaut();
        hund2.gibLaut();
        hund3.gibLaut();
        hund4.gibLaut();

        hund.bewegen();
        katze.bewegen();

        MyInterface lampe = demo.new Lampe();
        MyInterface ventilator = demo.new Ventilator();

        lampe.einschalten();
        lampe.ausschalten();

        ventilator.einschalten();
        ventilator.ausschalten();

        MyInterface[] geraete = {lampe, ventilator};
        for (MyInterface g : geraete) {
            g.status();
        }
    }
}
