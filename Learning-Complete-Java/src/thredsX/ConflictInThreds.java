package thredsX;

class Counter {
    public int count;

    public void increment() {
        count++;
    }
}

public class ConflictInThreds {
    public static void main(String[] args) throws InterruptedException {

        Counter c1 = new Counter();

        Runnable obj11 = () -> {
            for (int i = 0; i <= 1000; i++) {
                c1.increment();
            }
        };

        Runnable obj12 = () -> {
            for (int i = 0; i <= 1000; i++) {
                c1.increment();
            }
        };

        Runnable obj13 = () -> {
            for (int i = 0; i <= 1000; i++) {
                c1.increment();
            }
        };

        Thread t11 = new Thread(obj11);
        Thread t12 = new Thread(obj12);
        Thread t13 = new Thread(obj13);

        System.out.println(c1.count);

        t11.start();
        t12.start();
        t13.start();

        t11.join();
        t12.join();
        t13.join();

        System.out.println(c1.count);
    }
}
