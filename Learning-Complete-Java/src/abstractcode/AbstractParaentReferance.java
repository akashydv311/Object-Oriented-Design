package abstractcode;

abstract class Car1 {

    public abstract void engine();

    public abstract void drive();

    public void carColor() {
        System.out.println("Color is green!");
    }
}

// concrete class
class Suzuki extends Car1 {

    public void engine() {
        System.out.println("Engine is working!");
    }

    public void drive() {
        System.out.println("Drive your car!");
    }

}

public class AbstractParaentReferance {
    public static void main(String[] args) {

        Car1 mycar;
        mycar = new Suzuki();

        mycar.carColor();
        mycar.engine();
        mycar.drive();
    }
}
