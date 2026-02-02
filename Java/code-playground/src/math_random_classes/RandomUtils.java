package math_random_classes;

import java.util.Random;

public class RandomUtils {

    private static final Random RANDOM = new Random();

    public static int zufall0bis9() {
        return (int) (Math.random() * 10);
    }

    public static int wuerfel() {
        return (int) (Math.random() * 6) + 1;
    }

    public static int[] mehrereWuerfe(int anzahl) {
        int[] ergebnisse = new int[anzahl];
        for (int i = 0; i < anzahl; i++) {
            ergebnisse[i] = wuerfel();
        }
        return ergebnisse;
    }

    public static int zaehleZahl(int[] werte, int zahl) {
        int count = 0;
        for (int x : werte) {
            if (x == zahl) {
                count++;
            }
        }
        return count;
    }

    public static int groessereZufallszahl1bis100() {
        int a = (int) (Math.random() * 100) + 1;
        int b = (int) (Math.random() * 100) + 1;
        return Math.max(a, b);
    }

    public static int randomMitSeed(int seed, int bound) {
        Random r = new Random(seed);
        return r.nextInt(bound);
    }
}
