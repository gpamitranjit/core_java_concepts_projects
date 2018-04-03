package com.amdocs.string;

public class StringOperations {

	public static void main(String[] args) {
		String str = "Amit";
		
		String formattedValue = StringFormat(str, 26);
		System.out.println("formattedValue: " + formattedValue);
	}

	private static String StringFormat(String str, int age) {
		
		return String.format("%s %d", str, age);
	}
}
