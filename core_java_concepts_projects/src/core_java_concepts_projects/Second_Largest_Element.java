package core_java_concepts_projects;

import java.util.stream.IntStream;

public class Second_Largest_Element {

	public static void main(String[] args) {
		int length = 4;
		int[] array = {34, 3, 45, 56};
		try {
//			
//			IntStream intStream = IntStream.of(array);
//			intStream.sorted()
//			.forEach(element -> {
//				
//		});
//			System.out.println("===========================");
			
			sort(length, array);
			for(int i=0; i < length; i++) { 
				System.out.println(array[i]);
			}
			int max1 = array[length-1];
			int max2= -1;
			
			for(int i = length-2; i > -1; i--) {
				if(array[i] < max1) {
					max2 = array[i];
					break;
				}
			}
			
			System.out.println("first largest element is:  " + max1);
			System.out.println("second largest element is: " + max2);
		}
		catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	private static void sort(int length , int[] array) {
		
		for(int i=0; i < length-2; i++) {
			for(int j=i; j < length-1; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j]  = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		
	}

}
