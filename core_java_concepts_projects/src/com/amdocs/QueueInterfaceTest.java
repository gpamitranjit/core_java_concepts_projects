package com.amdocs;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterfaceTest {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();
		
		queue.add("Smita");
		queue.add("Ranjit");
		queue.add("Tanajirao");
		queue.add("Rashikabai");
		queue.add("Amit");
		
		String mostPriorityElement = queue.peek();
		System.out.println("Printing the most priority element of the queue: " + mostPriorityElement);
		
		
		Iterator<String> iterator = queue.iterator();
		System.out.println("printing all the elements of the queue!");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("removing the head elements of the queue!");
		String head = queue.remove();
		String head1 = queue.poll();
		System.out.println("head of the queue:  " + head);
		System.out.println("head of the queue: " + head1);
		
		System.out.println("printing the elements of the queue after removing the 2 head of the queue!");
		Iterator<String> iterator2 = queue.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
	}

}
