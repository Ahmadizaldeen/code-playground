package arrays_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person {
    String name;
    int alter;

    Person(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    @Override
    public String toString() {
        return name + " (" + alter + ")";
    }
}

public class ArrayListObjekteDemo {
    public static void main(String[] args) {

        // 1. Array von Personen
        Person[] personenArray = {
                new Person("Ahmad", 25),
                new Person("Lena", 22),
                new Person("Tom", 30),
                new Person("Zara", 25)
        };

        // 2. Array ArrayList umwandeln
        ArrayList<Person> personenListe = new ArrayList<>();
        Collections.addAll(personenListe, personenArray); // Alternative zu new ArrayList<>(Arrays.asList(array))
        System.out.println("Ursprüngliche Liste: " + personenListe);

        // 3. Neue Person hinzufügen
        personenListe.add(new Person("Mia", 28));
        System.out.println("Nach Hinzufügen: " + personenListe);

        // 4. Personen über 24 Jahre filtern
        ArrayList<Person> gefiltert = new ArrayList<>();
        for (Person p : personenListe) {
            if (p.alter > 24) {
                gefiltert.add(p);
            }
        }
        System.out.println("Personen über 24 Jahre: " + gefiltert);

        // 5. Nach Alter sortieren
        Collections.sort(gefiltert, Comparator.comparingInt(p -> p.alter));
        System.out.println("Gefilterte Liste sortiert nach Alter: " + gefiltert);

        // 6. Nach Name sortieren
        Collections.sort(gefiltert, Comparator.comparing(p -> p.name));
        System.out.println("Gefilterte Liste sortiert nach Name: " + gefiltert);

        // 7. Element austauschen
        Collections.swap(gefiltert, 0, gefiltert.size() - 1);
        System.out.println("Nach swap: " + gefiltert);
    }
}

