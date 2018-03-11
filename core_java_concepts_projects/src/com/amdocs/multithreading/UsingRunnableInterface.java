package com.amdocs.multithreading;


class MyThread1 implements Runnable {

	@Override
	public void run() {
		System.out.println("my Thread is running");
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
		actualThreadObject.start();
	}

}
