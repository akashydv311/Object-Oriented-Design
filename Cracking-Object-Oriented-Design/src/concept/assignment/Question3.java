package concept.assignment;

// can we Overrid the static methods?
// Parical Yes!
/*
 * static methods cannot be overridden in the traditional sense, and they are bound to the class they are defined in, not to instances of the class. Subclasses can declare static methods with the same name as the superclass, but these do not override the superclass's static methods. The method called is determined at compile time based on the reference type.
 */
class Parent {
    static void staticMethod() {
        System.out.println("Static method in Parent class");
    }
}

class Child extends Parent {
    static void staticMethod() {
        System.out.println("Static method in Child class");
    }
}

public class Question3 {
    public static void main(String[] args) {

        Parent.staticMethod();
        Child.staticMethod();

        Parent p = new Child();
        Parent.staticMethod(); // Calls Parent's staticMethod, not Child's, because it's determined at compile
        // time.
    }
}
