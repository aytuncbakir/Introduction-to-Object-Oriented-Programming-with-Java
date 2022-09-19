package com.aytuncbakir.oop.ch09.lecture03;

public class OverloadedConstructor {
	
	public static void main(String[] args) {
		

		Employee employee1 = new Employee();
		Employee employee2 = new Employee("Efe Can", "12345");
		Employee employee3 = new Employee("Ece Pak", "2346", "CEO");
		Employee employee4 = new Employee("Ekrem Tek", "67543", "Software Engineer", "Software Department");
	}
	
}


class Employee{
	
	private String name;
	private String no;
	private String profession;
	private String department;
	
	// May be come new employee
	public Employee() {
		
	}
	
	
	// Employee without profession and department
	public Employee(String name, String no) {
		super();
		this.name = name;
		this.no = no;
	}

	// Employee without  department
	public Employee(String name, String no, String profession) {
		super();
		this.name = name;
		this.no = no;
		this.profession = profession;
	}


	// Professional employees works at the department
	public Employee(String name, String no, String profession, String department) {
		super();
		this.name = name;
		this.no = no;
		this.profession = profession;
		this.department = department;
	}
	
	
	
}