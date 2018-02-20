package com.amdocs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BinarySearchTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(21);
		list.add(23);
		list.add(45);
		
		Integer integer =  Collections.binarySearch(list, 3433);
		System.out.println(integer);
		
		
		
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(12);
		list2.add(2);
		list2.add(45);
		list2.add(67);
		list2.add(23);
		
		System.out.println("printing all the elements of the list2: (before sorting!)");
		list2.stream().forEach(element -> System.out.println(element));
		
		int max = Collections.max(list2);
		int max2 = -1;
		
		
		Collections.sort(list2);
		System.out.println("printing all the elements of the list2: (after sorting!)");
		list2.stream().forEach(element -> System.out.println(element));
		
		for(int i=list2.size() -2; i > -1; i--) {
			int temp = list2.get(i);
			if(temp < max) {
				max2 = temp;
				break;
			}
		}
		
		System.out.println("second largst element of the list is: " + max2);
		
		
		int[] intArray = {12,23,45,3,2,233,34};
		List<Integer> IntegerListBoxed = Arrays.stream(intArray).boxed().sorted().collect(Collectors.toList());
		System.out.println("IntegerListBoxed: " + IntegerListBoxed);
		
		int[] intNewArray = null;
		
		intNewArray = IntegerListBoxed.stream().mapToInt(i -> i).toArray();
		System.out.println("mapped the List<Integer>  to int[]: ");
		Arrays.stream(intNewArray).forEach(System.out::println);
		
		
		
		
		
	}

}
