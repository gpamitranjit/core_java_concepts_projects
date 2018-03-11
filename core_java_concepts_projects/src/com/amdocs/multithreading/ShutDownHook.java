package com.amdocs.multithreading;


class MyThread25 implements Runnable {

	@Override
	public void run() {
		System.out.println("Shutdonw hook task completed!");
	}
	
}

/**
 * 
 * We will be using addShutdownHook() method of Runtime class to register a thread with virtual machine that will be invoked when the JVM is about to shutdown
 * 
 * @author Amit
 *
 */
public class ShutDownHook {

	public static void main(String[] args) {
		
		MyThread25 threadableObject = new MyThread25();
		Thread actualTheadObject = new Thread(threadableObject);
		
		Runtime runtimeObject = Runtime.getRuntime();
		runtimeObject.addShutdownHook(actualTheadObject);
		
		
		System.out.println("press Ctrl + c to invoke shutdown hook");
		try {
			
			Thread.sleep(50);
			
		} catch (InterruptedException e) {
			System.out.println("InterruptedException: " + e.getMessage());
		}
	}

}
