package com.aytuncbakir.oop.ch12.lecture01;

public class Reuseability {
	
	
	// method reuseability  - easy
	// class reusebility - difficult
	
	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.work();
		Employee employee2 = new Employee();
		employee2.work();
		
		Employee employeeN = new Employee();
		employeeN.work();
	}
	

}

class Employee {
	
	private String name;
	private long id;
	private String profession;
	
	public void work() {
		System.out.println(" I am working!");
	}
}

// Employee at call center, international service
class OurEmployee {
	
	private String name;
//	private long id;
//	private String profession;
	private String language;
	
	public void answer() {
		System.out.println(" Hello! How can i help you!");
	}
}
