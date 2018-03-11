package com.amdocs.multithreading;

class MyThread5 implements Runnable {

	@Override
	public void run() {
		
		for(int i=1; i<=5; i++) {
			
			try {
				
				Thread.sleep(500);
				
			} catch (InterruptedException e) {
				
				System.out.println("Exception Message: " + e.getMessage());
				
			}
			
			System.out.println(i);
		}
	}
	
}


/**
 * @author Amit
 *
 */
public class ThreadJoinMethod {

	public static void main(String[] args) {
		
		MyThread5 threadableObject = new MyThread5();
		
		Thread actualThreadObject1 = new Thread(threadableObject);
		Thread actualThreadObject2 = new Thread(threadableObject);
		
		
//		start the execution of actualThreadObject1
		actualThreadObject1.start();

		
		try {
//			let the main thread stop it's execution for 1500 miliseconds
//			in other words, let actualThreadObject1 execute for 1500 miliseconds and terminate
			actualThreadObject1.join(1500);
			
		} catch (InterruptedException e) {
			System.err.println("Exception message: " + e.getMessage() );
		}
		

		
		actualThreadObject2.start();
	}

}
