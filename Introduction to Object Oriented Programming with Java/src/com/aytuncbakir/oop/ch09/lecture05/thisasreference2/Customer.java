package com.aytuncbakir.oop.ch09.lecture05.thisasreference2;

public class Customer {
	int id;
	String name;
	CreditCard creditCard;

	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
	
}
