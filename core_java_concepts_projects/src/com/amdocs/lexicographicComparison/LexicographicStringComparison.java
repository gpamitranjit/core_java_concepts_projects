package com.amdocs.lexicographicComparison;

public class LexicographicStringComparison {

	public static void main(String[] args) {
		String str1 = "Geeky";
		String str2 = "Geekyguy";
		int returnValue = stringCompare(str1, str2);
		System.out.println("returnValue: " + returnValue);

	}

	// This method compares two strings
	// lexicographically without using
	// library functions
	public static int stringCompare(String str1, String str2) {
		for (int i = 0; i < str1.length() && i < str2.length(); i++) {
			if ((int) str1.charAt(i) == (int) str2.charAt(i)) {
				continue;
			} else {
				return (int) str1.charAt(i) - (int) str2.charAt(i);
			}
		}

		// Edge case for strings like
		// String 1="Geeky" and String 2="Geekyguy"
		if (str1.length() > str2.length()) {
//			return (int) str1.charAt(str2.length());
			return 1;
		} else if (str1.length() < str2.length()) {
//			return (int) str2.charAt(str1.length());
			return -1;
		}

		// If none of the above conditions is true,
		// it implies both the strings are equal
		else {
			return 0;
		}
	}

}
