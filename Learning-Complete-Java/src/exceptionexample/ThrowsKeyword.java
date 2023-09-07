package exceptionexample;

class Lazry {

    public void callShow() throws ClassNotFoundException {
        A obj = new A();
        obj.show();
    }
}

class A {
    public void show() throws ClassNotFoundException {
        Class.forName("Laptop");
    }
}

public class ThrowsKeyword {
    public static void main(String[] args) {

        Lazry z = new Lazry();

        try {
            z.callShow();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found! ");
        } catch (Exception e) {
            System.out.println("Exception Occurred!");
        }
    }
}
