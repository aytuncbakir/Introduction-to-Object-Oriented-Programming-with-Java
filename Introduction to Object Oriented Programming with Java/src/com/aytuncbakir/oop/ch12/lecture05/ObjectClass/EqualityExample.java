package com.aytuncbakir.oop.ch12.lecture05.ObjectClass;

import com.aytuncbakir.oop.ch12.lecture05.ObjectClass.domain.Student;

public class EqualityExample {

	public static void main(String[] args) {

		Student p1 = new Student(11, "Kanepe", 171.09);
		Student p2 = new Student(11, "Kanepe", 171.09);

//		p1 = p2;
		
		System.out.print("Is p1 = p2: ");
		boolean b = p1 == p2;
		if (b)
			System.out.println("The same");
		else
			System.out.println("Different");
		
		System.out.print("\nIs p1 equals p2: ");
		
		b = p1.equals(p2);
		
		if (b)
			System.out.println("The same");
		else
			System.out.println("Different");
		
		
		System.out.print("\nIs p2 equals p1: ");
		
		b = p2.equals(p1);
		
		if (b)
			System.out.println("The same");
		else
			System.out.println("Different");
		
		System.out.println();
		
		System.out.println(p1);
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}
}
