package com.aytuncbakir.oop.ch09.lecture08;

import java.time.LocalTime;
import java.util.Random;


public class BadInitializationSolution {
	String name;
	double salary;
	String profession;
	

	{
		name = "ali";
		
		profession = getProfession();
		if (profession.equals("Software"))
			salary = 4000;
		else
			salary = 3000;
	}

	static int bonus;

	
	static {
			bonus  = 5;	
	}

	BadInitializationSolution() {
		
	}

	BadInitializationSolution(String name) {
		this.name = name;
	}

	public static String getProfession() {
		return "Software";
	}
	
	public static void main(String[] args) {
		BadInitializationSolution badInitSolution = new BadInitializationSolution();
		System.out.println("bonus: " + bonus);
		System.out.println("salary: " + badInitSolution.salary);
	}
}
