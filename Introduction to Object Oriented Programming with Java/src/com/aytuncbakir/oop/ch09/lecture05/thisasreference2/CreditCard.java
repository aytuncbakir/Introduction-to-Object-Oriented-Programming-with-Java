package com.aytuncbakir.oop.ch09.lecture05.thisasreference2;

public class CreditCard {
	String cardNumber;
	double balance;
	Customer owner;

	public CreditCard(String cardNumber, double balance) {
		this.cardNumber = cardNumber;
		this.balance = balance;
	}

	public CreditCard(String cardNumber, double balance, Customer owner) {
		this.cardNumber = cardNumber;
		this.balance = balance;
		this.owner = owner;
		owner.setCreditCard(this);
	}

	public void setOwner(Customer owner) {
		this.owner = owner;
	}

}