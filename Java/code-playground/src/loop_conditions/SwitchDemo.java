package loop_conditions;

public class SwitchDemo {

    public static void tagErkennen(int tag) {
        switch (tag) {
            case 1 -> System.out.println("Montag");
            case 2 -> System.out.println("Dienstag");
            case 3 -> System.out.println("Mittwoch");
            case 4 -> System.out.println("Donnerstag");
            case 5 -> System.out.println("Freitag");
            case 6 -> System.out.println("Samstag");
            case 7 -> System.out.println("Sonntag");
            default -> System.out.println("Ungültiger Wochentag");
        }
    }

    public static void quartalErkennen(int monat) {
        switch (monat) {
            case 1, 2, 3 -> System.out.println("1. Quartal");
            case 4, 5, 6 -> System.out.println("2. Quartal");
            case 7, 8, 9 -> System.out.println("3. Quartal");
            case 10, 11, 12 -> System.out.println("4. Quartal");
        }
    }

    public static void rolleErkennen(String rolle) {
        switch (rolle) {
            case "admin" -> System.out.println("Alle Rechte");
            case "user" -> System.out.println("Eingeschränkte Rechte");
            case "gast" -> System.out.println("Nur Lesen");
            default -> System.out.println("Unbekannte Rolle");
        }
    }

    public static void main(String[] args) {
        tagErkennen(1);
        quartalErkennen(2);
        rolleErkennen("user");
    }
}
