package com.amdocs.multithreading;

/*
Two Thread working on same thread and we have avoided the race condition by using synchronized block 
and hence until the firstly entered thread completes' it's work the second thread won't be able to enter the block
and once the firstly entered thread completes it's task the second thread enters and get it's job done
*/
class MyThread1 implements Runnable {

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
public class UsingRunnableInterface {

	public static void main(String[] args) {
		
		MyThread1 thread = new MyThread1();
		
		Thread actualThreadObject = new Thread(thread);
		Thread actualThreadObject2 = new Thread(thread);
		
		actualThreadObject.start();
		actualThreadObject2.start();
	}

}
