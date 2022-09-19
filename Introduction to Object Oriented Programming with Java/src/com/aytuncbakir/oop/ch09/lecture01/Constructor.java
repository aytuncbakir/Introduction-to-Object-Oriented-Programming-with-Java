package com.aytuncbakir.oop.ch09.lecture01;

public class Constructor {
	
	public static void main(String[] args) {
		
		
//		Boss boss;
//		boss.name = "Boss";
//		boss.no = 12345;
//		boss.command();
		
		Employee employee = new Employee("Employee", 2342);
		employee.getName();
		employee.work();
		
		//String, array , primitive wrappers can be created without constructor
	}

}
