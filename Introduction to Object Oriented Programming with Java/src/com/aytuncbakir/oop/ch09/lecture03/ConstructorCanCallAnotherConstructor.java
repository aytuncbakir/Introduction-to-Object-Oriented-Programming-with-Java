package com.aytuncbakir.oop.ch09.lecture03;

public class ConstructorCanCallAnotherConstructor {

}

//class Student{
//	
//	private String name;
//	private int no;
//	
//	// DRY - DO NOT REPEAT YOURSELF
//	public Student(String name, int no) {
//		this.name = name;
//		this.no = no;
//	}
//	
//	public Student(String name) {
//		this.name = name;
//	}
//	public Student(int no) {
//		this.no = no;
//	}
//	
//	public Student() {
//		name = "Efe";
//		no = 123;
//	}
//}

//class Student{
//	
//	private String name;
//	private int no;
//	
//	// DRY - DO NOT REPEAT YOURSELF
//	public Student(String name, int no) {
//		this.name = name;
//		this.no = no;
//	}
//	
//	public Student(String name) {
//		//this.name = name;
//		Student(name, no);
//	}
//	public Student(int no) {
//		//this.no = no;
//		Student(name, no);
//	}
//	
//	public Student() {
//		//name = "Efe";
//		//no = 123;
//		Student(name, no);
//	}	
//}

class Student{
	
	private String name;
	private int no;
	
	// DRY - DO NOT REPEAT YOURSELF
	public Student(String name, int no) {
		this.name = name;
		this.no = no;
	}
	public Student(String name) {
		this(name, 1234);
	}
	public Student(int no) {
		this("Mehmet" , no);
	}
	public Student() {
		this("Student", 0);
	}
}
