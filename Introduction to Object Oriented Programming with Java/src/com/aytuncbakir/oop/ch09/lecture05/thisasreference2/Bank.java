package com.aytuncbakir.oop.ch09.lecture05.thisasreference2;

public class Bank {
	
	public static void main(String[] args) {
		Customer customer = new Customer(1223, "Jack");
		CreditCard creditCard = new CreditCard("145564339", 10000);
		creditCard.setOwner(customer);
		customer.setCreditCard(creditCard);
		
		System.out.println(customer);
		System.out.println("Card number : "+customer.creditCard.cardNumber);
		System.out.println("Card balance : "+customer.creditCard.balance);
		
		System.out.println();
		// altervative way
		Customer customer1 = new Customer(78755, "Elena");
		CreditCard creditCard1 = new CreditCard("5657", 2500, customer1);
		
		System.out.println(customer1);
		System.out.println("Card number : "+customer1.creditCard.cardNumber);
		System.out.println("Card balance : "+customer1.creditCard.balance);
	}

}
