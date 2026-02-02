package arrays_arraylist;

import java.util.*;

public class ArrayListBases {

    public static void main(String[] args) {

        // Deklaration und Initialisierung
        List<String> namen = new ArrayList<>(3);// size() is 0 auch wenn initialCapacity =3

        // Elemente hinzufügen
        namen.add("Anna");
        namen.add("Ben");
        namen.add("Clara");
        String[] neuNamen ={"Anas" , "Marcus"};
        String[] alteName = {"Arsen" , "Sergey" , "Anna" , "Ben"};
        namen.addAll(Arrays.asList(neuNamen));//Array->List->addAll(Collection)->namen became a copy
        Collections.addAll(namen, alteName);// Kein Zwischen-Objekt
        System.out.println("Aktulle Initialisierung: " + namen);

        // Zugriff über Index
        System.out.println("First : "+namen.getFirst()); // Anna
        System.out.println("Last  : "+namen.getLast());
        System.out.println("Third : "+namen.get(2));
        System.out.println("Index Of Name : "+namen.indexOf("Arsen"));
        System.out.println("Last Index Of Name : "+namen.lastIndexOf("Salamander"));//-1 not found


        // Element ändern
        namen.set(1, "Bernd"); // Ben → Bernd

        // Iteration (for-each)
        for (String name : namen) {
            System.out.print(name+", " );
        }

        // Größe der Liste
        System.out.println("\nAnzahl: " + namen.size());


        // Prüfung auf Inhalt //  Als Method empfolen
        if (namen.contains("Clara")) {
            System.out.println("Clara ist enthalten");
        }

        System.out.println("Contains Orange?: " + namen.contains("Orange"));


        System.out.print("Print with Lambda : ");
        namen.forEach(n -> System.out.print(n + ", "));// Lambda
        // namen.forEach(System.out::println);// Methodenreferenz , forEach erwartet Consumer‑Objekt

        Collections.sort(namen);
        System.out.println("\nsorted by Name: " + namen);

        // Element entfernen  //
        boolean removeByName = namen.remove("AnnaNN");
        System.out.println("removed ? " + removeByName);
        boolean removeByIndex = namen.remove(namen.get(8));
        System.out.println("removed ? " + removeByIndex);

        List<String> blackList = List.of("Anna", "Ben");
        namen.removeAll(blackList);//boolean removeAll(Collection<?> c)
        System.out.print("after removing SubArrayList : ");
        Iterator<String> it = namen.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+ ", " );
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter to clear: ");
         String submit = sc.nextLine();
        namen.clear();
        System.out.println("After clear: " + namen);
        System.out.println("Is Empty ?: "+namen.isEmpty());

    }
}
