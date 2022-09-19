package com.aytuncbakir.oop.ch03.lecture06;

import com.aytuncbakir.oop.ch03.lecture06.Student;


public class DataInHeapOrStack {

	// Objects is holds in Heap  - OK
	// Method variables local variables are hold in Stack -OK
	// verinin nerede olacagi tipinden bagimsizdir ?  (Primitive or Complex)
	
	public static void main(String[] args) {
		Student student = new Student();  // Stack Heap  ???
		student.name = "Ali"; 			  // Stack Heap  ???
		student.id = 234;    			  // Stack Heap  ???
		student.grade = 78;   			  // Stack Heap  ???
		student.course = "Mathematics";   // Stack Heap  ???
		int grade = student.grade;		  // Stack Heap  ???
		
	}

}
