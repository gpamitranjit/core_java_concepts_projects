package com.amdocs.singleton.solution.billpugh;

/**
 * @author Amit
 *
 */
public class MainApp {

	public static void main(String[] args) {
		BillPughSingleton.getInstance();
		BillPughSingleton.getInstance();
	}

}
