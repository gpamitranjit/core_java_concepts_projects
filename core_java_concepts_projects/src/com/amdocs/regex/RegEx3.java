package com.amdocs.regex;

import java.util.regex.Pattern;

/**
 * When a caret comes as the first Character inside the square bracket, it negates the pattern,
 * i.e the pattern matches any Character except the one specified
 * below is the example for illusion 
 * @author Amit
 *
 */
public class RegEx3 {

	public static void main(String[] args) {
		String pattern = "[^abcABC].*";	//this pattern matches any String which don't start with a OR b OR c character
		String name = "Amit";
		System.out.println("is Pattern matched: " + Pattern.matches(pattern, name));	
//		OUTPUT is Pattern matched: false
//		as name contains first letter A which is not excepted as per the pattern.
		
	}

}
