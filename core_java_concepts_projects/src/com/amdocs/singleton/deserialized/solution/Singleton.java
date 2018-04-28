package com.amdocs.singleton.deserialized.solution;

import java.io.Serializable;

/**
 * @author Amit
 *
 */
public class Singleton implements Serializable {

	private static final long serialVersionUID = 1L;

	private int i;
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	/**
	 * @return
	 * this method is responsible for returning the same object when we try to de-serialize the serialized object
	 */
	protected Object readResolve() {
		return LazyHolder.INSTANCE;
	}
	
	private Singleton() {
		System.out.println("Singleton constructor invoked.");
	}
	
	private static class LazyHolder {
		private final static Singleton INSTANCE = new Singleton();
	}
	
	public static Singleton getInstance() {
		return LazyHolder.INSTANCE;
	}
	
	
}
