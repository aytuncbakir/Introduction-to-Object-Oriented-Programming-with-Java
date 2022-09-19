package com.aytuncbakir.oop.ch03.lecture03;

public class StudentFactory {
	
	public static Student createStudent() {
		Student student = new Student("Efe Can", "123");
		return student;
	}

}
