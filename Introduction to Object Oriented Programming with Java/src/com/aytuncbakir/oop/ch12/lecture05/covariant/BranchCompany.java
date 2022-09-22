package com.aytuncbakir.oop.ch12.lecture05.covariant;


public class BranchCompany extends RecruiterCompany{
	
	// Parents returns ComputerEngineer but child returns SoftwareEngineer
	public SoftwareEngineer getAnEmployee(){  // Covariant return type
		return new SoftwareEngineer();
	}
}
