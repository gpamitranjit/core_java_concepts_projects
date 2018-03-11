package com.amdocs.multithreading;


class MyThread12 implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " running");
		try {
			
			Thread.sleep(500);
			
		} catch (InterruptedException e) {
			
			System.out.println("Exception: " + e.getMessage());
			
		}
	}
	
}


/**
 * Thread group is a convient way of group multiple thread and it becomes easy to maintain the life of multiple thread all at once,
 * like by a single call on threadgroup we could actually may interrupt, suspend, or even terminate!
 * 
 * @author Amit
 *
 */
public class MyThreadGroup {

	public static void main(String[] args) {
		
		ThreadGroup myThreadGroup = new ThreadGroup("Thread Group A");
		
		MyThread12 threadableObject = new MyThread12();
		Thread actualThreadObject1 = new Thread(myThreadGroup, threadableObject, "threadOne");
		Thread actualThreadObject2 = new Thread(myThreadGroup, threadableObject, "threadTwo");
		
		
		actualThreadObject1.start();
		actualThreadObject2.start();
		
		
		System.out.println("Thread Group information: " + myThreadGroup.getName());
		

		System.out.println("list all the thread information from thread Group,");
		myThreadGroup.list();
		
	}

}
