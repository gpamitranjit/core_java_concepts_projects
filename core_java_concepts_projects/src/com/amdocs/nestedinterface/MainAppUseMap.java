package com.amdocs.nestedinterface;

public class MainAppUseMap {

	public static void main(String[] args) {
		Map mapObject = new MapImpl();
		mapObject.clear();
		
		Map.Entry entryObject = new MapImpl(). new EntryImpl();
		
		System.out.println("calling getKey() method of EntryImpl inner class: " + entryObject.getKey());
	}

}
