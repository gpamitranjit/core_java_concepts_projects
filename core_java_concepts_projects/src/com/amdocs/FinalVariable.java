package com.amdocs;

/**
 * @author Amit
 *
 */
public class FinalVariable {

	private final int a;
	
	private static final int b;
	
	static {
		b=200;
	}
	
	public FinalVariable() {
		a=100;		
	}
	
	public static void main(String[] args) {
		FinalVariable finalVariableObject = new FinalVariable();
		
		System.out.println("final variable a has: " + finalVariableObject.a);
		
		System.out.println("final static variable b has vlaue: " + b);
	}

}
