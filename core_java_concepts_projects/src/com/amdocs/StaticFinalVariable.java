package com.amdocs;

public class StaticFinalVariable {

	final static int a;

	static {
		System.out.println("static block invoked!");
		a =100;
		System.out.println("a: " + a);
	}
	
	public static void main(String[] args) {
		
	}

}
