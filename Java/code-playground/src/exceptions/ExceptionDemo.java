package exceptions;

import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

    static final Scanner sc = new Scanner(System.in);

    static void pause() {
        System.out.println("Drücke Enter um fortzufahren...");
        sc.nextLine();
    }

    static void setAlter(int alter) {
        if (alter < 0) {
            throw new IllegalArgumentException("Alter darf nicht negativ sein");
        }
    }

    static boolean gestartet = false;
    static void arbeiten() {
        if (!gestartet) {
            throw new IllegalStateException("System nicht gestartet");
        }
    }

    public static void main(String[] args) {

        System.out.println("Beispiele für typische Exceptions in Java\n");
        pause();

        // 1. ArithmeticException
        try {
            int a = 10, b = 0;
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e + "  // Division durch 0");
        }
        pause();

        // 2. NullPointerException
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println(e + "  // Zugriff auf null");
        }
        pause();

        // 3. FileNotFoundException (Checked)
        try {
            FileReader reader = new FileReader("nicht_da.txt");
            reader.read();
        } catch (Exception e) {
            System.out.println(e + "  // Datei existiert nicht");
        }
        pause();

        // 4. ArrayIndexOutOfBoundsException
        try {
            int[] zahlen = {1,2,3};
            System.out.println(zahlen[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e + "  // Index zu groß");
        }
        pause();

        // 5. NumberFormatException
        try {
            int zahl = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println(e + "  // Keine Zahl");
        }
        pause();

        // 6. ClassCastException
        try {
            Object o = "Hallo";
            Integer i = (Integer) o;
        } catch (ClassCastException e) {
            System.out.println(e + "  // Falscher Cast");
        }
        pause();

        // 7. IllegalArgumentException
        try {
            setAlter(-5);
        } catch (IllegalArgumentException e) {
            System.out.println(e + "  // Ungültiges Argument");
        }
        pause();

        // 8. IllegalStateException
        try {
            arbeiten();
        } catch (IllegalStateException e) {
            System.out.println(e + "  // Falscher Zustand");
        }
        pause();

        // 9. InputMismatchException
        try {
            System.out.print("Gib String ein dann bekommst du Exception : ");
            int zahl = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e + "  // Erwartet Zahl, bekommen Text");
        }
        pause();

        // 10. UnsupportedOperationException
        try {
            var list = java.util.List.of("Hallo", "Welt");
            list.add("geht nicht");
        } catch (UnsupportedOperationException e) {
            System.out.println(e + "  // Liste ist unveränderlich");
        }
        pause();

        System.out.println("\nWichtig zu merken:");
        System.out.println("Unchecked Exceptions (Runtime): Null, Index, Cast, Zahl, Argument, Zustand");
        System.out.println("Checked Exceptions: Dateien, I/O, Netzwerk");

        sc.close();
    }
}
