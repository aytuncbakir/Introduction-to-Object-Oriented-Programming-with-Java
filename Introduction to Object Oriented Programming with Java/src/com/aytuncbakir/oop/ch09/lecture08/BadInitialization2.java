package com.aytuncbakir.oop.ch09.lecture08;

//Do not repeat yourself. Duplicate initialization code in constructor.
//And  calling this() not solve the problem.
public class BadInitialization2 {
	String name;
	int id;
	String profession;

	double salary;

	public BadInitialization2() {
//		this("Ali"); // Can't call it!

		profession = getProfession();
		if (profession.equals("Software"))
			salary = 4000;
		else
			salary = 3000;
	}

	public BadInitialization2(String name, int id) {
		this.name = name;
		this.id = id;

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
