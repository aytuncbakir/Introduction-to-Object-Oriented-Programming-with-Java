package com.aytuncbakir.oop.ch12.lecture05.substitution;

public class SubstitutionTest {

	public static void main(String[] args) {

		Parent.staticMethod();
		Child.staticMethod();
		System.out.println(Parent.s);
//		System.out.println(Child.s);
		
		Parent parent = new Parent();
		parent.instanceMethod();
		Child child = new Child();
		child.instanceMethod();
		
		
		Parent parent1 = new Child();
		parent1.instanceMethod();
		
		System.out.println();
		System.out.println("------------substitution-------------");
		//substitution
		Service service = new Service();
		Child child1 = new Child();
		service.method(child1);
		System.out.println("-----------------------------------");
		
		
		System.out.println(parent.i);
		System.out.println(parent.b);
//		System.out.println(child.i);
//		System.out.println(child.b);
	}

}
