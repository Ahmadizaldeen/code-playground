package strings;

import java.util.Scanner;

public class StringBuilderUtils {

    public static void stringBuilderExamples() {
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        sb.insert(0, "Language ");
        System.out.println(sb);

        sb.replace(2,4,"Pro");
        System.out.println(sb);

        sb.delete(3,6);
        System.out.println(sb);

        System.out.println("Länge: " + sb.length());
        System.out.println("Rückwärts: " + sb.reverse());
    }

    public static void compareStrings() {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int result = s1.compareTo(s2);
        System.out.println(result < 0 ? "Wort 1 kommt zuerst" : result > 0 ? "Wort 2 kommt zuerst" : "Beide gleich");
    }
}
