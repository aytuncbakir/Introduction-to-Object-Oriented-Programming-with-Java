package com.aytuncbakir.oop.ch09.lecture09;

public class InizializationBlocks {
	
	public int x;
	public static int y;
	
	
	
 /*	int */ {// 1 - inizialization block1    : inizialization blocks not member of class
		System.out.println("inizialization block1: ");
		x = 5;
		System.out.println("x: "+x);
		y = 11;
		System.out.println("y: "+y);
//		return;  blocks can not return  anything
	}
	
	{// 2 - inizialization block2
		System.out.println("inizialization block2: ");
		x = 7;
		System.out.println("x: "+x);
		y = 13;
		System.out.println("y: "+y);
		
	}
	
	static {// 1 - static initialization block1
		System.out.print("static inizialization block1: ");
		y = 11;
		System.out.println("y: "+y);
		
	}
	
	static {// 2 - static initialization block2
		System.out.print("static inizialization block2 : ");
		y = 15;
		System.out.println("y: "+y);
		
	}
	
	
	
	public InizializationBlocks(){
		this(5); 
		//x = 17;  // initial blocks not copied here
	}
	
	public InizializationBlocks(int x){
		
	}

}
