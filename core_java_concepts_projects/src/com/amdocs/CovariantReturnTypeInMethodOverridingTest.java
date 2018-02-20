package com.amdocs;

class A {
	protected A get() {
		return this;
	}
	
	private void printMessage() {
		System.out.println("a message from A class");
	}
}


class B extends A {
	
	@Override
	protected B get() {
		return this;
	}
	
	protected void printMessage() {
		System.out.println("a message from B class");
	}
}
public class CovariantReturnTypeInMethodOverridingTest {

	public static void main(String[] args) {
		B obj = new B();
		obj.get().printMessage();
	}

}
