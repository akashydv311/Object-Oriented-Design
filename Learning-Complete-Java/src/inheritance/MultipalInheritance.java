package inheritance;

class A {

}

class B {

}

// class C extends A, B {

// }

/*
 * This is not working in java becuse it's an ambiguity problem
 * 
 * example:-
 * if we have a method called ex() in B and A Both then c object whitch method
 * calles??
 * it's an ambiguity for java that's the reasion why java dosn't support
 * multipal inheritanc
 * we can do multipal inheritance with the help of interfaces
 */

interface Swimmer {
    void swim();
}

interface Flyer {
    void fly();
}

class Duck implements Swimmer, Flyer {
    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }
}

public class MultipalInheritance {
    public static void main(String[] args) {
        // indirect way of doing multipal inheritance
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }
}
