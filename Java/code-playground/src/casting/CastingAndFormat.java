package casting;

public class CastingAndFormat {
        // ---------- Methoden ----------
        public static int quadrat(int x) {
            int num = x * x;
            System.out.println("Quadrat von " + x + ": " + num);
            return num;
        }

        private void printName(String name) {
            System.out.println("Name: " + name);
        }


        public static void main(String[] args) {

            System.out.println("=== CASTING BEISPIELE ===");

            int i = 42;
            double d = i; // implizit
            System.out.println("int → double: " + d);

            double d1 = 9.99;
            int i1 = (int) d1; // explizit
            System.out.println("double → int: " + i1);

            int i2 = 130;
            byte b = (byte) i2; // Überlauf
            System.out.println("int 130 → byte: " + b);

            int z = (int) 7.9;
            double y = i;
            Object o = y; // Autoboxing + Upcasting
            Double dbl = (Double) o;
            System.out.println("Object → Double: " + dbl);


            System.out.println("\n=== DATENTYPEN & RECHNEN ===");

            int integer1 = 10, integer2 = 20;
            System.out.println("Summe: " + (integer1 + integer2));

            double dbl1 = 10.3, dbl2 = 20.5;
            double dbl3 = dbl1 + dbl2;
            int intCasting = (int) dbl3;
            System.out.println(intCasting + " != " + dbl3);

            byte byt1 = 20, byt2 = 127;
            int byt3 = byt1 + byt2;
            System.out.println("byte + byte = int: " + byt3);

            float flotNr = 12.2f;
            double dblNr = 8.6;
            System.out.println("float + double: " + (flotNr + dblNr));

            long lng1 = 44444L, lng2 = 555L;
            long lngSum = lng1 + lng2;
            short shrtCast = (short) lngSum;
            System.out.println(shrtCast + " != " + lngSum);


            System.out.println("\n=== FORMATIERUNG ===");

            double value = 3.14;
            String result = String.format("%8.2f", value);
            System.out.println(result);

            System.out.printf("[%8.2f]%n", 12.3);
            System.out.printf("[%8.2f]%n", 123.4567);
            System.out.printf("[%3.3f]%n", -9.1);
            System.out.printf("%8.2f%n", -9.1);

            System.out.println("Typ von result: " + result.getClass());
            System.out.println(0.2 + 0.1);
            System.out.printf("%n" + (1.2 + 0.1));
            System.out.printf("%n" + 1.2 + 0.1);
            System.out.printf("%n%.2f%n", 3.14159);


            System.out.println("\n=== METHODEN ===");

            int q = quadrat(9);
            quadrat(10);
            System.out.println("Ergebnis gespeichert: " + q);

            CastingAndFormat obj = new CastingAndFormat();
            obj.quadrat(5);
            obj.printName("Ahmad");


            System.out.println("\n=== PARSING & ZAHLENSYSTEME ===");

            double doblX = 7.84;
            int intX = (int) doblX;
            double doblY = intX;
            System.out.println("double → int: " + intX);
            System.out.println("int → double: " + doblY);

            String s = "123";
            byte parsedByte = Byte.parseByte(s);
            System.out.println("String → byte: " + parsedByte);

            String binStr = "101110100101010";
            int binToInt = Integer.parseInt(binStr, 2);
            System.out.println("Binär → int: " + binToInt);

            String num = "1234";
            String bin = Integer.toBinaryString(Integer.parseInt(num));
            System.out.println("int → binär: " + bin);

            String numStr = "123456";
            int dez = Integer.parseInt(numStr);
            int hex = Integer.parseInt(numStr, 16);
            System.out.println("String → Dezimal: " + dez);
            System.out.println("String → Hex: " + hex);


            System.out.println("\n=== GRENZWERTE & ÜBERLÄUFE ===");

            byte bMax = 127;
            bMax++;
            System.out.println("Byte Überlauf: " + bMax);

            int intMax = Integer.MAX_VALUE;
            intMax++;
            System.out.println("Integer Überlauf: " + intMax);

            double dblMax = Double.MAX_VALUE;
            dblMax++;
            System.out.println("Double +1: " + dblMax);

            dblMax = dblMax * dblMax;
            System.out.println("Double Overflow: " + dblMax);

            float fltMax = Float.MAX_VALUE;
            fltMax += 1E30f;
            System.out.println("Float Overflow: " + fltMax);

            long lngMax = Long.MAX_VALUE;
            lngMax++;
            System.out.println("Long Überlauf: " + lngMax);
        }
    }


