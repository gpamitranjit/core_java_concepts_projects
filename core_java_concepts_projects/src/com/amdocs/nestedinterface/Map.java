package com.amdocs.nestedinterface;

public interface Map {
	
	public interface Entry {
		int getKey();
	}
	
	void clear();
}
