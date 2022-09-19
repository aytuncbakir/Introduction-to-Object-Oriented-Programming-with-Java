package com.aytuncbakir.oop.ch09.lecture08;


//initialization code is too complicated!
public class BadInitialization4 {
	String name;

	double salary = getProfession().equals("Software") ? 4000 : 3000;
	
	//  a static array have to  initialize in static method!
	static int[] bonus = new int[10];

	BadInitialization4() {
		name = "default";
	}

	BadInitialization4(String name) {
		this.name = name;
		
		// Too late to initialize
//		System.out.println("\nInitializing the static array.");
//		for (int i = 0; i < bonus.length; i++)
//			bonus[i] = (i + 1) * 3;
	}
	
	static void initializeArray() {
		System.out.println("\nInitializing the static array.");
		for (int i = 0; i < bonus.length; i++)
			bonus[i] = (i + 1) * 10;
	}
	
	public static void main(String[] args) {
		// First initialize array
		BadInitialization4.initializeArray();
		
		System.out.println();
		
		for(int i : bonus)
			System.out.print(i + " ");
		
		System.out.println("\n");
		
		System.out.println(new BadInitialization4().salary);
	}
	
	public static String getProfession() {
		return "Software";
	}
}
