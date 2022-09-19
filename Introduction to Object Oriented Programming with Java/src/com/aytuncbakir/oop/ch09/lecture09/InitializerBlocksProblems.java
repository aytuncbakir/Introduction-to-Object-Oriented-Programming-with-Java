package com.aytuncbakir.oop.ch09.lecture09;


public class InitializerBlocksProblems {
	
	public static void main(String[] args) {
//		System.out.println("b: "  +InitializerBlocksProblems.b);
	}

//	static int a, b, c;   // observe what will happen
	static {
//		a = b * 4; 	
		b = 4; 
//		a = b - 2;	
	}
	
	static {
//		c = c*2; 
//		c = c-4; 
//		c++;     
//		System.out.println("c: "  +c);
	}
	static int a, b, c = 5;   // 
	
	static {
		b = 7;
	}

	 static int[] staticArray;
	
	 static{
//		  staticArray = {3, 4, 5};
//		 staticArray[0] = 3;
//		 staticArray[1] = 4;
//		 staticArray[2] = 5;
	 }
	
	int e = 7;
	static int h;
	
	static double d ;
	
	static {
//		d = e * h; 
	}
}
