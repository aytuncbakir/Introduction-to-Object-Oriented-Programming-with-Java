package com.aytuncbakir.oop.ch09.lecture10;

public class ClassInitializationOrderExample1 {
	
	public static void main(String[] args) {
		
		Chair chair;
		System.out.println("Access to final static origin "+ Chair.origin );
//		System.out.println("Access to final static type "+ Chair.type );
		 chair = new Chair();
		
	}

}

class Chair{
	
	int legs;
	boolean isAvailable;
	static char type;
	static final int origin = 12345;
	
	Chair(){
		System.out.println("constructor is called");
	}
	
	{
		legs = 4;
		System.out.println("Instance block - 1");
	}
	
	{
		isAvailable = true;
		System.out.println("Instance block - 2");
	}
	
	static{
		type = 'A';
		System.out.println("Static block - 1");
	}

	static{
		System.out.println("Static block - 2");
	}
}
