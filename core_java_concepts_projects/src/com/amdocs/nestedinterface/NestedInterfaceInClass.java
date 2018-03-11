package com.amdocs.nestedinterface;

//A class containing nested interface as below

class A {
	
	public interface Message {
		
		void msg();
		
	}  
}

/**
 * nested interface can contain in side a class as below!
 * 
 * @author Amit
 *
 */
public class NestedInterfaceInClass implements A.Message {

	public static void main(String[] args) {
		
		NestedInterfaceInClass obj = new NestedInterfaceInClass();
		obj.msg();
		
	}

	@Override
	public void msg() {
		System.out.println("msg() method with it's implementation is called");
	}

}
