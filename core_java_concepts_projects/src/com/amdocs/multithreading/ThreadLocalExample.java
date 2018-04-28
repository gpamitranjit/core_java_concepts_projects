package com.amdocs.multithreading;

public class ThreadLocalExample {

	public static class MyRunnable implements Runnable {

		private ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
		
		
		@Override
		public void run() {
			
			threadLocal.set((int) (Math.random() * 100D));
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("InterruptedException: " + e.getMessage());
			}
			
			System.out.println("["+ Thread.currentThread().getName() +"]: " + threadLocal.get());
			
		}
		
	}
	public static void main(String[] args) {
		MyRunnable sharedRunnableResource = new MyRunnable();
		
		Thread thread1 = new Thread(sharedRunnableResource);
		Thread thread2 = new Thread(sharedRunnableResource);
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			System.out.println("InterruptedException: " + e.getMessage());
		}
	}

}
