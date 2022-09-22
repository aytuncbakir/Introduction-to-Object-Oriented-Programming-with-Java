package com.aytuncbakir.oop.ch12.lecture05.covariant;


public class RecruiterCompany {
	
	public ComputerEngineer getAnEmployee(){
		return new ComputerEngineer();
	}
}
