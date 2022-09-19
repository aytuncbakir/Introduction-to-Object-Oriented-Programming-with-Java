package com.aytuncbakir.oop.ch03.lecture05;

public class LocalVariables {
	
	//instance variable
	public int price;
	
	// class variable
	public static int totalProduct = 100;
	
	
	/*
	Local variables
	Stack variables
	Automatic variables
	Temporary variables
	*/
	
	public double calculate() {
		// local variable
		double coefficent = 1.2;
		return coefficent * price;
	}
	
	public void sell() {
		totalProduct--;
	}
	

}
