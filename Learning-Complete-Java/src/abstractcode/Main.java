package abstractcode;

/*
 * Abstract methods have not any definaction
 * Abstract methods should be in the abstract class
 * We can't create abstract class object we can only create obj of concrete class
 * But we can create a chile obj and parent refrence
 * 
 * Abrstract methods should be overrride in it's chid class
 * 
 * it's not compersurry thats abstract class mush have the abstract methods
 * if we are not defining all the abstrct methods in the it's child class the class must be abstract
 * 
 * in this code Car is a abstract class and Maruti is a concrete class
 */

abstract class Car {

    public abstract void engine();

    public abstract void drive();

    public void carColor() {
        System.out.println("Color is green!");
    }
}

// concrete class
class Maruti extends Car {

    public void engine() {
        System.out.println("Engine is working!");
    }

    public void drive() {
        System.out.println("Drive your car!");
    }

}

public class Main {
    public static void main(String[] args) {

        // Car abstractCar = new Car(); // We can't caret a obj
        Car maruti;
        // maruti = new Car();
        maruti = new Maruti();

        maruti.carColor();
        maruti.engine();
        maruti.drive();

    }
}
