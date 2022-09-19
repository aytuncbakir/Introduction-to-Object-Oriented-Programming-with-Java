package com.aytuncbakir.oop.ch09.lecture10;


public class OrderObjectConstruction {

	public static void main(String[] args) {
//		Flower f;
		
//		Flower f1 = new Flower();
//		System.out.println("******************************");
//		Flower f2 = new Flower();
//		System.out.println("******************************");
		new Flower().print();
	}
}

class Flower{
	int height = 10;
	double width;
	String type;
	
	{
		System.out.println("-----------------------------------\n");
		System.out.println("In instance block-1");
		System.out.println("height: " + height);
		System.out.println("-----------------------------------\n");
	}

	{
		System.out.println("-----------------------------------\n");
		System.out.println("In instance block-2");
		System.out.println("Initial value of d: " + width);
		width = 1.2 * 10;
		System.out.println("And now the value of d: " + width);
		System.out.println("And now the value of type: " + type);
		System.out.println("-----------------------------------\n");
	}
	
	{
		System.out.println("-----------------------------------\n");
		System.out.println("In instance block-3");
		System.out.println("-----------------------------------\n");
	}

	public Flower() {
		this("Flower");
		System.out.println("-----------------------------------\n");
		System.out.println("\nIn Flower()");
		System.out.println("The value of d: " + width);
		width =1.3 * 10;
		System.out.println("And now the value of d: " + width);
		System.out.println("-----------------------------------\n");
	}
	
	public Flower(String type) {
		System.out.println("-----------------------------------\n");
		this.type = type;
		System.out.println("\nIn Flower(String name)");
		System.out.println("The value of width: " + width);
		width = 1.4 * 10;
		System.out.println("And now the value of width: " + width);
		System.out.println("-----------------------------------\n");
	}

	void print() {
		System.out.println("-----------print()------------------\n");
		System.out.println("\nInfo");
		System.out.println("height: " + height + " width: " + width + " type: " + type);
		System.out.println("-----------------------------------\n");
	}
}
