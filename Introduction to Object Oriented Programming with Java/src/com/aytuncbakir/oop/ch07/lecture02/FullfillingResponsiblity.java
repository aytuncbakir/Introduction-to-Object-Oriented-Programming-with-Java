package com.aytuncbakir.oop.ch07.lecture02;

public class FullfillingResponsiblity {
	
	
	public static void main(String[] args) {
		
		
		
		// objects fulfill the responsibilities in 3 ways
		// 1- Object give state information to client object
		// 2- Other objects ask an object to change its state.
		// 3- Objects fulfill an action due to client object's request.
		
		
		Patient patient = new Patient();
		Doctor familydoctor = new Doctor(patient);
		
		familydoctor.askPatientState();
		
		familydoctor.treat();
		
		familydoctor.comeToControl();
		
		// Think a : Hospital Management System. It is a huge system and there are lots of object
		// In this software system each object take a responsibility so these divided responsibilities
		// are a part of the system.
		// Director, Doctor, Nurse, Cleaner
		
		

	}

}
