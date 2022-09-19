package com.aytuncbakir.oop.ch03.lecture08;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		Date registrationDate = new Date();
		Student student = new Student("12345", "Efe Can", "03.04.2007",registrationDate, "Ankara", "Sema", "Sami");
		
//		student.addCourse("Math");
//		student.removeCourse("Physics");
		student.frezee();
		student.addCourse("Math");
		student.removeCourse("Physics");
		student.activate();
		student.frezee();
		student.addCourse("Math");
			
		System.out.println(student);
	}
}
