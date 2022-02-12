package main.java.com.academy.entity;

import java.io.Serializable;

public class Subjects implements Serializable {

	@Override
	public String toString() {
		return "Subjects [subjectId=" + subjectId + ", name=" + name + "]";
	}

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private int subjectId;
	private String name;

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Subjects(int subjectId, String name) {
		super();
		this.subjectId = subjectId;
		this.name = name;
	}

	public Subjects() {
		super();
	}

}
