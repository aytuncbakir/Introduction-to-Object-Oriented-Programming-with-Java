package com.aytuncbakir.oop.ch03.lecture05;

public class CustomerTest {
	
	public static void main(String[] args) {
		
		// How to access member or instance variables ?
		// only with reference
		Customer customer = new Customer(123, "Ece");
		
		System.out.println(customer.name);
		System.out.println(customer.customerId);
		
		
		customer.chooseSomething("Television");
		
	}

}
