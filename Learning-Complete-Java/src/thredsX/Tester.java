package thredsX;

// let's take 3 classes 

class Z {

}

class X extends Z implements Runnable {

    public void run() {

        System.out.println(Thread.currentThread());

        for (int i = 0; i <= 100; i++) {
            System.out.println("Hii");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        // int i = 0;
        // while (i < 100) {
        // System.out.println("hii");
        // i++;
        // }
        // try {
        // Thread.sleep(100);
        // } catch (InterruptedException e) {
        // System.out.println("Exception");
        // }
    }
}

class Y implements Runnable {

    public void run() {

        System.out.println(Thread.currentThread());

        for (int i = 0; i <= 100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        // int i = 0;
        // while (i < 100) {
        // System.out.println("hello");
        // i++;
        // try {
        // Thread.sleep(100);
        // } catch (InterruptedException e) {
        // System.out.println("Exception");
        // }
        // }
    }
}

public class Tester {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread());

        Runnable x = new X();
        Runnable y = new Y();

        Thread t1 = new Thread(x);
        Thread t2 = new Thread(y);

        t1.start();
        // try {
        // Thread.currentThread().sleep(1000);
        // } catch (InterruptedException e) {

        // e.printStackTrace();
        // }
        t2.start();
    }
}
