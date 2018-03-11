package com.amdocs.multithreading;

/*

As you can see we have created two threadable object and two separate threads are working on their own threadable object and hence there is not race condition in this!

*/
class MyThread2 implements Runnable {

	@Override
	public void run() {
		
		synchronized(this) {
			
			for(int i=1; i <= 5; i++) {
				
				try {

					Thread.sleep(500);

				} catch (InterruptedException e) {
					
					System.err.println(e.getMessage());
					
				}
				
				System.out.println(i);
			}
		}
	}
	
}

/**
 * @author Amit
 *
 */
public class UsingRunnableInterface_2 {

	public static void main(String[] args) {
		
		MyThread2 thread1 = new MyThread2();
		MyThread2 thread2 = new MyThread2();
		Thread actualThreadObject = new Thread(thread1);
		Thread actualThreadObject2 = new Thread(thread2);
		
		actualThreadObject.start();
		actualThreadObject2.start();
	}

}
