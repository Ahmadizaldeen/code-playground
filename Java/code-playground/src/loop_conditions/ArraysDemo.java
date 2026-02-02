package loop_conditions;

import java.util.Arrays;

public class ArraysDemo {

    public static void basicArray() {
        int[] zahlen = {3, 2, 6, 7, 8, 9, 4};
        System.out.println(zahlen[6]);//4

        for (int wert : zahlen) {
            System.out.print(  wert + ", "  );
        }
    }

    public static void arrayWithIndexCheck() {
        int[] zahlen = {3, 6, 9, 12, 15};

        for (int i = 0; i < zahlen.length; i++) {
            if (zahlen[i] % 3 == 0) {
                System.out.println("Index " + i + ": " + zahlen[i]);
            }
        }
    }

    public static void foreachModificationDemo() {
        int[] zahlen = {3, 6, 9, 12, 15};

        for (int wert : zahlen) {
            wert += 5;
            System.out.println("Summerte Wert: " + wert);
        }
    }

    public static void main(String[] args) {
        basicArray();
        System.out.println("\nArray with index check :");
        arrayWithIndexCheck();
        System.out.println("For Each modification :");
        foreachModificationDemo();
    }
}
