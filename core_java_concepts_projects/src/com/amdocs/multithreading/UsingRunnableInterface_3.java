package com.amdocs.multithreading;

/*

As you can see we have only one threadable object of type MyThread3 and two actual thread object working on the same thread and due to non-synchronized body they both are in race condition
i.e when one thread goes to sleep the other thread is taking over the CPU execution
*/
class MyThread3 implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {

			synchronized (this) {
				try {

					Thread.sleep(500);

				} catch (InterruptedException e) {

					System.err.println(e.getMessage());

				}
			}

			System.out.println(i);
		}
	}

}

/**
 * @author Amit
 *
 */
public class UsingRunnableInterface_3 {

	public static void main(String[] args) {

		// only one threadable object
		MyThread3 thread1 = new MyThread3();

		// creating two threads and let these two threads work on the same
		// object and notice that these two thread run into race condition
		Thread actualThreadObject = new Thread(thread1);
		Thread actualThreadObject2 = new Thread(thread1);

		actualThreadObject.start();
		actualThreadObject2.start();
	}

}
