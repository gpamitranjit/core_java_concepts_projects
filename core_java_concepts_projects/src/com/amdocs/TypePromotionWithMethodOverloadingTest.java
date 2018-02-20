package com.amdocs;

public class TypePromotionWithMethodOverloadingTest {

	private void sum(int a, long b) {
		System.out.println("sum of (int, long): " + (a + b));
	}
	
	private void sum(int a, int b, int c) {
		System.out.println("sum of (int, int, int): " + (a + b + c));
	}
	
	
	
	public static void main(String[] args) {
		TypePromotionWithMethodOverloadingTest obj = new TypePromotionWithMethodOverloadingTest();
		obj.sum(10, 10);
		obj.sum(10, 10, 10);
		obj.sum(10, 'a');
		
		
	}

}
