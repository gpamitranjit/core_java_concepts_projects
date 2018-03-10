package com.amdocs.abstractClass;

/**
 * @author Amit
 * 
 * This means we are able to call the constructor of abstract class either it could be default constructor of parameterized constructor,
 * from it's subclass constructor!
 * that means implicitly the object of abstract class is being created!
 */

abstract class Bike {
	
	Bike(int speedLimit) {
		System.out.println("Bike constructor has been called with speedLimit of " + speedLimit + " kmph");
	}
	
	public Bike() {
		System.out.println("Bike default constructor is called");
	}
	
	abstract void run();
	
	void changeGear() {
		System.out.println("the gear of the bike has changed");
	}
	
}

class Honda extends Bike {
	
	Honda(int speedLimit) {
		super(60);
		System.out.println("Honda constructor has been called");
	}
	
	void run() {
		System.out.println("Honda bike is running");
	}
}

public class AbstractClass {

	public static void main(String[] args) {		
		Bike bike = new Honda(60);
		bike.changeGear();
		bike.run();
	}

}
