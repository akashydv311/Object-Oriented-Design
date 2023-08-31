package interfaces;

// class -> class = extends
// class -> interface = implements
// interface -> interface = extends

/*
 * Interface is like a class and it's methods by default is public abstract
 * 
 * All the variables in the interface by default final and static
 * why?? it happends
 * It happend becuase we do impliment from interface so we can only get the methods or we can't allowd to creat a objet of interfaces so values should be init.
 * 
 */

abstract class A {
    public abstract void show1();

    public abstract void show2();
}

interface X {
    void show1();

    void show2();
}

interface W {
    void go();
}

interface Z extends W {
    void run();
}

// concrete class
class Y implements X, Z {
    public void show1() {
        System.out.println("Show1");
    }

    public void show2() {
        System.out.println("Show2");
    }

    public void run() {
        System.out.println("Run");
    }

    public void go() {
        System.out.println("Go");
    }
}

public class Main {
    public static void main(String[] args) {
        X x;
        // x = new X();
        x = new Y();

        x.show1();
        x.show2();

        System.out.println("__________________");

        W w = new Y();
        w.go();

        System.out.println("__________________");

        Z z = new Y();

        z.go();
        z.run();

        System.out.println("__________________");

        Y y = new Y();
        y.run();
        y.show1();
        y.show2();
        y.go();
    }
}
