package main.java.com.academy.entity;

import java.io.Serializable;

public class Students implements Serializable {

	@Override
	public String toString() {
		return "Students [studentId=" + studentId + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", emailId=" + emailId + ", cls=" + cls + "]";
	}

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private int studentId;
	private String name;
	private int age;
	private String gender;
	private String emailId;
	private Classes cls;

	public Students(int studentId, String name, int age, String gender, String emailId) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.emailId = emailId;
	}

	public Students(int studentId, String name, int age, String gender, String emailId, Classes cls) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.emailId = emailId;
		this.cls = cls;
	}

	public Students() {
		super();
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Classes getCls() {
		return cls;
	}

	public void setCls(Classes cls) {
		this.cls = cls;
	}

}
