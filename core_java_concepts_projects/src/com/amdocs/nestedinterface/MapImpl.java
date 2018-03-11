package com.amdocs.nestedinterface;

public class MapImpl implements Map {

	class EntryImpl implements Map.Entry {

		@Override
		public int getKey() {
			
			return 10000;
			
		}
		
	}
	
	@Override
	public void clear() {
		System.out.println("implementation of clear() method of Map interface");
	}

}
