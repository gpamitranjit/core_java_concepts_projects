package com.amdocs.multithreading;

public class Hello implements Runnable {

	@Override
	public void run() {
		try {
			if(Thread.currentThread().isDaemon()) {
				System.out.println("Daemon Thread is working");
			}
			else {
				System.out.println("user thread is working");
				for (int i = 0; i < 5; i++) {
					System.out.println(i + ", state: " + Thread.currentThread().getState() + ", threadName: " + Thread.currentThread().getName());
					Thread.sleep(1000);

				}
			}

		} catch (InterruptedException e) {
			System.out.println("InterruptedException: " + e.getMessage());
		}
	}
}
