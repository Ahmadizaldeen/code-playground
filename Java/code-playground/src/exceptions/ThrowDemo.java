package exceptions;

public class ThrowDemo {

    static void teilen(int a, int b) throws KeinBockException {
        if (b == 0) {
            throw new KeinBockException("Division durch 0 ist nicht erlaubt");
        }
        if (b == 1) {
            throw new KeinBockException("Division durch 1 ist unnötig");
        }
        System.out.println(a / b);
    }

    static void teilen(double a, double b) throws KeinBockException {
        throw new KeinBockException("Will ich nicht rechnen: " + a + "/" + b);
    }

    static void teilen(double a, double b, double c) throws KeinBockException {
        throw new KeinBockException("schwer : drei Parameter!!! -> KeinBockException");
    }

    public static void main(String[] args) {

        try {
            teilen(10, 0);
        } catch (KeinBockException e) {
            System.out.println(e.getMessage());
        }

        try {
            teilen(10, 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            teilen(1.2, 1.3);
        } catch (KeinBockException e) {
            System.out.println(e.getMessage());
        }

        try {
            teilen(10.2, 3.1, 3.2);
        } catch (KeinBockException e) {
            System.out.println(e.getMessage());
        }
    }
}
