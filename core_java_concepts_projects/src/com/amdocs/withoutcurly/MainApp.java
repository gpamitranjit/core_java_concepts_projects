package com.amdocs.withoutcurly;

public class MainApp {

	private static void calculateMin(int[] arr) {
		int min = arr[0];
		for(int i=0; i < arr.length; i++ )
			if(min > arr[i])
				min = arr[i];
		System.out.println("min: " + min);
	}
	
	public static void main(String[] args) {
		int[] arr = {4,5,6,0,1,2,3,4,5};
		String arrObjectName = arr.getClass().getCanonicalName();
		System.out.println("array object Name: " + arrObjectName);
		calculateMin(arr);
	}

}
