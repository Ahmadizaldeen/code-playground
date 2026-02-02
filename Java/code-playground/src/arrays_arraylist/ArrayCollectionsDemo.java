package arrays_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayCollectionsDemo {
    public static void main(String[] args) {

        System.out.println("// 1. Ein Array von Zahlen :");
        Integer[] zahlenArray = {5, 2, 9, 1, 7};
        int[] intZahlen = {5, 2, 9, 1, 7};
        System.out.println("Ursprüngliches Array to Sting: " + Arrays.toString(zahlenArray));
        System.out.println("Ursprüngliches Array as List : "+Arrays.asList(zahlenArray));
        System.out.println("Ursprüngliches Array referanz " + intZahlen); //referanz,Array ist natives Sprachkonstrukt, keine Klasse mit toString()-Implementierung.

        System.out.println("\n// 2. Array in eine echte ArrayList umwandeln");

        ArrayList<Integer> zahlenListe = new ArrayList<>(Arrays.asList(zahlenArray));
        System.out.println("Als echte ArrayList: " + zahlenListe);// Klasse ArrayList überschreibt die Methode toString()
        System.out.println("ArrayList as List  : " + List.of(zahlenListe));
        System.out.println("ArrayList to String: " + Arrays.toString(intZahlen));

        System.out.println("\n// 3. Mit Collections sortieren" );
        Collections.sort(zahlenListe);
        System.out.println("Sortierte Liste: " + zahlenListe);

        System.out.println("\n// 4. Größtes Element finden " );
        int max = Collections.max(zahlenListe);
        System.out.println("Größtes Element: " + max);

        System.out.println("\n// 5. Ein Element austauschen");
        Collections.swap(zahlenListe, 0, zahlenListe.size() - 1);
        System.out.println("Nach swap: " + zahlenListe);

        System.out.println("\n// 6. Liste wieder in Array zurückwandeln");
        Integer[] neuesArray = zahlenListe.toArray(new Integer[0]);
        System.out.println("Neues Array: " + Arrays.toString(neuesArray));
    }
}

