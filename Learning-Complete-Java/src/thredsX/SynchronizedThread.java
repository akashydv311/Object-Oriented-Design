package thredsX;

class Counterx {
    public int countx;

    public synchronized void incrementx() {
        countx++;
    }
}

// synchronized protect us to conflit in the methods
public class SynchronizedThread {
    public static void main(String[] args) throws InterruptedException {
    	
        Counterx c1x = new Counterx();

        Runnable obj1x = () -> {
            for (int i = 0; i < 1000; i++) {
                c1x.incrementx();
            }
        };

        Runnable obj2x = () -> {
            for (int i = 0; i < 1000; i++) {
                c1x.incrementx();
            }
        };

        Thread t1x = new Thread(obj1x);
        Thread t2x = new Thread(obj2x);

        t1x.start();
        t2x.start();
        
        t1x.join();
        t2x.join();

        System.out.println(c1x.countx);

    }
}
