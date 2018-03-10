package com.amdocs.interfaceConcepts;

/**
 * As you can see we get a warning in eclipse IDE saying we are trying to access the static field of interface in a non-static way
 * 
 * @author Amit
 * 
 */
public class InterfaceCheck implements MyInterface {

	public static void main(String[] args) {
		MyInterface interfaceObject = new InterfaceCheck();
		System.out.println("value of variable a in interface: " + interfaceObject.a);
	}

	@Override
	public void myMethod() {
		System.out.println("implementation of myMethod in implementing class!");
	}

}
