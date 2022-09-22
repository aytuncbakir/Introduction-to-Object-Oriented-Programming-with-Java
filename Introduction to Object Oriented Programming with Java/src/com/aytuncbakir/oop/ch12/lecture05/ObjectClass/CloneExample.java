package com.aytuncbakir.oop.ch12.lecture05.ObjectClass;

import com.aytuncbakir.oop.ch12.lecture05.ObjectClass.domain.Student;

public class CloneExample{

	public static void main(String[] args) {
		Student p1 = new Student(11, "Ali", 80.0);
		System.out.println(p1);
		Student p2 = (Student) p1.clone();
		System.out.println(p2);

		if (p1 == p2)
			System.out.println("The same");
		else
			System.out.println("Different");
		
		boolean b = p1.equals(p2);
		if (b)
			System.out.println("The same");
		else
			System.out.println("Different");
	}
}
