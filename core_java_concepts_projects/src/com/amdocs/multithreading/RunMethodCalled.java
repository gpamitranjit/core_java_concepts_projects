package com.amdocs.multithreading;



public class RunMethodCalled {

	public static void main(String[] args) {
		Hello helloTheadableObject = new Hello();
		Thread t1 = new Thread(helloTheadableObject);
		Thread t2 = new Thread(helloTheadableObject);
		
		t1.setDaemon(true);
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			System.out.println("InterruptedException: " + e.getMessage());
		}
		t2.start();
	}

}
