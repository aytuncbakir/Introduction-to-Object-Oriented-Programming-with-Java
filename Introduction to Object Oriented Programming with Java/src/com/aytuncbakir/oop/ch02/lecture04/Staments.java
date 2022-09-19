package com.aytuncbakir.oop.ch02.lecture04;

public class Staments {

	public static void main(String[] args) {
		
		int x;
		x = 5;
		
		//Declaration statements
		int number;
		boolean isOpen;
		String str;
		double amount;
		
		//Student s;
		
		
		//Definition statements
		int counter = 1;
		boolean isClose= true;
		int a = 5;
		int b = 7;
		int sum = 0;
		//Student student = new Student();
		
		//Control flow statements
		
		//If statement
		if(a < b)
			System.out.println("do something");
		
		//for statement   
		for (int i = 1; i <= 10; i++)
			sum += i;
		
		//while statement
		while(x < 5)
			x++;
		
		//do-while statement
		do {
			x++;
		}while(x < 5);
		
		// switch statement		
		switch (a) {
			case 0: System.out.print("do something ");
			case 1: System.out.print("do other thing ");
			case 2: System.out.println("do another thing");
		}
		
		//empty statement
		;
		
		// assert 
		assert a>=18:" Not valid";  
		
//		The try statement allows you to define a block of code to be tested for errors 
//		while it is being executed.
//		The catch statement allows you to define a block of code to be executed, 
//		if an error occurs in the try block.
		try {
			  //  Block of code to try
		}
		catch(Exception e) {
			  //  Block of code to handle errors
		}
		
		
	}

}
