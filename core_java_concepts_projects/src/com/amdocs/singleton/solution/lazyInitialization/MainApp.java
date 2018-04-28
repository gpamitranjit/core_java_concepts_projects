package com.amdocs.singleton.solution.lazyInitialization;

public class MainApp {

	public static void main(String[] args) {
		LazySingleton.getInstance();
		LazySingleton.getInstance();
	}

}
