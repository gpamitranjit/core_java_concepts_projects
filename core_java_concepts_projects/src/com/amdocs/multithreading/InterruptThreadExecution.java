package com.amdocs.multithreading;

/**
 * @author Amit
 *
 *         you can't call myThread.wait() from other thread's callstack like you
 *         can't call myThread.wait() from main method as the main method's
 *         thread isn't the owner of the monitor that the target thread has!
 */
public class InterruptThreadExecution {

	public static void main(String[] args) {
		MyThread50 myThread = new MyThread50();
		myThread.start();

		try {
//			you can't call myThread.wait() as you aren't the owner of the thread monitor
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}

	}

}
