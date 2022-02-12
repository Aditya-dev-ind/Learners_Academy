package main.java.com.academy.entity;

import java.io.Serializable;
import java.util.List;

public class Teachers implements Serializable {

	private static final long serialVersionUID = 1L;
	private int teacherId;
	private String name;
	private int age;
	private String gender;
	private String emailId;
	private List<Subjects> subjects;
	private List<Classes> classes;

	public Teachers(int teacherId, String name, int age, String gender, String emailId) {
		super();
		this.teacherId = teacherId;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.emailId = emailId;
	}

	public Teachers(int teacherId, String name, int age, String gender, String emailId, List<Subjects> subjects,
			List<Classes> classes) {
		super();
		this.teacherId = teacherId;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.emailId = emailId;
		this.subjects = subjects;
		this.classes = classes;
	}

	@Override
	public String toString() {
		return "Teachers [teacherId=" + teacherId + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", emailId=" + emailId + ", subjects=" + subjects + ", classes=" + classes + "]";
	}

	public Teachers() {
		super();
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
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

	public List<Subjects> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subjects> subjects) {
		this.subjects = subjects;
	}

	public List<Classes> getClasses() {
		return classes;
	}

	public void setClasses(List<Classes> classes) {
		this.classes = classes;
	}

}
