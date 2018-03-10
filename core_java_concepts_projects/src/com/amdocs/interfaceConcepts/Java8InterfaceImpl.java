package com.amdocs.interfaceConcepts;

public class Java8InterfaceImpl implements Java8Interface {

	public static void main(String[] args) {
		Java8Interface obj = new Java8InterfaceImpl();
		obj.draw();
		obj.message();
		
//		calling static method of java8 interface
		int result = Java8Interface.cube(10);
		System.out.println("result of calling java8 static method: " + result);
	}

	@Override
	public void draw() {
		System.out.println("draw implementation from implementation class");
	}

}
