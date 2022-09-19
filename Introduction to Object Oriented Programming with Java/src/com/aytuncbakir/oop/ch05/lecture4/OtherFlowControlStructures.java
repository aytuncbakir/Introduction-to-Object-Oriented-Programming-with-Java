package com.aytuncbakir.oop.ch05.lecture4;

import com.aytuncbakir.oop.ch03.lecture08.Student;

public class OtherFlowControlStructures {
	
	public static void main(String[] args) {
		
		Student s = createStudent();
		try {
			s.addCourse("Math");
		} catch (Exception e) {
			System.out.println("Flow is now here: in catch");
			System.out.println(e.getMessage());
		}finally {
			// clear
		}
	}

	private static Student createStudent() {
		return null;
	}

}
