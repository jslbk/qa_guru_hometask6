package slbk.j;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 9;
        char cC = 'C';
        byte b100 = 100;
        short s10k = 10000;

        System.out.println("\n----------- BASIC CALCULATIONS -----------\n");

        System.out.println("1. a + b: " + (a + b) + ";\n" +
                "2. a - b = " + (a - b) + ";\n" +
                "3. a * b = " + (a * b) + ";\n" +
                "4. b / a = " + (b / a) + ";\n" +
                "5. b % a = " + (b % a) + ";\n" +
                "6. c++ = " + (c++) + ";\n" +
                "7. ++c = " + (++c) + ";\n" +
                "8. --c = " + (--c) + ";\n" +
                "9. c-- = " + (c--) + "."
        );

        System.out.println("\n------------- COMPARISON OPERATORS -------------\n");

        System.out.println("1. b==b = " + (a == b) + ";\n" +
                "2. a!=b = " + (a != b) + ";\n" +
                "3. a>b = " + (a > b) + ";\n" +
                "4. a<b = " + (a < b) + ";\n" +
                "5. b>=a = " + (b >= a) + ";\n" +
                "6. b<=a = " + (b <= a) + "."
        );

        System.out.println("\n------------- PRIMITIVE DATA CALCULATIONS -------------\n");

        System.out.println("1. byte + short = " + b100 + s10k + ";\n" +
                "2. short + int = " + (s10k + a) + ";\n" +
                "3. char + int = " + (cC < b) + ";\n" +
                "4. short + byte = " + (s10k + b100)
        );

        System.out.println("\n------------- PRIMITIVE DATA CALCULATIONS -------------\n");
        double doubleD = 1.57d;
        float floatF = 2.2442f;
        long longL = 15L;
        short shortS = 123;
        System.out.println("1. double + float = " + doubleD + floatF);
        System.out.println("2. long + float = " + (longL + floatF));
        System.out.println("3. short + float = " + (shortS + floatF));
        System.out.println("4. [int] of 'double + float' = " + (int) (doubleD + floatF));
        System.out.println("5. [short] of 'double + float' = " + (short) (doubleD + floatF));
        System.out.println("6. [long] of 'double + float' = " + (long) (doubleD + floatF));
        System.out.println("7. [float] of 'double + float' = " + (float) (doubleD + floatF));
        System.out.println("8. [double] of 'long + float' = " + (double) (longL + floatF));
    }
}