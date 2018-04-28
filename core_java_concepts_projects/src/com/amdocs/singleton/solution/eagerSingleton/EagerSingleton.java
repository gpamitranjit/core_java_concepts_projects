package com.amdocs.singleton.solution.eagerSingleton;

/**
 * @author Amit
 * the object of this singleton class gets created at the time of class loading irrespective of it's need at the runtime.
 * 
 *
 */
public class EagerSingleton {
	
	private static volatile EagerSingleton instance = new EagerSingleton();

//	private singleton
	private EagerSingleton() {
		System.out.println("EagerSingleton constructor called");
	}
	
	public static EagerSingleton getInstance() {
		return instance;
	}
}
