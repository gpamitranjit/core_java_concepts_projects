package com.amdocs.singleton.solution.lazyInitialization;

/**
 * @author Amit
 * lazy creation of singleton object based on the demand!
 * note we are using double-check-locking principle so as to avoid from having more than 2 objects in case of racing thread.
 */
public class LazySingleton {
	private static volatile LazySingleton instance= null;
	
//	private constructor
	private LazySingleton() {
		System.out.println("LazySingleton constructor is called");
	}
	
	public static LazySingleton getInstance() {
		if(instance == null) {
			synchronized (LazySingleton.class) {
				if(instance == null) {
					instance = new LazySingleton();
				}
			}
		}
		return instance;
	}
	
}
