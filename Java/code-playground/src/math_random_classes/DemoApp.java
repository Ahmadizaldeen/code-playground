package math_random_classes;

public class DemoApp {

    public static void main(String[] args) {

        System.out.println("=== MathBasics ===");
        System.out.println(MathBasics.absolut(-25));
        System.out.println(MathBasics.round(4.6));
        System.out.println(MathBasics.floor(4.6));
        System.out.println(MathBasics.ceil(4.6));
        System.out.println(MathBasics.power(3, 2));
        System.out.println(MathBasics.sqrt(144));

        System.out.println("\n=== MathAdvanced ===");
        System.out.println("Abstand: " + MathAdvanced.abstand(5, -3));
        System.out.println("Gerade: " + MathAdvanced.istGerade(4));
        System.out.println("Hypotenuse: " + MathAdvanced.hypotenuse(3, 4));
        System.out.println("Sin 30°: " + MathAdvanced.sinGrad(30));

        System.out.println("\n=== RandomUtils ===");
        System.out.println("Zufall 0–9: " + RandomUtils.zufall0bis9());
        System.out.println("Würfel: " + RandomUtils.wuerfel());

        int[] wuerfe = RandomUtils.mehrereWuerfe(10);
        System.out.print("10 Würfe: ");
        for (int x : wuerfe) {
            System.out.print("[" + x + "]");
        }

        System.out.println("\n6 kam " +
                RandomUtils.zaehleZahl(wuerfe, 6) + " mal");

        System.out.println("Größere Zahl (1–100): " +
                RandomUtils.groessereZufallszahl1bis100());

        System.out.println("Seed 42, bound 8: " +
                RandomUtils.randomMitSeed(42, 8));
    }
}
