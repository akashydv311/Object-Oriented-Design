package abstractcode;

abstract class Car {

    public abstract void engine();

    public abstract void drive();

    public void carColor() {
        System.out.println("Color is green!");
    }
}

public class Abstract1 {
    public static void main(String[] args) {

        // Car abstractCar = new Car(); // We can't caret a obj

        Car tata = new Car() { // concrete class
            public void engine() {
                System.out.println("Engine is working!");
            }

            public void drive() {
                System.out.println("Drive your car!");
            }
        };

        tata.carColor();
        tata.engine();

    }
}
