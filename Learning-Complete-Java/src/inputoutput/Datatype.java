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
        System.out.println(wrappedInt);

        // Auto boxing
        int primitiveInt1 = 76;
        Integer wrappedInt1 = primitiveInt1; // Auto-boxing
        System.out.println(wrappedInt1);

        int newValue = Integer.valueOf(90);
        System.out.println(newValue);

        // Unboxing
        Integer wrappedInt2 = Integer.valueOf(42);
        int conInt = wrappedInt2.intValue(); // Unboxing
        double conDouble = wrappedInt2.doubleValue();
        float conFloat = wrappedInt2.floatValue();

        // Use of datatype
        int x = 10;
        short x1 = 10;
        long x2 = 10l;
        float y = 10.87f;
        double z = 10.0;
        char c = 'c';
        boolean b = true;

        // Conversion

        // explicit type conversion
        int num = 10;
        byte newNum = (byte) num;

        int num1 = 10;
        char ch = (char) num1;
        ch = (char) 65;
        System.out.println(ch);

        double d = 189.876;
        int i = (int) d;

        // implicit type conversion ( big <- small)
        int val = 'A';
        System.out.println(val);

        int i1 = 8765;
        double d1 = 6785.98;
        d1 = i1;
        System.out.println(d1);

    }
}
