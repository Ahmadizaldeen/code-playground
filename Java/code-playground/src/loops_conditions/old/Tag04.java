package loops_conditions.old;

import java.util.Scanner;

public class Tag04 {
    public static void main (String[] args){

        System.out.println("Ausnahmen und Schleifen ***");
        for (int i = 0 ; i<21; i++){
            if(i == 0){
                System.out.println(0);

            } else if (i%2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("++ Operator ***");
        int x =5;
        int y= ++x;
        System.out.println("x=" + x +" ,Y=" + y);


        //Zahlen von 1 bis 10 ausgeben
        for (int i= 1 ; i<=10 ; i++) {
            System.out.println(i);
        }

        //Alle geraden Zahlen zwischen 0 und 20
        for (int i = 0 ; i<21; i++){
            if(i == 0){
                System.out.println(0);

            } else if (i%2 == 0) {
                System.out.println(i);
            }
        }

        // Summe der Zahlen von 1 bis 10 berechnen
        int summe=0;
        for(int i=1;i<10;i++){
            summe+=i;
        }
        System.out.println("Summe 1bis 10 " + summe);

        //Countdown
        for (int i= 10 ; i>=0;i--){
            System.out.println(i);
        }

        // Multiplikationstabelle für n
        int n = 10;
        for (int i= 0 ; i<=10;i++){
            System.out.println(n +"*" + i + "="+  n*i);
        }

        int[] zahlen = {3,2,6,7,8,9,4};//Referenztyp, Indexbasiert, feste Länge
        int[] anerezahlen = new int[5];//Erzeugung array mit 5 Elementen
        int laenge = zahlen.length;
//System.out.println(laenge);

        System.out.println(zahlen[6]);
        for (int wert : zahlen)
            System.out.println(wert);


        int[] zahlen1 = {3, 6, 9, 12, 15};

        for (int i = 0; i < zahlen1.length; i++) {
            if (zahlen1[i] % 3 == 0) {
                System.out.println("Index " + i + ": " + zahlen1[i]);
            }
        }
        for (int wert1 : zahlen1) {
            wert1 = wert1 + 5;
            System.out.println("Wert: " + wert1);
            wert1 = wert1 + 5;

        }

        Scanner sc = new Scanner(System.in);
        int zahl;

        do {
            System.out.print("Bitte eine  Zahl eingeben: .0 zum beenden :");
            zahl = sc.nextInt();
        } while (zahl != 0);

        String wort;

        do {
            System.out.print("Bitte eine wort eingeben: "+"ENDE"+" zum beenden ");
            wort = sc.next();
        } while (!wort.equals("Ende"));


        System.out.println(" Geben Sie Wörter ein (\"Stop\" zum Beenden):");
        String wort2 ="";

        while (!wort2.equals("Stop")){
            wort2 = sc.next();
            System.out.println(wort2);
        }

        //TeilC Aufgabe
        int inputB;
        System.out.println("Geben Sie eine Zahl ein (0 zum Beenden):");
        do {
            inputB = sc.nextInt();

            if (inputB < 0) {
                System.out.println("negativ: " + inputB);
            } else if (inputB > 0) {
                System.out.println("positiv: " + inputB);
            }

        } while (inputB != 0);

        System.out.println("Ende im Gelände");

    }
}
