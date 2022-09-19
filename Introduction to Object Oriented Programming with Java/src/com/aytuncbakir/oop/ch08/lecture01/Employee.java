package com.aytuncbakir.oop.ch08.lecture01;

public class Employee {
	
	
	private String name;
	private String department;
	
	// Constructor: it is a special type on method
	public Employee() {
		System.out.println("NoArgsConstructor has worked!");
	}
	
	// Constructor: it is a special type on method
	public Employee(String name, String department) {
		System.out.println("ConstructorWithArgs has worked!");
		this.name = name;
		this.department = department;
	}
	
	public void work() {
		System.out.println("Ok i am working!");
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
	

}
