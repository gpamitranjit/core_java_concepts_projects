package com.amdocs;

class MyDog {

	static void dogMethod() {
		System.out.println("dogMethod called");
	}
}

/**
 * @author Amit
 *
 */
public class EarlyBinding {

	public static void main(String[] args) {

		MyDog.dogMethod();
	}

}
