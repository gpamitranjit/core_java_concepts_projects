package com.amdocs.multithreading;

public class MultiThreadingDeadLock {

	public static void main(String[] args) {
		final String resource1 = "Amit";
		final String resource2 = "Ranjit";

		Thread t1 = new Thread(() -> {
			System.out.println("ThreadName: " + Thread.currentThread().getName() + "running");
			synchronized (resource1) {
				System.out.println("Thread " + Thread.currentThread().getName() + " locking resource1");
				try {
					Thread.sleep(100);

					synchronized (resource2) {
						System.out.println("Thread " + Thread.currentThread().getName() + " locking resource2");
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							System.out.println("InterruptedException: " + e.getMessage());
						}
					}
				} catch (InterruptedException e) {
					System.out.println("InterruptedException: " + e.getMessage());
				}
			}

		});

		Thread t2 = new Thread(() -> {
			System.out.println("ThreadName: " + Thread.currentThread().getName() + "running");
			synchronized (resource2) {
				System.out.println("Thread " + Thread.currentThread().getName() + " locking resource2");
				try {
					Thread.sleep(100);
					synchronized (resource1) {
						System.out.println("Thread " + Thread.currentThread().getName() + " locking resource1");
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							System.out.println("InterruptedException: " + e.getMessage());
						}
					}
				} catch (InterruptedException e) {
					System.out.println("InterruptedException: " + e.getMessage());
				}
			}
		});

		t1.start();
		t2.start();

	}

}
