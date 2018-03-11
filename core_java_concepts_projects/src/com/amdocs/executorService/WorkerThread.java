package com.amdocs.executorService;

public class WorkerThread implements Runnable {

	private String message;
	
	protected String getMessage() {
		return message;
	}

	protected void setMessage(String message) {
		this.message = message;
	}

	public WorkerThread(String message) {
		this.message = message;
	}
	
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + " (start) message: " + this.getMessage());
		processMessage();
		System.out.println(Thread.currentThread().getName() +  " (end)");
		
	}
	
	private void processMessage() {
		try {
			
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			
			System.out.println("InterruptedException: " + e.getMessage());
			
		}
	}

}
