package com.amdocs.multithreading;

public class MyThread53 extends Thread {

	@Override
	public void run() {
		for(int i=1; i<= 5; i++)  {
			System.out.println("From thread " + Thread.currentThread().getName() + " with index: " + i);
		}
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println("InterruptedExeception: " + e.getMessage());
		}
		
	}
	
}
