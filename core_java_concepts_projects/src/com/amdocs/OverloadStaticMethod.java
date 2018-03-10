package com.amdocs;

/**
 * @author Amit
 *
 */
public class OverloadStaticMethod {

	public static void main(String[] args) {
//		showcasing the compile time polymorphism in java
		display();
		display(100);
	}

	
	static void display() {
		System.out.println("display() method called!");
	}
	
	static void display(int a) {
		System.out.println("display(int) method called with parameter: " + a);
	}
}
