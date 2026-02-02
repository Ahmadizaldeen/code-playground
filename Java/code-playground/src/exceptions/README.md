Java Exceptions für Einsteiger
Dieses kleine Java‑Projekt zeigt die wichtigsten Exceptions (Fehlerarten) in Java.
Es besteht aus drei Klassen:

ExceptionDemo → zeigt typische Fehler, die im Alltag passieren

ThrowDemo → zeigt, wie man selbst Exceptions wirft

KeinBockException → eine eigene Exception-Klasse

Das Projekt ist bewusst einfach gehalten, damit Einsteiger die Grundlagen schnell verstehen.

🎯 Ziel des Projekts
Die wichtigsten Unchecked Exceptions kennenlernen

Den Unterschied zu Checked Exceptions verstehen

Lernen, wie man eigene Exceptions wirft

Lernen, wie man try–catch richtig verwendet

📂 Projektstruktur
Code
/exceptions
│
├── ExceptionDemo.java
├── ThrowDemo.java
└── KeinBockException.java
🧩 1. ExceptionDemo – typische Fehler in Java
Diese Klasse zeigt Beispiele für:

Exception	Art	Bedeutung
ArithmeticException	Unchecked	Division durch 0
NullPointerException	Unchecked	Zugriff auf null
FileNotFoundException	Checked	Datei existiert nicht
ArrayIndexOutOfBoundsException	Unchecked	Index zu groß
NumberFormatException	Unchecked	Text → Zahl fehlgeschlagen
ClassCastException	Unchecked	Falscher Typ
IllegalArgumentException	Unchecked	Ungültiges Argument
IllegalStateException	Unchecked	Falscher Zustand
InputMismatchException	Unchecked	Falsche Eingabe
UnsupportedOperationException	Unchecked	Unveränderliche Liste
Die Klasse zeigt zu jeder Exception ein kleines Beispiel und fängt sie mit try-catch ab.

🧩 2. ThrowDemo – eigene Exceptions werfen
Hier lernst du:

wie man selbst Exceptions wirft

wie man eigene Fehlermeldungen erstellt

wie man eigene Exception-Klassen nutzt

Beispiele:

java
throw new ArithmeticException("Division durch 0");
throw new KeinBockException("Will ich nicht rechnen");
🧩 3. KeinBockException – eigene Exception
Eine einfache eigene Exception:

java
public class KeinBockException extends Exception {
public KeinBockException(String msg) {
super(msg);
}
}
Damit kannst du eigene Fehlertypen definieren, die genau zu deinem Programm passen.

▶️ Ausführen
Projekt in einer IDE öffnen (IntelliJ, Eclipse, VS Code …)

Java 17 oder höher empfohlen

Die Klassen einzeln starten:

ExceptionDemo → zeigt typische Fehler

ThrowDemo → zeigt eigenes Werfen von Exceptions

🧠 Merksatz 
Unchecked Exceptions (Runtime)
→ passieren während der Laufzeit
→ müssen nicht abgefangen werden

Null

Falscher Index

Falscher Cast

Falsche Zahl

Falsches Argument

Falscher Zustand

Checked Exceptions
→ müssen abgefangen oder weitergegeben werden

Dateien

I/O

Netzwerk