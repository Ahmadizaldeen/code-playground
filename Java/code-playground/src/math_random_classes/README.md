# Math & Random Utilities in Java

Dieses Repository enthält ein Set von Java-Klassen, die grundlegende und fortgeschrittene mathematische Operationen sowie Zufallszahlen-Funktionalität demonstrieren.
Es ist für Lernzwecke, Übungsprojekte und kleine Konsolenanwendungen konzipiert.

## Package: math_random_classes

### 1. MathBasics
Bündelt grundlegende Methoden der Java Math-Klasse:
- Absolutwerte, Max/Min
- Rundungen (ceil, floor, round)
- Potenzen und Wurzeln (sqrt, cbrt)
- Logarithmen (ln, log10)

### 2. MathAdvanced
Enthält fortgeschrittene mathematische Anwendungen:
- Berechnung des Abstands zwischen zwei Zahlen
- Prüfung auf gerade/ungerade Zahlen
- Hypotenusenberechnung für rechtwinklige Dreiecke
- Trigonometrische Funktionen (Sinus, Kosinus, Tangens) in Gradmaß

### 3. RandomUtils
Kapselt Zufallszahlen-Funktionalität:
- Zufallszahlen 0–9, Würfelwürfe (1–6)
- Mehrfachwürfe und Zählen bestimmter Ergebnisse
- Vergleich zweier Zufallszahlen (1–100)
- Zufallsgeneratoren mit festem Seed

### 4. DemoApp
Eine zentrale `main()`-Klasse, die alle Methoden aus MathBasics, MathAdvanced und RandomUtils demonstriert.
Die Ergebnisse werden auf der Konsole ausgegeben, um die Funktionsweise der Klassen zu veranschaulichen.

## Nutzung
- Jede Klasse enthält ausschließlich **statische Methoden**, die direkt aufgerufen werden können.
- DemoApp kann direkt ausgeführt werden, um Beispiele und Testfälle zu sehen.

math_random_classes/          <-- Hauptordner / GitHub-Repo
│
├── README.md                 <-- übergeordnete Beschreibung für das ganze Repo
│
├── MathBasics.java           <-- Grundlegende Math-Methoden
├── README_MathBasics.md      <-- Beschreibung der MathBasics-Klasse
│
├── MathAdvanced.java         <-- Fortgeschrittene Math-Anwendungen
├── README_MathAdvanced.md    <-- Beschreibung der MathAdvanced-Klasse
│
├── RandomUtils.java          <-- Zufallszahlen-Methoden
├── README_RandomUtils.md     <-- Beschreibung der RandomUtils-Klasse
│
└── DemoApp.java              <-- zentrale main()-Klasse für Tests / Demos
└── README_DemoApp.md         <-- Beschreibung der DemoApp-Klasse
