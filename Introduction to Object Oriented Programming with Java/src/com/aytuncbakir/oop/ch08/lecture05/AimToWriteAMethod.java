package com.aytuncbakir.oop.ch08.lecture05;

public class AimToWriteAMethod {
	
	private int count;
	Methods methods;

	
	// accessor method
	public void setCount(int count) {
		this.count = count;
	}
	//mutator methods
	public int getCount() {
		return count;
	}
	
	//calculate, perform an action
	public double calculate(int amount, int tax) {
		double d = amount + (amount * tax / 100);
		return d;
	}
	
	
	//calculate, perform an action
	public double calculateDebt() {
		double capital = 1000;
		double d = capital * methods.interest(); // methods.interest() delegation 
		return d;
	}
	
	

}
