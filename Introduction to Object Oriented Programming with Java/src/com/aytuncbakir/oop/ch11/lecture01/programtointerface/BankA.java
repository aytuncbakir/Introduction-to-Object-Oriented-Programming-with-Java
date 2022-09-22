package com.aytuncbakir.oop.ch11.lecture01.programtointerface;

public class BankA {
	
	public static void main(String[] args) {
		
		double credit = BankA.credit(1000, 36);
		System.out.println(credit);
	}
	
	
	public static double credit(double amount, int period) {
		CentralBank centralBank = new CentralBank();
//		double interest = centralBank.interestRate();
		double interest = centralBank.interestRate(0.75, 0.34);
		return interest * amount * period / 100 + amount;
	}

}
