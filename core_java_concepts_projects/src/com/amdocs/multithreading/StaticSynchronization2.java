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
	private Message messageObject;
	
	protected String getMsg() {
		return msg;
	}

	protected void setMsg(String msg) {
		this.msg = msg;
	}

	MyThread20(String msg, Message messageObject) {
		this.msg = msg;
		this.messageObject = messageObject;
	} 
	
	@Override
	public void run() {
		messageObject.print(msg);
	}
	
	
}


/**
 * @author Amit
 * 
 */
public class StaticSynchronization2 {

	public static void main(String[] args) {
		
		Message msg = new Message();
		
		MyThread20 threadableObject1 = new MyThread20("Hello Amit", msg);
		MyThread20 threadableObject2 = new MyThread20("Hello Ranjit", msg);
		
		
//		use of either of above threadable object have no affect on the thread creation!
		
		Thread actualThread1 = new Thread(threadableObject1);
		Thread actualThread2 = new Thread(threadableObject2);
		
		
		actualThread1.start();
		actualThread2.start();
		
	}

}
