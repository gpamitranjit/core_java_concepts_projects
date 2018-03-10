package com.amdocs;

class Bike {
	void run() {
		System.out.println("Bike is running");
	}
}

class Splender extends Bike {
	void run() {
		System.out.println("Splender Bike is running");
	}
	
	void getBikeDescription() {
		System.out.println("Splender Bike discription...");
	}
}


public class RuntimePolymorhisum {

	public static void main(String[] args) {
		Bike bike = new Splender();
		bike.run();
	}

}
