package inputoutput;

public class Datatype {
    public static void main(String[] args) {

        // primitive data type
        /*
         * 
         * Interger -> byte, short, int, long
         * Float -> double, float
         * Character -> char
         * Boolean -> true, flase
         * 
         */
        // this is not allowd because of boxing and unboxing

        // Integer myint = new Integer(12); // aut dated

        // Wrapper classes in java

        // Boxing
        int primitiveInt = 42;
        Integer wrappedInt = Integer.valueOf(primitiveInt); // Boxing
        // System.out.println(wrappedInt);

        // Auto boxing
        int primitiveInt1 = 76;
        Integer wrappedInt1 = primitiveInt1; // Auto-boxing
        // System.out.println(wrappedInt1);

        int newValue = Integer.valueOf(90);
        // System.out.println(newValue);

        // Unboxing
        Integer wrappedInt2 = Integer.valueOf(42);
        int conInt = wrappedInt2.intValue(); // Unboxing
        double conDouble = wrappedInt2.doubleValue();
        float conFloat = wrappedInt2.floatValue();

        // litteral values
        int t1 = 10;

        int binary = 0b101;
        // System.out.println("Binary " + binary);

        int hax = 0x7E;
        // System.out.println("Hax " + hax);

        double longNumber = 1_00_000_00000.98_87;

        double longN = 10e2;
        // System.out.println("E " + longN);

        // Use of datatype
        int x = 10;
        short x1 = 10;
        long x2 = 10l;
        float y = 10.87f;
        double z = 10.0;
        char c = 'c';
        boolean b = true;

        // Conversion and Casting Or Type promession

        // explicit type conversion -> Casting
        int num = 10;
        byte newNum = (byte) num;

        int num1 = 10;
        char ch = (char) num1;
        ch = (char) 65;
        // System.out.println(ch);

        double d = 189.876;
        int i = (int) d;

        // implicit type conversion ( big <- small) -> Conversion
        int val = 'A';
        // System.out.println(val);

        int i1 = 8765;
        double d1 = 6785.98;
        d1 = i1;
        // System.out.println(d1);

        // @@@ Big story

        // if we want to convert out of rang value in casting
        byte byteVal; // byte range 127
        int intVal = 257;
        byteVal = (byte) intVal; // 257 % 256
        // Here modules with that heiger range value
        // System.out.println(byteVal);

        // Type promession

        byte gh1 = 30;
        byte gh2 = 30;
        int result = gh1 * gh2;

        System.out.println("End...");

    }
}
