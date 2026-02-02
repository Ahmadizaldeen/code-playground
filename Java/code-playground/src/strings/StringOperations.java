package strings;

import java.util.Scanner;

public class StringOperations {

    private static Scanner sc = new Scanner(System.in);

    public static String stringOp(String s) {
        System.out.println("""
                Operation auswählen:
                1: length()
                2: charAt()
                3: Vergleich
                4: Substring
                5: Upper & Lower
                6: contains & indexOf
                7: replace
                8: trim
                9: startsWith / endsWith
                10: rückwärts
                """);
        int eingabe = sc.nextInt();
        String result = "";
        switch (eingabe) {
            case 1 -> result = String.valueOf(s.length());
            case 2 -> {
                System.out.println("Index eingeben:");
                int index = sc.nextInt();
                result = "Index " + index + " enthält: " + s.charAt(index);
            }
            case 3 -> {
                System.out.println("Zu vergleichender String:");
                String comp = sc.next();
                if (comp == s) result = "Referenz gleich";
                else result = "Referenz unterschiedlich";
                if (comp.equals(s)) result += ", Inhalt gleich";
                else result += ", Inhalt unterschiedlich";
            }
            case 4 -> {
                System.out.println("Startindex:");
                int start = sc.nextInt();
                System.out.println("Endindex:");
                int end = sc.nextInt();
                result = s.substring(start, end);
            }
            case 5 -> {
                System.out.println("1: Upper, 2: Lower");
                int choice = sc.nextInt();
                result = choice == 1 ? s.toUpperCase() : s.toLowerCase();
            }
            case 6 -> {
                System.out.println("Suchwort:");
                String word = sc.next();
                if (s.contains(word)) result = "Gefunden an Index " + s.indexOf(word);
                else result = "Nicht gefunden (-1)";
            }
            case 7 -> {
                System.out.println("Zu ersetzender String:");
                String oldS = sc.next();
                System.out.println("Ersatz:");
                String newS = sc.next();
                result = s.replace(oldS, newS);
            }
            case 8 -> result = s.trim();
            case 9 -> {
                System.out.println("1: startsWith, 2: endsWith");
                int choice = sc.nextInt();
                System.out.println("Eingabe:");
                String str = sc.next();
                result = choice == 1 ? String.valueOf(s.startsWith(str)) : String.valueOf(s.endsWith(str));
            }
            case 10 -> {
                StringBuilder sb = new StringBuilder(s);
                result = sb.reverse().toString();
            }
        }
        return result;
    }
}
