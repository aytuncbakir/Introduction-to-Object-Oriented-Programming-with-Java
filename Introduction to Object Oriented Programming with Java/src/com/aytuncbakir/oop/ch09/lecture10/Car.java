package com.aytuncbakir.oop.ch09.lecture10;

/*
 * As a result, the initialization sequence/order is as follows:
	• Class variables (including static initialization blocks),
	• If creating an object, for each object,
		• Object variables (including object initialization blocks),
		• The constructor call and any constructor calls with this() if any.
	
	• If there is more than one class and object variable, the initialization order 
	is determined in physical order, first come first initialized.
	
	• If member variables are also objects, they must also be initialized.
	
	• This way initialization starts from a class and its object and extends to the many classes 
	and objects used.
 */
public class Car {
	static int year = 2022;
	String name;
	static Body body = new Body();

	public Car() {
		this("Car1");
		System.out.println("Car()");
	}

	public Car(String name) {
		this("Car2", 2022);
		System.out.println("in Car(String name)");
	}

	public Car(String name, int year) {
		this.name = name;
		System.out.println("in Car(String name, int year)");
	}

	public static void main(String args[]) {
		
		
//		System.out.println("*****************************");
//		System.out.println("in main");
//		System.out.println("*****************************");
//		System.out.println(" This Car made in "+Car.year);
//		System.out.println("*****************************");
//		Car oi = new Car();
//		System.out.println("*****************************");
//		new Car();
//		System.out.println("*****************************");
//		new Car();
//		System.out.println("*****************************");
//		new Car();
//		System.out.println("*****************************");
//		Handle b = new Handle();
//		b.handleMethod();	
	}

	Door door = new Door();

	static int[] cars = new int[5];
	static { // If static don't exists, it is not initialized as static
		System.out.println("Initializing the int array - cars will be produced");
		for (int i = 0; i < cars.length; i++)
			cars[i] = i * 10;
	}

	boolean[] booleans = new boolean[5];
	{ // If static don't exists, it is not initialized as static
		System.out.println("Initializing the boolean array - created a car");
		for (int i = 0; i < booleans.length; i++)
			booleans[i] = true;
	}

	public static final HandleCount handleCount = new HandleCount();
}

class Body{

	public Body() {
		System.out.println("in Body()");
	}

	Door door = new Door();
}

class Door {
	static Handle b = new Handle();

	public Door() {
		System.out.println("in Door()");
	}

	static void openDoor() {
		System.out.println("in openDoor()");
	}
}

class Handle {
	public Handle() {
		System.out.println("in Handle()");
	}

	public void handleMethod() {
		System.out.println("in handleMethod()");
	}
}

class HandleCount {
	static int count;

	static {
		count = 4;
		System.out.println("Handle count: " + count);
	}

	public HandleCount() {
		System.out.println("in HandleCount()");
	}
}
