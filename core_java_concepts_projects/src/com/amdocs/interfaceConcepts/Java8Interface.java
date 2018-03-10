package com.amdocs.interfaceConcepts;


/**
 * Since java 8 an interface can have default methods
 * 
 * @author Amit
 *
 */
public interface Java8Interface {

	void draw();
	default void message() {
		System.out.println("default message from default method");
	}
}
