package com.amdocs.javaSerialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
				
				System.out.println("=======================");
				System.out.println("reading the state of the student object back into program.");
				
				FileInputStream fileInputStream = new FileInputStream("student.txt");
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
				Student studentObject_2 = new Student();
				try {
					studentObject_2 = (Student) objectInputStream.readObject();
					System.out.println("retrieved student object is: " + studentObject_2);
				} catch (ClassNotFoundException e) {
					System.out.println("ClassNotFoundException: " + e.getMessage());
				}
			} catch (IOException e) {
				System.out.println("IOExcpetion: " + e.getMessage());
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Exception: " + e.getMessage());
		}
		
	}

}
