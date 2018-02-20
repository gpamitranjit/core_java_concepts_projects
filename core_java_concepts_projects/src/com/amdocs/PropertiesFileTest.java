package com.amdocs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileTest {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader(new File("src/resources/application.properties"));
			Properties properties = new Properties();
			properties.load(reader);
			System.out.println("userName: " + properties.getProperty("username"));
			System.out.println("password: " + properties.getProperty("pass"));
			
			
			Properties infoProperties = new Properties();
			infoProperties.setProperty("country" , "India");
			infoProperties.setProperty("state", "Karnataka");
			
			infoProperties.store(new FileWriter(new File("infoProperties.properties"), true), "some comment!");
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
		
	}

}
