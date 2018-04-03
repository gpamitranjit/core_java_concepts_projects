package com.amdocs.string;

public class StringOperations {

	public static void main(String[] args) {
		String str = "Amit";
		
		String formattedValue = StringFormat(str, 26);
		System.out.println("formattedValue: " + formattedValue);
		
		String joinedString = joinCharSequence(",", "Amit", "Ranjit", "Smita");
		System.out.println("Joined String is: " + joinedString);
	}

	private static String StringFormat(String str, int age) {
		
		return String.format("%s %d", str, age);
	}
	
	private static String joinCharSequence(CharSequence delimiter, CharSequence ... charSequence) {
		
		return String.join(delimiter, charSequence);
	}
}
