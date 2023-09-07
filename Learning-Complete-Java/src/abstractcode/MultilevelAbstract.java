package abstractcode;

abstract class Carx {

    public abstract void engine();

    public abstract void drive();

    public void carColor() {
        System.out.println("Color is green!");
    }
}

// if we are not defining all the abstrct methods in the it's child class the
// class must be abstract
abstract class Marutix extends Carx {

    public void engine() {
        System.out.println("Engine is working!");
    }

}

// concrete class
class MarutiSuzukix extends Marutix {
    public void drive() {
        System.out.println("Drive your car!");
    }
}

public class MultilevelAbstract {
    public static void main(String[] args) {

        // Car abstractCar = new Car(); // We can't caret a obj
        Marutix marutix = new MarutiSuzukix();

        marutix.carColor();
        marutix.engine();
        marutix.drive();

    }
}
