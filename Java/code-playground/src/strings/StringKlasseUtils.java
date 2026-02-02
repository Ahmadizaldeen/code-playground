package strings;

public class StringKlasseUtils {

    public static void basics() {
        String str = "  Hello, Java World  ";
        System.out.println("Length: " + str.length());
        System.out.println("Trimmed: " + str.trim());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        String subStr = str.trim().substring(0,5);
        System.out.println("Substring: " + subStr);

        boolean containsJava = str.contains("Java");
        System.out.println("Contains Java? " + containsJava);

        String replaced = str.trim().replace("Hello", "Moin");
        System.out.println("Replace: " + replaced);

        String[] words = replaced.split(" ");
        for (String word : words) System.out.println(word);
    }
}
