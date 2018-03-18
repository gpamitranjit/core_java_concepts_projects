package com.amdocs.javaSerialization;

import java.io.Serializable;

/**
 * 
 * Serializable interface is a marker interface the just providees the hit to the compiler about the target class being eligible for persisting on the persistance storage
 * parent class implementing the Serializable interface and hence all it's sub-classes will be able to serialize to the persistent storage
 * @author Amit
 *
 */
public class Person implements Serializable {

	private String id;
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
