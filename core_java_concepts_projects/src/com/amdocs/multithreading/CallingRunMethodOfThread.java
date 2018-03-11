package com.amdocs.multithreading;

class MyThread4 implements Runnable {

	@Override
	public void run() {
		
		for(int i=1; i<=5; i++) {
			
			try {
				
//				This call to Thread.sleep() method is sleeping the main Thread not either of the two that what we have created
				System.out.println("Current Thread Name: " + Thread.currentThread().getName());
				Thread.sleep(500);
				
			} catch (InterruptedException e) {
				
				System.out.println("Exception: " + e.getMessage());
				
			}
			System.out.println(i);
		}
	}
	
}


/**
 * How Many threads are running in below program?
 * only 1
 * 
 * @author Amit
 *
 */
public class CallingRunMethodOfThread {

	public static void main(String[] args) {
		
//		creating threadable object on which actual thread object thread object will work!
		MyThread4 threadableObject = new MyThread4();
		
		
//		creating actual thread object 
		Thread actualThreadObject = new Thread(threadableObject);

//		creating another actual thread object
		Thread actualThreadObject2 = new Thread(threadableObject);
		
		
//		calling directly run() method of actual thread object and hence the thread will not start in separate call stack although the thread will run!
//		the problem of calling run() method directly is that JVM don't get the special signal to start the thread in separate call stack and it will start the execution in the same call stack as that of main thread call stack
//		moreover the JVM will consider the call as normal sequential call!!
		actualThreadObject.run();
		actualThreadObject2.run();
	}

}
