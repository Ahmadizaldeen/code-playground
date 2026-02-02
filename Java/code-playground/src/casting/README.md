Java Casting & Datentypen Beispiele
Dieses Projekt fasst zahlreiche grundlegende Java‑Konzepte in einer einzigen, strukturierten Klasse zusammen.
Es dient als Lern- und Übungsbeispiel für:

Datentypen

Casting (implizit & explizit)

Formatierung mit printf und String.format

Methoden & Rückgabewerte

Parsing (String → Zahl, Binär, Hex)

Grenzwerte & Überläufe

Die Klasse ist ideal für Einsteiger, die Java‑Grundlagen verstehen und typische Stolperfallen kennenlernen möchten.

📂 Inhaltsübersicht
Die Klasse CastingAndFormat ist in mehrere logisch getrennte Abschnitte gegliedert:

1. Casting Beispiele
   Demonstriert:

implizite Typumwandlung (Widening)

explizite Typumwandlung (Narrowing)

Überläufe bei kleinen Datentypen (byte, short)

Autoboxing & Upcasting (double → Object → Double)

2. Datentypen & Rechenoperationen
   Beispiele zu:

Addition verschiedener primitiver Datentypen

Verhalten bei byte‑ und short‑Operationen

Casting von long zu short

Kombination von float und double

3. Formatierung mit printf
   Demonstriert:

Zahlenformatierung (%.2f, %8.2f, %3.3f)

Text‑Zahlen‑Kombinationen

Unterschiede zwischen printf und String.format

typische Floating‑Point‑Probleme (z.B. 0.2 + 0.1)

4. Methoden
   Enthält:

quadrat(int x) – berechnet und gibt das Quadrat aus

printName(String name) – einfache Ausgabe

Aufruf von Methoden über Objektinstanz und statisch

5. Parsing & Zahlensysteme
   Beispiele für:

String → byte

String → int (Basis 2, 10, 16)

int → Binärstring

Casting zwischen double und int

6. Grenzwerte & Überläufe
   Demonstriert:

MAX_VALUE von byte, short, int, long, float, double

Überlaufverhalten (z.B. 127 + 1 = -128)

Floating‑Point Overflow (Infinity)

▶️ Ausführen
Die Klasse enthält eine main‑Methode und kann direkt gestartet werden:

bash
javac AllesInEinerKlasse.java
java AllesInEinerKlasse
🎯 Ziel des Projekts
Dieses Beispielprojekt soll helfen:

Java‑Grundlagen besser zu verstehen

typische Fehlerquellen (Überlauf, Casting‑Probleme) zu erkennen

Formatierung und Parsing sicher zu beherrschen

Methoden und Datentypen praktisch zu üben

Es eignet sich perfekt für Unterricht, Selbststudium oder als Nachschlagewerk.

📌 Erweiterungsmöglichkeiten
Falls du das Projekt ausbauen möchtest:

Menüsystem zur Auswahl einzelner Themen

Unit‑Tests für jede Methode

GUI‑Version (JavaFX oder Swing)

Interaktive Eingaben über Scanner