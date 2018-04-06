package com.amdocs.regex;

import java.util.regex.Pattern;

/**
 * Grouping and back reference
 * You can group part of your regular expression, i.e in your Regular expression
 * 
 * Negative look ahead in regular expression
 * negative look ahead provides the possibility to exclude the pattern, i.e with you can say that a string should not be followed by another string
 * Example: Find for a match where  "a" is not followed by b
 * 
 * @author Amit
 *
 */
public class RegEx_2 {

	public static void main(String[] args) {
		String pattern = "(\\w)(\\s+)([\\.,])";
		String name = "ami t .com";
		System.out.println("removing white-space between a word charater and . or , charater");
		System.out.println("before processing name: " + name);
		String finalStringName1 = name.replaceAll(pattern, "$1$3");
		System.out.println("final processed name: " + finalStringName1);
		
		System.out.println("==================");
//		remove white spaces between two word characters.
		String pattern2 = "(\\w)(\\s+)(\\w)";
		System.out.println("before processing name:" + finalStringName1);
		System.out.println("final processed name:" + finalStringName1.replaceAll(pattern2, "$1$3"));
		
		
//		Using Negative look ahead
		String pattern3 = "a(?!b).*";
		String someStringValue = "acd";	// try adding b after "a" then the given pattern will not be matched!
		System.out.println("is someStringValue matches the given pattern: " + Pattern.matches(pattern3, someStringValue));
		
		
	}

}
