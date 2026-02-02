package loop_conditions;

public class WhileConditionTrap {

    public static void calculate(int a, int b, int c) {
        while (a != b || b == c && a == c) {
            System.out.print(a + b + c);
            a++;
            b--;
        }
    }

    public static void main(String[] args) {
        calculate(2, 4, 5);
    }
}
