package concept.inheritance;

// Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Interface for flying behavior
interface Flyable {
    void fly();
}

// Interface for swimming behavior
interface Swimmable {
    void swim();
}

// Derived class inheriting from Animal and implementing Flyable
class Bird extends Animal implements Flyable {
    @Override
    void eat() {
        System.out.println("Bird is eating");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}

// Derived class inheriting from Animal and implementing Swimmable
class Fish extends Animal implements Swimmable {
    @Override
    void eat() {
        System.out.println("Fish is eating");
    }

    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }
}

// Concrete class inheriting from Bird and Fish
class Duck extends Bird implements Swimmable {
    @Override
    void eat() {
        System.out.println("Duck is eating");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}

public class Hybrid {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.eat();
        duck.fly();
        duck.swim();
    }
}
