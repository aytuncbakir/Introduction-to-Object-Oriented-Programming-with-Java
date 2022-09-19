package com.aytuncbakir.oop.ch08.lecture04;

public class HeapStackAndLocalVariables {
	
	// Objects in heap
	// Methods so local variables stack
	// References heap or stack (How?)
	// Primitives stack or heap (How?)
	
	
	private int i;                    		//Heap
	private long j;							//Heap
	private String s = "Hello";				//Heap
	private String s1 = new String("Hello");//Heap
	private Object o;						//Heap
	
	public static void main(String[] args) {
		HeapStackAndLocalVariables hslv; // hslv - reference in Stack
		
		hslv = new HeapStackAndLocalVariables();  // now hslv shows the object which is in Heap
	}
	
	
	public void method() {
		HeapStackAndLocalVariables hslv1; //Stack
		int x = 5;          //Stack
		int y = 6;			 //Stack
		int sum = x + y;	 //Stack
	}
	
}
