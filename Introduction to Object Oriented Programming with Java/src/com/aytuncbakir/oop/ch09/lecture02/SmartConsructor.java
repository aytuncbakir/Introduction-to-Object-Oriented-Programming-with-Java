package com.aytuncbakir.oop.ch09.lecture02;

public class SmartConsructor {
	
	public static void main(String[] args) {
		Lecturer lecturer = new Lecturer(null, null);
		lecturer.print();
		
		Lecturer lecturer1 = new Lecturer("Efe Can", "1369");
		lecturer1.print();
		
		Lecturer lecturer2 = new Lecturer("Ece Pak", "2134");
		lecturer2.print();
		
		//Why compiler does not provide a default constructor ??? 
//		Lecturer lecturer3 = new Lecturer();
//		lecturer3.print();
		
		// The compiler assumes that the programmer is smart. It does not interfere with the programmer's business.
	}

}


class Lecturer{
	
	public String name;
	public String no;
	
	public Lecturer(String name, String no) {
		
		this.name = name;
		this.no = no;
	}

	void print() {
		System.out.println("Name: "+ name + " "+ " No: "+no);
	}
}