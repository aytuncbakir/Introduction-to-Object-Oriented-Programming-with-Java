package com.aytuncbakir.oop.ch09.lecture08;

 // Do not repeat yourself. Duplicate initialization code in constructor.
public class BadInitialization1 {
	String name;
//	name = "Ali";
	String profession;
	
	double salary;
//	salary = 1000; // That's problem

	public BadInitialization1() {
		name = "Ali";
		
		profession = getProfession();
		if (profession.equals("Software"))
			salary = 4000;
		else
			salary = 3000;
	}

	public BadInitialization1(String name) {
		this.name = name;
		
		profession = getProfession();
		if (profession.equals("Software"))
			salary = 4000;
		else
			salary = 3000;
	}
	
	public static String getProfession() {
		return "Software";
	}
}
