public class ternaereOperator {
    static int max(int a, int b, int c) {
        return a > b ? a : b > c ? b : c;
    }

    static int f(int a, int b) {
        int x = a > b ? a : b;
        return x;
    }
    public static void main(String[] args) {
       System.out.println(max(1,2,3));
       System.out.println(max(10,5,30));//kompiliert, aber Logikfehler
        // ,a > b, wird c komplett ignoriert.

        System.out.println(f(10,5));//? : ist ein Ausdruck, nicht statment ,
        // kann keine reutern machen, [a > b ? return a : return b; // ❌]

        int a = 1, b = 2;
        //System.out.println(a > b ? a : System.out.println(b)); // /*
        /*Beide Seiten des ternären Operators müssen kompatible Typen haben
        a ist int , System.out.println(b) ist void
         */

        int a1 = 3, b1 = 5, c1 = 4;
        int r = a1 > b1 ? a1 : b1 > c1 ? b1 : c1;
        System.out.println(r);//5

        int x = 10;
        int y = 5;
        int z = x < y ? x++ : y++;
        System.out.println(x + " " + y + " " + z);//10 6 5
        /*x < y → false,nur y++ wird ausgeführt,z = 5 , danach: y = 6 */

        int x1 = 10;
        int y1 = 5;
        int z1 = x1 < y1 ? ++x1 : ++y1;
        System.out.println(x1 + " " + y1 + " " + z1);//10 6 6

        int x2 = 10;
        int y2 = 5;
        int z2 = x2 > y2 ? ++x2 : ++y2;
        System.out.println(x2 + " " + y2 + " " + z2);//11 5 11


        int l = 1;
        int m = 2;
        int n = 3;
        int o = l > m ? l > n ? l : n : m > n ? m : n;
        System.out.println(o); //3

        int l1 = 1;
        int m1 = 2;
        int n1 = 3;
        int o1 = l1 < m1 ? l1 < n1 ? l1 : n1 : m1 < n1 ? m1 : n1; // falsch logic
        System.out.println(o1); //1

        int l2 = 1;
        int m2 = 2;
        int n2 = 3;
        int o2 = l2 < m2 ? m2 < n2 ? m2 : n2 : m2 < n2 ? m2 : n2; //  Zerstörte logic
        System.out.println(o2); //2


    }
}
