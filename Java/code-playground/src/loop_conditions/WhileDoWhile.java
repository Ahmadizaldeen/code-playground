package loop_conditions;

import java.util.Scanner;

public class WhileDoWhile {

    public static void numberInput() {
        Scanner sc = new Scanner(System.in);
        int zahl;

        do {
            System.out.print("Zahl eingeben (0 zum Beenden): ");
            zahl = sc.nextInt();
        } while (zahl != 0);
    }

    public static void wordInputEnde() {
        Scanner sc = new Scanner(System.in);
        String wort;

        do {
            System.out.print("Wort eingeben (Ende zum Beenden): ");
            wort = sc.next();
        } while (!wort.equals("Ende"));
    }

    public static void wordInputStop() {
        Scanner sc = new Scanner(System.in);
        String wort = "";

        while (!wort.equals("Stop")) {
            wort = sc.next();
            System.out.println(wort);
        }
    }

    public static void positiveNegativeCheck() {
        Scanner sc = new Scanner(System.in);
        int zahl;

        do {
            zahl = sc.nextInt();
            if (zahl < 0) {
                System.out.println("negativ: " + zahl);
            } else if (zahl > 0) {
                System.out.println("positiv: " + zahl);
            }
        } while (zahl != 0);

        System.out.println("Ende im Gelände");
    }

    public static void main(String[] args) {
        numberInput();
        wordInputEnde();
        wordInputStop();
        positiveNegativeCheck();
    }
}
