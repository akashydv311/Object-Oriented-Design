package thredsX;

// class P implements Runnable {

//     public void run() {

//         System.out.println(Thread.currentThread());

//         for (int i = 0; i <= 100; i++) {
//             System.out.println("Hii");
//             try {
//                 Thread.sleep(100);
//             } catch (InterruptedException e) {
//                 System.out.println(e.getMessage());
//             }
//         }

//     }
// }

// class Q implements Runnable {

//     public void run() {

//         System.out.println(Thread.currentThread());

//         for (int i = 0; i <= 100; i++) {
//             System.out.println("Hello");
//             try {
//                 Thread.sleep(100);
//             } catch (InterruptedException e) {
//                 System.out.println(e.getMessage());
//             }
//         }

//     }
// }

public class LambdaThread {
    public static void main(String[] args) {

        Runnable p1 = () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hii");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        };

        Runnable q1 = () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        };

        Thread th1 = new Thread(p1);
        Thread th2 = new Thread(q1);

        th1.start();
        th2.start();
    }
}
