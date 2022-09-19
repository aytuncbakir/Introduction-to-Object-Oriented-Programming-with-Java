package com.aytuncbakir.oop.ch09.lecture02;

public class DefaultConstructor {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.print();
		student.name = "Efe";
		student.no = "123456";
		student.print();
		
		Course course = new Course();
		course.print();
		
		// All Course objects has a name as "Math" and code as "CS101"
		Course course1 = new Course();
		course1.print();
	}

}

class Student{
	
	public String name;
	public String no;
	
	public Student() {
		
	}
	
	void print() {
		System.out.println("Name: "+ name + " "+ " No: "+no);
	}
}

class Course{
	public String name;
	public String code;
	
	public Course() {
		name = "Math";
		code = "CS101";
	}
	
	void print() {
		System.out.println("Name: "+ name + " "+ " Code: "+code);
	}
	
}
