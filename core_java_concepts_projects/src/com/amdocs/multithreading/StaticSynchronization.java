package com.amdocs.multithreading;

class Message {

	synchronized static void print(String msg) {
		
		for(int i=1; i <= 5; i++) {
			try {
				System.out.println("index: " + i + " Current Thread: " + Thread.currentThread().getName() + ", Message: " + msg);
				Thread.sleep(1000);
			} catch (Exception e) {
				System.err.println("Exception: " + e.getMessage());
			}
		}

	}
	
}


class MyThread20 implements Runnable {

	private String msg;
	
	protected String getMsg() {
		return msg;
	}

	protected void setMsg(String msg) {
		this.msg = msg;
	}

	MyThread20(String msg) {
		this.msg = msg;
	} 
	
	@Override
	public void run() {
		Message.print(msg);
	}
	
	
}


/**
 * @author Amit
 * 
 */
public class StaticSynchronization {

	public static void main(String[] args) {
		
		
		MyThread20 threadableObject1 = new MyThread20("Hello Amit");
		MyThread20 threadableObject2 = new MyThread20("Hello Ranjit");
		
		
//		use of either of above threadable object have no affect on the thread creation!
		
		Thread actualThread1 = new Thread(threadableObject1);
		Thread actualThread2 = new Thread(threadableObject1);
		
		
		actualThread1.start();
		actualThread2.start();
		
	}

}
