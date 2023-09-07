package interfaces;

// functional interface has only one method
@FunctionalInterface
interface Demo {
    void showX();

}

public class FunctionalInterfaceExample implements Demo {
    public void showX() {
        System.out.println("hello!");
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample fi = new FunctionalInterfaceExample();
        fi.showX();
    }
}
