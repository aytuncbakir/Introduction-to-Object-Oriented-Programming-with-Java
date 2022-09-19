package com.aytuncbakir.oop.ch09.lecture06;

public class Customer {
	
	private String name;
	private int id;
	public static int no;
	CustomerCard customerCard ;   // = new CustomerCard(11111);
	
	public static String nationality = "TR";  // private ???
	
	
	public void method1() {
		System.out.println("Object method access both class and object variables (member variables)");
		System.out.println(id);
		System.out.println(no);
		System.out.println(customerCard);
		
		
	}
	
	public static void method2() {
		System.out.println("Class method (static method access only static variables)");
		System.out.println(no);
	}
	
	public static void method3() {
//		System.out.println(customerCard.getType());
	}


}
