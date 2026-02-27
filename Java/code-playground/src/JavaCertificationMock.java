public class JavaCertificationMock {

    public static void main(String[] args) {

        // ------------------------------
        // FRAGE 1 – Ternär + Zuweisung
        // ------------------------------
        int a1 = 5, b1 = 10;
        int r1 = (a1 > b1) ? (a1 = 1) : (b1 = 2);
        // a1 > b1 → false → rechter Zweig
        System.out.println("F1: " + a1 + " " + b1 + " " + r1); // 5 2 2


        // ------------------------------
        // FRAGE 2 – Return mit ternär
        // ------------------------------
        System.out.println("F2: " + max(3, 7)); // 7
        // ternärer Operator liefert einen Wert → korrekt


        // ------------------------------
        // FRAGE 3 – Verschachtelt ternär
        // ------------------------------
        int a3 = 2, b3 = 4, c3 = 6;
        int r3 = a3 > b3 ? a3 : (b3 > c3 ? b3 : c3);
        // Ergebnis: 6
        System.out.println("F3: " + r3);


        // ------------------------------
        // FRAGE 4 – Seiteneffekte ++
        // ------------------------------
        int x4 = 1, y4 = 2;
        int z4 = x4 > y4 ? ++x4 : ++y4;
        // nur rechter Zweig → y4 = 3, z4 = 3
        System.out.println("F4: " + x4 + " " + y4 + " " + z4); // 1 3 3


        // ------------------------------
        // FRAGE 5 – Typen-Falle mit var
        // ------------------------------
        int a5 = 10; double d5 = 5.5;
        var r5 = a5 > d5 ? a5 : d5;
        System.out.println("F5: " + r5); // 10.0 (double)


        // ------------------------------
        // FRAGE 6 – Sieht legal aus, ist illegal
        // ------------------------------
        // int r6 = true ? a6 : b6 = 5; // ❌ Kompiliert nicht
        System.out.println("F6: kompiliert nicht");


        // ------------------------------
        // FRAGE 7 – ++ in beiden Zweigen
        // ------------------------------
        int p7 = 1, q7 = 2;
        int res7 = p7 < q7 ? ++p7 : ++q7;
        // p7 < q7 → true → nur linker Zweig
        System.out.println("F7: " + p7 + " " + q7 + " " + res7); // 2 2 2


        // ------------------------------
        // FRAGE 8 – Verschachtelte Zuweisung
        // ------------------------------
        int a8 = 3, b8 = 5, c8 = 4;
        int r8 = a8 > b8 ? (a8 = 0) : (b8 > c8 ? (b8 = 0) : (c8 = 0));
        // a8 > b8 → false → rechter Zweig
        // b8 > c8 → true → b8 = 0
        System.out.println("F8: " + a8 + " " + b8 + " " + c8 + " " + r8); // 3 0 4 0


        // ------------------------------
        // FRAGE 9 – Ternär mit double und int
        // ------------------------------
        int a9 = 5; double b9 = 6.5;
        double r9 = a9 > b9 ? a9 : b9;
        System.out.println("F9: " + r9); // 6.5


        // ------------------------------
        // FRAGE 10 – Komplex verschachtelt
        // ------------------------------
        int a10 = 1, b10 = 2, c10 = 3;
        int r10 = a10 > b10 ? (a10 > c10 ? a10 : c10) : (b10 > c10 ? b10 : c10);
        // a10 > b10 → false → rechter Zweig
        // b10 > c10 → false → Ergebnis = c10
        System.out.println("F10: " + r10); // 3

    }

    // Hilfsmethode für Frage 2
    static int max(int a, int b) {
        return a > b ? a : b;
    }
}
