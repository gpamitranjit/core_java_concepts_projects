package com.amdocs;

class A {
	
	protected int a =10;
	
	A get() {
		return this;
	}
	
	A() {}
	
	A(int a) {
		
	}
}


class B extends A {
	B get() {
		return this;
	}
	
	B() {
		this(1000);
	}
	
	
	B(int a) {
		System.out.println("class B's constructor B(int a) called with value of a being : "  + a);
	}
	void displayB() {
		System.out.println("value of a from parent class of B: " + super.a);
		System.out.println("displayB() method called!");
	}
}

public class MethodOverridng {

	public static void main(String[] args) {
		B bObject = new B();
		
		bObject.displayB();
	}

}
