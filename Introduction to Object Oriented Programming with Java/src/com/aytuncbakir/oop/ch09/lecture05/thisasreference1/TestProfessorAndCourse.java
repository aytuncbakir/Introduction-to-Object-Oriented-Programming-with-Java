package com.aytuncbakir.oop.ch09.lecture05.thisasreference1;

public class TestProfessorAndCourse {
	
	public static void main(String[] args) {
		
		Course course = new Course(12345, "CS101");
		Professor professor = new Professor(3456, "John");
		professor.setCourse(course);
		course.setProfessor(professor);
		course.openCourse();
		
		
		System.out.println("Course name: "+ course.getName());
		System.out.println("Course id: "+course.getId());
		System.out.println("Professor name: "+course.getProfessor().getName());
		System.out.println("Professor id: "+course.getProfessor().getId());
		
		System.out.println();
		
		Course course1 = new Course(7878789, "CS102");
		Professor professor1 = new Professor(656565, "Paul");
		professor1.setCourse(course1);
		course1.setProfessor(professor1);
		course.openCourse();
	
		System.out.println("Course name: "+ course1.getName());
		System.out.println("Course id: "+course1.getId());
		System.out.println("Professor name: "+course1.getProfessor().getName());
		System.out.println("Professor id: "+course1.getProfessor().getId());
		
	}

}
