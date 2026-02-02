package oop;

import java.util.ArrayList;
import java.util.Arrays;

public class StringInterfaceDemo {

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.appendString("2", "8")); // Ausgabe: 2828

        Divide divide = new Divide(1); // Ausgabe: 1
    }

    interface Parent {
        String appendString(String a, String b);
    }

    static class Child implements Parent {
        @Override
        public String appendString(String a, String b) {
            return a + b + a + b;
        }
    }

    static class Arithmetic {
        public Arithmetic() {}
        public Arithmetic(int index) {}
    }

    public static class Divide extends Arithmetic {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(0, 1, 2));

        public Divide() {}

        public Divide(int index) {
            super();
            System.out.println(myList.get(index));
        }
    }
}
