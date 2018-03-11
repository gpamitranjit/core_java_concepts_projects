package com.amdocs.nestedinterface;

/**
 * inner-interface are used to group the related interfaces so that we can maintain it at ease
 * 
 * @author Amit
 *
 */
public class MainApp implements OuterInterface.InnerInterface {

	public static void main(String[] args) {
		MainApp obj = new MainApp();
		obj.msg();
	}

	@Override
	public void msg() {
		System.out.println("implementation of InnerInterface method in implementing class");
	}

}
