package com.aytuncbakir.oop.ch11.lecture01.programtointerface;

public class CentralBank {
	
	private double interestRate = 0.8;
	private double coefficient = 0.2;
	
//	public double interestRate() {
//		
//		return interestRate;
//	}
//	
	
	public double interestRate(double inflation , double currency ) {
		double interestRate =  inflation * currency * coefficient;
		return interestRate;
	}

}
