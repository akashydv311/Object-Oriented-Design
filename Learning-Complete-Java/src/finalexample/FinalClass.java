package finalexample;

// if i don't want to anyone override my class methods then it should be final class

final class A {
    public void show() {
        System.out.println("A in show");
    }

    public void printWithAgs(int a) {
        System.out.println("Method call");
    }
}

// class B extends A {
// // if A is a non final class then it's can be extended
// }

public class FinalClass {
    public static void main(String[] args) {
        A a = new A();
        a.show();
        a.printWithAgs(34);
    }
}
