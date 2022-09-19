package com.aytuncbakir.oop.ch09.lecture07;

public class InitializationMemberVariables {
	
	//1 - definition statements
	private int i = 5;
	public static int j = 6;
	
	private int x;
	private int y;
	
	// if object / instance variable  --- method can be both  Class (static) or (Object) instance method
	private int z = initializeMemberVariable1();
	private int t = initializeMemberVariable2();
	
	// if Class / static variable  --- method can only be  Class (static) method
	static int m = initializeMemberVariable1();
//    static int n = initializeMemberVariable2();
	
	
	//2- Constructors	
	public InitializationMemberVariables(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//3- Method call
	public static int initializeMemberVariable1() {
		return 10;
	}
	

	//3- Method call
	public int initializeMemberVariable2() {
		return 10;
	}
	
	// 4- instance initializer blocks
	
	// 5- instance initializer blocks
	
	
	//forward reference
//	double triangle = edge * height / 2;
//	int edge = 2;      -> forward reference
//	static double height = 4;
	
	// But this ok?   Why?
	int edge = 2; 
	double triangle = edge * height / 2;
	static double height = 4;

}
