package com.amdocs.nesetedClasses;

import com.amdocs.nestedinterface.MainApp;

/**
 * A class can contain both static inner class or non-static inner class
 * 
 * A static inner class can access the members of of it's outer class via outerclass' object where as
 * A non-static inner class can access the members of it's outer class directly!
 * 
 * the above concept is similar to, a class containing static and non-static methods
 * 		As we know static methods access the members of it's class via instance of it's class where as
 * 		A non-static class access the members of it's class directly!.
 * 
 * The use of static and non-static inner classes is illustrated in below code
 * 
 * @author Amit
 *
 */
public class OuterClass {
	
//	outer class member variable
	private int x = 100;
	
private int getX() {
		return x;
	}

	//	static inner class
	static class StaticInnerClass {
		void innerMethod() {
			System.out.println("accessing outer class members via it's object: " + new OuterClass().getX());
		}
	}
	
//	non-static inner class
	class NonStaticInnerClass {
		void innerMethod() {
			System.out.println("accessing outer class members directly: " + getX());
		}
	}
	
	public static void main(String[] args) {
		
		new OuterClass.StaticInnerClass().innerMethod();
		
		new OuterClass(). new NonStaticInnerClass().innerMethod();
		
	}
}
