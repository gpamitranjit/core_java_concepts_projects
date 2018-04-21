package com.amdocs.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Amit
 *
 */
public class RegEx_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter Regular Expression:");
			Pattern pattern = Pattern.compile(sc.nextLine());
			System.out.println("Enter text:");
			Matcher matcher = pattern.matcher(sc.nextLine());
			boolean find = false;
			while(matcher.find()) {
				System.out.println("i found the text " + matcher.group() +
						" starting at index " + matcher.start() + " and ending at index " + matcher.end());
				
			}
		}
	}

}
