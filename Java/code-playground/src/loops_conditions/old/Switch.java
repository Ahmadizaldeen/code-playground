package loops_conditions.old;



public class Switch {
    public static void tagErkennen(int tag){
        switch (tag){
            case 1:
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mittwoch");
                break;
            case 4:
                System.out.println("Donnerstag");
                break;
            case 5:
                System.out.println("Freitag");
                break;
            case 6:
                System.out.println("Samstag");
                break;
            case 7:
                System.out.println("Sonntag");
                break;
            default:
                System.out.println(" Ungültiger Wochentag");
        }
    }
    public static void quartalErkennen(int month){
        switch (month){
            case 1:
            case 2:
            case 3:
                System.out.println("1.Quartal");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("2.Quartal");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("3.Quartal");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("4.Quartal");
                break;
        }
    }
    public static void rolleErkennen(String rolle){
        switch (rolle){
            case "admin":
                System.out.println("Alle Rechte");
                break;
            case "user":
                System.out.println("Eingeschränkte Rechte");
                break;
            case "gast":
                System.out.println("Nur Lesen");
                break;
            default:
                System.out.println("Unbekannte Rolle ");
        }
    }
    public static void main (String[] args){
        System.out.println("Aufgabe 1");
        tagErkennen(1);
        System.out.println("Aufgabe 2");
        quartalErkennen(2);
        System.out.println("Aufgabe 3");
        tagErkennen(10);
        System.out.println("Aufgabe 4");
        rolleErkennen("user");
    }
}


