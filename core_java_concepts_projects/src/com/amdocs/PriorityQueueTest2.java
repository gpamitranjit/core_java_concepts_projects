package core_java_concepts_projects;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest2 {

	public static void main(String[] args) {
		Queue<Integer> integerQueue = new PriorityQueue<>();
		integerQueue.add(12);
		integerQueue.add(2);
		integerQueue.add(43);
		
		System.out.println("most priority element is: " + integerQueue.peek());
		
		System.out.println("retrieving and remving the first head of the priorityQueue: " + integerQueue.poll());
		System.out.println("retrieving the head element of the queue without removing the element from the queue: " + integerQueue.peek());
		
		
		try {
			Object[] integerArray = integerQueue.toArray();
			for(int i=0; i< integerArray.length; i++) {
				System.out.println(integerArray[i].toString());
			}
		}
		catch(Exception e) {
			System.out.println("message: " + e.getMessage());
		}
	}

}
