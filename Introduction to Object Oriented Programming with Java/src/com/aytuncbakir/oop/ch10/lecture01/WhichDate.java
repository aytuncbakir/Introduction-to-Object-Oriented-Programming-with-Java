package com.aytuncbakir.oop.ch10.lecture01;

public class WhichDate {
	
	public static void main(String[] args) {
		
		Date date = new Date(); // refers to Date in same package
		date.printDate();
		
		//  java.util.Date
		java.util.Date date1 = new java.util.Date();
		
		//java.sql.Date
		java.sql.Date date2 = new java.sql.Date(0);
	}

}
