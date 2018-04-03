package com.amdocs.string;

/**
 * @author Amit
 *
 */
public class InternMethod {

	/**
	 * intern() method is used to return / store the string data only in string pool
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = new String("Amit");
		String s2 = s1.intern();
		String s3 = "Amit";
		System.out.println("s1==s2 : " + (s1==s2));
		System.out.println("s2==s3 : " + (s2==s3));
		
	}

}
