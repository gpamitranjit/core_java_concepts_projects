package com.amdocs;

class MyDog {
	
	static void dogMethod() {
		System.out.println("dogMethod called");
	}
}

public class EarlyBinding {

	public static void main(String[] args) {
		
		MyDog.dogMethod();
	}

}
