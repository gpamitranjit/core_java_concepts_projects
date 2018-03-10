package com.amdocs.interfaceConcepts;

public class Java8InterfaceImpl implements Java8Interface {

	public static void main(String[] args) {
		Java8Interface obj = new Java8InterfaceImpl();
		obj.draw();
		obj.message();
	}

	@Override
	public void draw() {
		System.out.println("draw implementation from implementation class");
	}

}
