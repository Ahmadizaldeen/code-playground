public class CastingDemo {

    public static void main(String[] args) {

        // ================================
        // 1. Automatische Typumwandlung (Widening/Promotion)
        // ================================
        System.out.println("=== Automatische Typumwandlung ===");
        int intVar = 100;
        long longVar = intVar;    // int → long automatisch
        float floatVar = longVar; // long → float automatisch
        double doubleVar = floatVar; // float → double automatisch

        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);

        // ================================
        // 2. Manuelle Typumwandlung (Narrowing/Casting)
        // ================================
        System.out.println("\n=== Manuelle Typumwandlung ===");
        double pi = 3.14159;
        int intPi = (int) pi; // double → int, Nachkommastellen gehen verloren
        System.out.println("double pi: " + pi);
        System.out.println("intPi (nach Casting): " + intPi);

        long bigNumber = 123456789L;
        int smallerNumber = (int) bigNumber; // long → int, evtl. Datenverlust
        System.out.println("bigNumber: " + bigNumber);
        System.out.println("smallerNumber (nach Casting): " + smallerNumber);

        // ================================
        // 3. Casting zwischen Referenztypen (Objekte)
        // ================================
        System.out.println("\n=== Referenztypen Casting ===");
        Tier myTier = new Hund(); // Upcasting automatisch: Hund → Tier
        System.out.println("myTier ist ein: " + myTier.getClass().getSimpleName());

        if (myTier instanceof Hund) {
            Hund myHund = (Hund) myTier; // Downcasting manuell
            myHund.bellen();
        }

        // ================================
        // 4. Automatische Promotion bei Rechenoperationen
        // ================================
        System.out.println("\n=== Typ-Promotion bei Berechnungen ===");
        int a = 5;
        float b = 2.5f;
        double c = a + b; // int → float automatisch, dann float → double automatisch
        System.out.println("a + b = " + c);

        byte byteVal = 10;
        short shortVal = 20;
        int sum = byteVal + shortVal; // byte und short werden automatisch zu int
        System.out.println("byteVal + shortVal = " + sum);
    }
}

// ================================
// Hilfsklassen für Referenztypen-Beispiel
// ================================
class Tier {
    // Oberklasse Tier
}

class Hund extends Tier {
    void bellen() {
        System.out.println("Hund bellt: Wuff Wuff!");
    }
}
