package strings;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== String Pool & intern() Beispiele ===");
        String text = "hello";
        String text2 = "hello";
        String text3 = new String("hello");
        String text3inPool = text3.intern();
        System.out.println(text == text2);          // true
        System.out.println(text.equals(text2));    // true
        System.out.println(text == text3);         // false
        System.out.println(text.equals(text3));   // true

        String kontakt = text + text3;
        System.out.println(kontakt);

        String text4 = "Hallo Welt " + 1;
        System.out.println(text4);
        text4 += 0;
        System.out.println(text4);

        System.out.println("\n=== Bitoperationen ===");
        int x = 5;
        System.out.printf("x>>2 = %d, x<<1 = %d%n", x >> 2, x << 1);

        System.out.println("\n=== Aufgaben aus Main ===");
        runAufgaben.runAufgaben();
    }
}
