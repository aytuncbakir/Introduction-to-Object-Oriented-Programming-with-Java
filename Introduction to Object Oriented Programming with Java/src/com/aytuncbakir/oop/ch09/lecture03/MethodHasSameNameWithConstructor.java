package com.aytuncbakir.oop.ch09.lecture03;

public class MethodHasSameNameWithConstructor {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.Dog();
		dog.bark();
	}
}

class Dog{

	public Dog() {
		System.out.println("Dog constructor");
	}
	
	public void Dog() {
		System.out.println("Dog method");
	}
	
	public void bark() {
		System.out.println("Hav hav!");
	}
	
	
}
