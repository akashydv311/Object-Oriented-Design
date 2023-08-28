package polymorphism;

// Early Binding
// Overloding is a part of compiler time polymorphysim
class Test1 {
    public int value() {
        return 0;
    }

    public int value(int x) {
        return x;
    }

    public int value(int x, int y) {
        return x + y;
    }
}

public class CompilerTime {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.value(23, 23);
        t1.value();
    }
}
