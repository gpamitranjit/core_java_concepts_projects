package com.amdocs.singleton.deserialized.solution;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class MainApp {

	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		
//		change the state of instance1
		instance1.setI(10);
		try {
			
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("object.ser"));
			out.writeObject(instance1);
			out.flush();
			
//			again change the state of instance1
			instance1.setI(20);
			
			ObjectInput in = new ObjectInputStream(new FileInputStream("object.ser"));
			try {
				Singleton instance2 = (Singleton) in.readObject();
				
				
				System.out.println("instance1 state: " + instance1.getI());
				System.out.println("instance2 state: " + instance2.getI());
				
			} catch (ClassNotFoundException e) {
				System.out.println("classNotfoundException: " + e.getMessage());
			}
			
		} catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}
	}

}
