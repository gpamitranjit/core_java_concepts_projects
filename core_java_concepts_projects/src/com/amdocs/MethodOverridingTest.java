package com.amdocs;

class Parent {
	protected int getNumbericValue() {
		System.out.println("Message from Parent class");
		return 1;
	}
}

public class MethodOverridingTest extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Override
	protected short getNumbericValue() {
		System.out.println("Message from MethodOverridingTest class");
		return 2L;
	}

}
