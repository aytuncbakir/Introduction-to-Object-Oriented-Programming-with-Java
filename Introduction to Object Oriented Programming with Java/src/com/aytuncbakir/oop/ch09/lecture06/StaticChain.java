package com.aytuncbakir.oop.ch09.lecture06;

public class StaticChain {
	
	public static int i = 5;
	public static void main(String[] args) {
		System.out.println(i);
		
		System.out.println(Fish.fin);
		Fish.sleep();
	}

}

class Fish{
	
	public static int fin = 2;
	
	public static void localVariableSameNameClassVariable() {
		int fin = 4;
		System.out.println(fin);
		System.out.println(Fish.fin);
//		System.out.println(this.fin);  // error
		System.out.println("Eating");
	}
	
	public static void hunt() {
		System.out.println("Eating");
	}
	
	public static void eat() {
		hunt();
		System.out.println("Eating");
	}
	
	public static void swim() {
		eat();
		System.out.println("Swimming");
	}
	
	public static void sleep() {
		dive();
		System.out.println("Sleeping");
	}
	
	public static void dive() {
		System.out.println("Diving");
	}
	
	
}
