package com.amdocs.multithreading;

public class MyThread50 extends Thread {

	@Override
	public void run() {
		try {
			synchronized (this) {
				System.out.println("(start) inside user thread: " + Thread.currentThread().getName());
				this.wait(100); // causes the currently executing thread to release the
						// lock on the object the it was holding the lock!
				System.out.println("(end) inside user thread: " + Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			throw new RuntimeException("Thread interrupted: " + e);
		}
	}

}
