package com.amdocs.javaSerialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


/**
 * Note that the parent class "Person" of "Student" class implements the Serilizable interface and hence it's subclasses will be able to serialize the object on to the persistent storage
 * @author Amit
 *
 */
public class MainApp {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("student.txt");
			try {
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
				Student studentObject = new Student();
				studentObject.setName("Amit");
				studentObject.setId("SDF12123FDSF");
				studentObject.setCourse("R & D work");
				objectOutputStream.writeObject(studentObject);
				objectOutputStream.flush();
				System.out.println("Student object has been written to the file!");
			} catch (IOException e) {
				System.out.println("IOExcpetion: " + e.getMessage());
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Exception: " + e.getMessage());
		}
		
	}

}
