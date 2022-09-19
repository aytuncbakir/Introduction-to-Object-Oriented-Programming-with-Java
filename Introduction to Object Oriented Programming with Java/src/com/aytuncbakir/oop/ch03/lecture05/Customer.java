package com.aytuncbakir.oop.ch03.lecture05;

public class Customer {
	
	
	// instance/member variable - These are part of the object
	public int customerId;
	public String name;
	public long balance;
	public String address;
	public String phone;
	// where we can place instance variables in class?
	
	public Customer(int customerId, String name) {
		this.customerId = customerId;
		this.name = name;
	}
	
	public void chooseSomething(String something) {
		System.out.println(something + "was chosen.");
	}
	
	public void addToCart(String something) {
		System.out.println(something + "added to Cart.");
	}
	
	public void removeFromCart(String something) {
		System.out.println(something + "added to Cart.");
	}
	
	public void pay(String something) {
		System.out.println(something + "was paid.");
	}
	
	

}
