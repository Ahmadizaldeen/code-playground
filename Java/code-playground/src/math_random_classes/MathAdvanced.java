package math_random_classes;

public class MathAdvanced {

    public static double abstand(double a, double b) {
        return Math.abs(a - b);
    }

    public static boolean istGerade(int x) {
        return x % 2 == 0;
    }

    public static double hypotenuse(double a, double b) {
        double cQuadrat = Math.pow(a, 2) + Math.pow(b, 2);
        return Math.sqrt(cQuadrat);
    }

    public static double toRadians(double grad) {
        return Math.toRadians(grad);
    }

    public static double sinGrad(double grad) {
        return Math.sin(Math.toRadians(grad));
    }

    public static double cosGrad(double grad) {
        return Math.cos(Math.toRadians(grad));
    }

    public static double tanGrad(double grad) {
        return Math.tan(Math.toRadians(grad));
    }
}
