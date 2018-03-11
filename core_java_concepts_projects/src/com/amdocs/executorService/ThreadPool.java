package com.amdocs.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Using ExecutorService to create the thread pool of fixed size and hence increase the performance of application by avoiding the need to create new thread and reusing the thread from pool
 * 
 * @author Amit
 *
 */
public class ThreadPool {

	public static void main(String[] args) {
		
//			creating the thread pool of 5 threads
			ExecutorService executorService = Executors.newFixedThreadPool(5);
			
			for(int i=0; i < 10; i++) { 
				
				Runnable runnableTask = new WorkerThread("" + i);
				executorService.execute(runnableTask);
				
			}
			
//			after the execution of below line no new runnable task will taken for execution
			executorService.shutdown();
			
			while(!executorService.isTerminated()) {}
			
			System.out.println("Finished all threads");
	}

}
