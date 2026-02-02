Arrays & ArrayLists in Java – Demo-Projekt
Dieses Repository enthält mehrere Java‑Beispiele, die den Umgang mit Arrays, ArrayList, Collections und benutzerdefinierten Objekten demonstrieren.
Die Klassen zeigen typische Operationen wie Konvertierung zwischen Array und Liste, Sortieren, Filtern, Iterieren und Arbeiten mit eigenen Datentypen.

🧱 Klassenstruktur
Code
arrays_arraylist/
├── Array_2D.java
├── ArrayCollectionsDemo.java
├── ArrayListBases.java
└──ArrayListObjekteDemo.java
    └── Person.java
🎯 Lernziele
Dieses Projekt eignet sich ideal für Java‑Einsteiger, die:

den Unterschied zwischen Array und ArrayList verstehen wollen

lernen möchten, wie man Collections effizient nutzt

eigene Objekte in Listen verwaltet

Sortier- und Filteroperationen anwenden möchte

▶️ Ausführen
Jede Klasse enthält eine eigene main‑Methode und kann unabhängig gestartet werden:

javac arrays_arraylist/*.java
java arrays_arraylist.ArrayListObjekteDemo


🚀 Inhalt
1. ArrayListObjekteDemo
   Demonstriert den Umgang mit einer ArrayList<Person>.

Behandelte Themen:

Array → ArrayList konvertieren

Objekte hinzufügen

Filtern nach Eigenschaften

Sortieren mit Comparator

Elemente tauschen (Collections.swap)

Beispielausgabe:


Ursprüngliche Liste: [Ahmad (25), Lena (22), Tom (30), Zara (25)]
Nach Hinzufügen: [...]
Personen über 24 Jahre: [...]
Gefilterte Liste sortiert nach Alter: [...]
Gefilterte Liste sortiert nach Name: [...]
Nach swap: [...]


2. ArrayCollectionsDemo
   Demonstriert grundlegende Operationen mit Arrays und Collections.

Behandelte Themen:

Arrays ausgeben (Arrays.toString)

Array → ArrayList konvertieren

Sortieren mit Collections.sort

Größtes Element finden (Collections.max)

Elemente tauschen (Collections.swap)

ArrayList → Array zurückwandeln

Beispielcode:
Integer[] zahlenArray = {5, 2, 9, 1, 7};
ArrayList<Integer> zahlenListe = new ArrayList<>(Arrays.asList(zahlenArray));
Collections.sort(zahlenListe);
int max = Collections.max(zahlenListe);


3. ArrayListBases
   Grundlagen der ArrayList anhand einer Liste von Strings.

Behandelte Themen:

Initialisierung mit Kapazität

add, addAll, contains, indexOf, lastIndexOf

Zugriff auf erstes/letztes Element (getFirst, getLast)

Iteration (for-each, Iterator, Lambda)

Sortieren

Entfernen von Elementen (remove, removeAll)

Liste leeren (clear)

Beispiel:
List<String> namen = new ArrayList<>(3);
namen.add("Anna");
namen.addAll(Arrays.asList("Anas", "Marcus"));
Collections.sort(namen);

4. Array_2D
   Demonstriert den Umgang mit zweidimensionalen Arrays und jagged Arrays (unregelmäßige Arrays).

Behandelte Themen:

Zugriff auf Elemente (matrix[row][col])

Verschachtelte Schleifen zum Ausgeben einer Matrix

Enhanced for‑loop für 2D‑Arrays

Summieren einer Spalte

Summieren aller Elemente

Diagonalsumme

Jagged Arrays (verschiedene Zeilenlängen)

Beispielcode:
int[][] matrix = {
{1,2,3},
{4,5,6},
{7,8,9}
};

int diagSum = 0;
for (int i = 0; i < matrix.length; i++) {
diagSum += matrix[i][i];
}

Beispielausgabe:
5
1 2 3
4 5 6
7 8 9
Diagonal Summe: 15

