package loops_conditions.old;

public class Taschenrechner {
    public static int calculate (int a, int b , char operator){
        switch (operator){
            case '+':
                return a+b;

            case '-':
                return a-b;

            case '*':
                return a*b;

            case '/':
                return a/b;

            default:
                return 0;
        }
    }
    public static double calculate (double a, double b , char operator){
        switch (operator){
            case '+':
                return a+b;

            case '-':
                return a-b;

            case '*':
                return a*b;

            case '/':
                return a/b;

            default:
                return 0;
        }
    }
    public static void main (String[] args){
        System.out.println(calculate(4, 2, '+'));
        System.out.println(calculate(5.0, 2.0, '/'));

    }
}
