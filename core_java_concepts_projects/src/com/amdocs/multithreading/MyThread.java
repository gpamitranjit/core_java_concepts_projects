package com.amdocs.multithreading;

/**
 * According to sun-microsystem a thread can have 4 states, but for better understanding we use 1 more state, they are as follows,
 * 	1. New state
 * 			--This is a state of the thread as soon as we create the thread before invoking it's start() method.
 * 
 * 	2. Runnable state
 * 			--This is a state of a thread when we call it's start() method but it's not being picked up by the Thread schedular of JVM for execution
 * 	
 * 	3. Running state (we have introduced for better understanding)
 * 			--This is a state of a thread when it's being picked up by the JVM thread Schedular for execution
 * 	
 * 	4. Non-Runnable (Blocked) state
 * 			--This is a state of a thread when the current execution of a thread is being blocked by some I/O, or waiting for user input, or the thread might be blocked (waiting) to acquire the resources of some other thread 
 * 	
 * 	5. Terminated state
 * 			--This is a state of a thread when the thread execution completes (when the thread exits from it's run() method body)	
 * 	
 * @author Amit
 *
 */
public class MyThread extends Thread {

	public void run() {
		System.out.println("Thread is running");
	}
	
	public static void main(String[] args) {
		
		MyThread threadObject = new MyThread();
		threadObject.start();
	}

}
