package com.aytuncbakir.oop.ch08.lecture05;

public class GivingNameToMethods {
	
	
	public void print(String s) {
		System.out.println(s);
	}
	
	// Student
	public boolean addCourse() {
		return true;
	}
	
	//Advisor
	public void advise() {
		System.out.println("Work hard!");
	}
	
	// Bank
	public double calculateCredit(double amount, int month) {
		double credit = amount + (amount * 8 / 100) * month;
		return credit;
	}

}
