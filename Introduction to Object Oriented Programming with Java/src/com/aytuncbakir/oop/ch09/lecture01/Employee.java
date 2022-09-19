package com.aytuncbakir.oop.ch09.lecture01;

public class Employee {
	
	private String name;
	private int no;
	
	// Constructor has no return type
	public /* void - nothing comes here */ Employee() {
		
		return;  // can be written but nothing returns
	}
	
	// Employee = ConstructorName (Class Name) , Upper Camel Case ???  --> method
	public Employee(String name, int no) {  // constructor method
		super();
		this.name = name;
		this.no = no;
	}
	
	// that is not a constructor method, it is a normal method
	public int Employee(int i) {  
		return  i;
	}
	
	public String getName() {
		return name;
	}
	public int getNo() {
		return no;
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void work() {
		System.out.println("Ok. I am working!");
	}
}
