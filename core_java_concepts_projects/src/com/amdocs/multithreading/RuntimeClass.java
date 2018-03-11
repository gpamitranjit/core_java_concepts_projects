package com.amdocs.multithreading;

/**
 * only one instance of Runtime class will be available for one java application
 * 
 * @author Amit
 *
 */
public class RuntimeClass {

	public static void main(String[] args) {
		
		Runtime runtime = Runtime.getRuntime();
		System.out.println(runtime.availableProcessors());
		
	}

}
