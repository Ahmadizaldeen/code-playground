package loops_conditions.old;

public class WhileBeispiel {
    public static void main(String[] args) {
        cal(2,4, 5);
    }
    private static void cal(int a, int b, int c){
        while(a != b || b == c && a == c){ // warum git nicht mit if statt while
            System.out.print(a+b+c);
            a++;
            b--;
        }
    }

}
