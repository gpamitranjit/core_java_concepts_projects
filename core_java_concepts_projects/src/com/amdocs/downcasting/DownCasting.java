package com.amdocs.downcasting;


class Animal {
	
}

class Dog1 extends Animal {

	protected void dog1Method() {
		System.out.println("dog1Method() is called");
	}
}


class Dog2 extends Dog1 {
	
	static void method(Animal animal) {
		if(animal instanceof Dog2) {
			
			Dog2 dog = (Dog2) animal;
			dog.barking();
			
		}else  {
			
			System.out.println("animal object is not an instance of Dog2!");
			System.out.println("hence we care casting the animal object into Dog1,");
			Dog1 dog1 = (Dog1) animal;
			dog1.dog1Method();
			
		}
	}
	
	
	void barking() {
		System.out.println("dog is barking!");
	}
}

public class DownCasting {

	public static void main(String[] args) {
		Animal animal = new Dog1();
		Dog2.method(animal);
		
	}

}
