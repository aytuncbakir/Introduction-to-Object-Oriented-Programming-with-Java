package com.aytuncbakir.oop.ch09.lecture08;

//Duplicating initialization method call in constructors.
public class BadInitialization3 {
	String name;

	String profession;
	
	double salary;

	BadInitialization3() {
		name = "ali";
		initializeSalary();
	}

	BadInitialization3(String name) {
		this.name = name;
		initializeSalary();
	}
	
	void initializeSalary() {
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
