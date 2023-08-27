package constructorexample;

class A extends Object {

    public A() {
        super(); // Every class in java extend Object class
        System.out.println("Const of A");
    }

    public A(int num) {
        System.out.println("Const of A-> perameter(int)");
    }
}

class B extends A {

    public B() {
        // super(); // By default it is present
        System.out.println("Cnst of B");
    }

    public B(int num) {
        super(num); // we can call perametrase super
        System.out.println("Const of B-> perameter(int)");
    }

    public B(char ch) {
        this(5);
    }
}

public class ThisSuper {
    public static void main(String[] args) {

        B b1 = new B(6);

        B b2 = new B();

        B b3 = new B('H');

    }
}
