package main.java.com.academy.entity;

import java.io.Serializable;
import java.util.List;

public class Classes implements Serializable {

	private static final long serialVersionUID = 1L;
	private int classId;
	private String name;
	private int seats;
	private int strength;
	private List<Subjects> subjects;
	private List<Students> students;
	private List<Teachers> teachers;

	public Classes(int classId, String name, int seats) {
		super();
		this.classId = classId;
		this.name = name;
		this.seats = seats;
	}

	public Classes(int classId, String name, int seats, int strength) {
		super();
		this.classId = classId;
		this.name = name;
		this.seats = seats;
		this.strength = strength;
	}

	public Classes(int classId, String name, int seats, int strength, List<Subjects> subjects, List<Students> students,
			List<Teachers> teachers) {
		super();
		this.classId = classId;
		this.name = name;
		this.seats = seats;
		this.strength = strength;
		this.subjects = subjects;
		this.students = students;
		this.teachers = teachers;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public List<Subjects> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subjects> subjects) {
		this.subjects = subjects;
	}

	public List<Students> getStudents() {
		return students;
	}

	public void setStudents(List<Students> students) {
		this.students = students;
	}

	public List<Teachers> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teachers> teachers) {
		this.teachers = teachers;
	}

	@Override
	public String toString() {
		return "Classes [classId=" + classId + ", name=" + name + ", seats=" + seats + ", strength=" + strength
				+ ", subjects=" + subjects + ", students=" + students + ", teachers=" + teachers + "]";
	}

	public Classes() {
		super();
	}

}
