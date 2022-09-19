package com.aytuncbakir.oop.ch07.lecture01;

public class DogObject {
	
	public static void main(String[] args) {
		
		//all attributes/variables of object is called as state
		// object's all method is called as interface
		// states and methods defines in class
		// all instance of class (object) has those states and methods
		
		// state  : type, legs, tail
		DogClass mydog = new DogClass("Toy Poodle");   //kanis
		
		String type = mydog.type;
		int legs = mydog.legs;
		String tail = mydog.tail;
		
		System.out.println(type + " " + legs + " " + tail);
		
		// interface : bark(), run()
		mydog.bark();
		mydog.run();
		
		DogClass mydog1 = new DogClass("Toy Poodle");  
		
		System.out.println("Class type: " + getClassType(mydog));
		System.out.println("Class type: " + getClassType(mydog));
		
		Cat mycat = new Cat();
		System.out.println("Class type: " + getClassType(mycat));
	}
	
	private static String getClassType(Object dog) {
		String s = dog.getClass().toString();
		s = s.substring(41, s.length());    
		return s;
	}
	

}
