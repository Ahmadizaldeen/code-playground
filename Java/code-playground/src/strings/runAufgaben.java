package strings;

public class runAufgaben {

    public static void runAufgaben() {
        int x1 = 7;
        int y1 = x1 << 2; // *4
        System.out.println("x1 binär: " + String.format("%8s", Integer.toBinaryString(x1)).replace(' ', '0'));
        System.out.println("y1 = " + y1 + ", binär: " + String.format("%8s", Integer.toBinaryString(y1)).replace(' ', '0'));

        int x2 = 20;
        int y2 = x2 >> 3; // /8
        System.out.println("x2 binär: " + String.format("%8s", Integer.toBinaryString(x2)).replace(' ', '0'));
        System.out.println("y2 = " + y2 + ", binär: " + String.format("%8s", Integer.toBinaryString(y2)).replace(' ', '0'));

        int x3 = -16;
        int y3 = x3 >> 2;
        int y33 = x3 >>> 2;
        System.out.println("x3 = " + x3 + ", >>2 = " + y3 + ", >>>2 = " + y33);
        System.out.println(String.format("%8s", Integer.toBinaryString(y33)).replace(' ', '0'));

        System.out.println("\n=== Bit Flags Beispiel ===");
        final int READ = 1 << 0;
        final int WRITE = 1 << 1;
        int flags = READ | WRITE;
        boolean hasWrite = (flags & WRITE) != 0;
        System.out.println("Write-Flag gesetzt? " + hasWrite);
    }
}
