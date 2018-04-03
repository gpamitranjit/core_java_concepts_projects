package com.amdocs.withoutcurly;

/**
 * @author Amit
 *
 */
public class ArrayCopyMainApp {

	
	/**
	 * this method calculates the minimum value of the given array.
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array1 = {1,2,3,4,5};
		int[] array2 = new int[array1.length];
		
		System.arraycopy(array1, 0, array2, 0, array2.length);
		for(int i : array2) {
			System.out.println(i);
		}
	}

}
