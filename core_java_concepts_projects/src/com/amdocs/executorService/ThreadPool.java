package com.amdocs.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

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
			

//			below code for executorService shutdown firstly stops taking new task for execution,
//			then Blocks further until all tasks have completed execution after a shutdown request, or the timeout occurs, or the current thread is interrupted, whichever happens first.
//			if one of the above occurs the executorService will be terminated immediately!!
			executorService.shutdown();			
			try {
				
				if(!executorService.awaitTermination(11000, TimeUnit.MILLISECONDS)) {
					executorService.shutdownNow();
				}
				
			} catch (InterruptedException e) {
				
				executorService.shutdownNow();
				System.out.println("InterruptedException: " + e.getMessage());
				
			}
			
			System.out.println("Finished all threads");
	}

}
