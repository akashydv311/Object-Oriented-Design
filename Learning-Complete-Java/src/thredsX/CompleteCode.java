package thredsX;

/*
 * we have maney thread state present
 * New  -> creat thread
 * Runnable -> .start() & before run() (ex - waitting for secudler)
 * Running -> run() -> executting run() method
 * Waitting -> sleep(), wait() ( after wait we should use notify())
 * Dead
 */

class Calculater {
	private int count;

	public int getCount() {
		return this.count;
	}

	public synchronized void increment() {
		count++;
	}
}

public class CompleteCode {
	public static void main(String[] args) throws InterruptedException {

		Calculater cal = new Calculater();

		Runnable mobj1 = () -> {
			for (int i = 0; i < 1000; i++) {
				cal.increment();
			}
		};

		Runnable mobj2 = () -> {
			for (int i = 0; i < 1000; i++) {
				cal.increment();
			}
		};

		Thread mt1 = new Thread(mobj1);
		Thread mt2 = new Thread(mobj2);

		System.err.println(cal.getCount());

		mt1.start();
		mt2.start();

		mt1.join();
		mt2.join();

		System.err.println(cal.getCount());

	}
}
