package com.aytuncbakir.oop.ch09.lecture05.thisasreference1;

public class Course {
	
	private int id;
	private String name;
	private Professor professor;
	
	public Course(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	void openCourse() {
		professor.setCourse(this);
		System.out.println("Course is opened!");
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
}
