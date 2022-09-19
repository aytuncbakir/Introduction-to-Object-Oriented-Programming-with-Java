package com.aytuncbakir.oop.ch03.lecture03;

public class ClassAndObjectAndReference {
	
	// Class is template
	// Object is an instance  of Class - Objects are in Heap
	// We reach the object by the help of Reference. Reference holds the address of object.
	// References are abstract access mechanisms to objects.
	
	public static void main(String[] args) {
		Student student = new Student("Ali","4567");
		
		// Nesnelere sadece referanslari ile erisilebilir.
		System.out.println(student.id);
		System.out.println(student.name);
		
		student.addLesson();
		student.dropLesson();
		
		Student student1 = student;
		System.out.println(student1.name);
		
		Student student2 = new Student("Veli","4950"); // student yap ne oldu?
		
		ClassAndObjectAndReference cor = new ClassAndObjectAndReference();
//		Referans ile nesnenin tipi ayni olmalidir. (Polymorfizme kadar böyle bilcez)		
//		student2 = new ClassAndObjectAndReference();
//		student2 = cor;

		// student, student1, student2 and cor = reference variable / complex variable
	}

}

class Student{
	
	// Datas  - Veriler
	public String name;
	public String id;
	
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	// BEhaviours - Davranislar   ( Sorumluluklar yerine getiriliyor. )
	public void addLesson() {
		System.out.println("Lesson added.");
	}
	public void dropLesson() {
		System.out.println("Lesson dropped.");
	}
	
}
