package com.amdocs.singleton.solution.billpugh;

/**
 * @author Amit
 * the preferred way of creating the singleton object using buillpugh solution
 *
 */
public class BillPughSingleton {

	private BillPughSingleton() {
		System.out.println("BillPughSingleton constructor is called");
	}
	
	private static class LazyHolder {
		static {
			System.out.println("LazyHolder static class loaded!");
		}
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance() {
		return LazyHolder.INSTANCE;
	}

	
}
