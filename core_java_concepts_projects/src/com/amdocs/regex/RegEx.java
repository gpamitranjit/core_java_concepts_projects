package com.amdocs.regex;

import java.util.regex.Pattern;
// A Quantifier defines how aften an element can occur!
// ? after the quantifier makes it a reluctant quantifier..
// the reluctant quantifier tries to find smallest match.
// this makes the regular expression stop at the first match.
public class RegEx {

	public static void main(String[] args) {
		String pattern = "[amn]@\\.com";	//a or m or n and @.com for pattern
		boolean result = Pattern.matches(pattern, "a@.com");
		
		System.out.println("result: " + result);
		
		
		String pattern2 = "a?";	//once or not at all
		boolean patternResult2 = Pattern.matches(pattern2, "a");
		System.out.println("booleanResult2: " + patternResult2);
		
		
		String pattern3 = "a+";	//one or more occourences
		boolean patternResult3 = Pattern.matches(pattern3, "aaaaaaaaaaaaaaaa");
		System.out.println("patternrResult3: " + patternResult3);
		
		String pattern4 = "a{2}[a-z]*";
		boolean patternResult4 = Pattern.matches(pattern4, "aaa");
		System.out.println("patternResult4: " + patternResult4);
		
		
		String pattern5 = "a{2,}";	// a should occur 2 OR more times.
		boolean patternResult5 = Pattern.matches(pattern5, "aaa");
		System.out.println("patternResult5: " + patternResult5);
		
		
		String pattern6 = "a{4,8}";	// a should occur between 4 to 8 times (both inclusive)
		boolean patternResult6 =  Pattern.matches(pattern6, "aaaaaaaaa");
		System.out.println("patternResult6: " + patternResult6);
		
		//using ? Quantifier
		String pattern7 = "[amn]?";	//once OR zero times a OR m OR n character 
		boolean patternResult7 = Pattern.matches(pattern7, "a");
		System.out.println("patternResult7: " + patternResult7);
		
		
		//using  + Quantifier
		String pattern8 = "[amn]+";
		boolean patternResult8 = Pattern.matches(pattern8, "aaaaaaaammmmmmmmmmmmmmmm");
		System.out.println("patternResult8: " + patternResult8);
		
		String pattern9 = "";
	}

}
