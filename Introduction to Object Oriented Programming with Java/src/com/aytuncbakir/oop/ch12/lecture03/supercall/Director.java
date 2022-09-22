package com.aytuncbakir.oop.ch12.lecture03.supercall;


public class Director extends Manager {
	protected double bonus;
	
	public Director(int no, String name, int year, String workingDepartment, String managingDepartment, double bonus) {
		super(no, name, year, workingDepartment, managingDepartment);
		this.bonus = bonus;
		System.out.println("in Director()");
	}
}
