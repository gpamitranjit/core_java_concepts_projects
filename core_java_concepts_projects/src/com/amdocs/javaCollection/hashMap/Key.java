package com.amdocs.javaCollection.hashMap;

public class Key {
	private String id;
	private String name;

	protected String getId() {
		return id;
	}

	protected void setId(String id) {
		this.id = id;
	}

	protected String getName() {
		return name;
	}

	public Key(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return 5;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}
	
	

}
