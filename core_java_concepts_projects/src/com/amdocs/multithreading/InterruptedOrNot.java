package com.amdocs.multithreading;

public class InterruptedOrNot {

	public static void main(String[] args) {
		MyThread53 myThread53 = new MyThread53();
		
		myThread53.start();
		
		myThread53.interrupt();
//		if(myThread51.isInterrupted()) {
//			System.out.println("(from main thread) Thread is interrupted!");
//		}else {
//			System.out.println("(from main thread) Thread is not interrupted!");
//		}
		
		System.out.println("end of main thread.");
	}

}
