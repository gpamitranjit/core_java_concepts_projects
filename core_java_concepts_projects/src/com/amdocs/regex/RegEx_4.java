package com.amdocs.regex;

import java.util.regex.Pattern;

public class RegEx_4 {

	public  static void main(String[] args) {
		System.out.println(Pattern.matches("[amd]?", ""));
		System.out.println(Pattern.matches("[amd]+", "a"));
	}
}
