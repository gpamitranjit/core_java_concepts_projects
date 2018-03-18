package com.amdocs.javaSerialization;

/**
 * @author Amit
 *
 */
public class Student extends Person {

	private String course;
	

	protected Student() {
		
	}

	protected Student(String id, String name, String course) {
		super(id, name);
		this.course = course;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [course=");
		builder.append(course);
		builder.append(", id=");
		builder.append(this.getId());
		builder.append(", name=");
		builder.append(this.getName());
		builder.append("]");
		return builder.toString();
	}
	
}
