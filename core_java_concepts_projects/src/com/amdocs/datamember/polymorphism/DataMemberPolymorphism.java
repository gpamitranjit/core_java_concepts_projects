package com.amdocs.datamember.polymorphism;

class Bike {
	int speedLimit = 100;

	protected int getSpeedLimit() {
		System.out.println("called getSpeedLimit() method of Bike class");
		return speedLimit;
	}

	protected void setSpeedLimit(int speedLimit) {
		this.speedLimit = speedLimit;
	}
	
}

class Splender extends Bike {
	int speedLimit = 60;

	protected int getSpeedLimit() {
		System.out.println("called getSpeedLimit() method of Splender class");
		return this.speedLimit;
	}

	protected void setSpeedLimit(int speedLimit) {
		this.speedLimit = speedLimit;
	}
	
	
	
}

public class DataMemberPolymorphism {

	public static void main(String[] args) {
		Bike bike = new Splender();
		
		System.out.println("speedLimit: "  + bike.getSpeedLimit());
		System.out.println("speedLimit variable accessed directly: " + bike.speedLimit);
		
	}

}
