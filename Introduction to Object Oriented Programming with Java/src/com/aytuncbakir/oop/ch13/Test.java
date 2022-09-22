/**
 * 
 */
package com.aytuncbakir.oop.ch13;

import com.aytuncbakir.oop.ch12.lecture05.covariant.BranchCompany;
import com.aytuncbakir.oop.ch12.lecture05.covariant.ComputerEngineer;
import com.aytuncbakir.oop.ch12.lecture05.covariant.RecruiterCompany;
import com.aytuncbakir.oop.ch12.lecture05.covariant.SoftwareEngineer;

public class Test {

	public static void main(String[] args) {
		RecruiterCompany hr = new RecruiterCompany();
		ComputerEngineer employee1 = hr.getAnEmployee();
		employee1.work();
		
		BranchCompany hrBranch = new BranchCompany();
		ComputerEngineer employee2 = hrBranch.getAnEmployee();
		employee2.work();
		
		SoftwareEngineer manager = hrBranch.getAnEmployee();
		manager.work();
		
	}
}
