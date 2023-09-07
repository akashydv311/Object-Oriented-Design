package thredsX;

class A extends Thread {

    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("Hii");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = new B();

        // System.out.println(obj2.getPriority()); // 5
        // System.out.println(obj1.getPriority()); // 5

        // we can only suggest to JVM for priorepty but not forcing

        obj2.setPriority(10);
        System.out.println(obj2.getPriority());

        obj1.start();
        obj2.start();
    }
}
