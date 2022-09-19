package com.aytuncbakir.oop.ch07.lecture02;

public class Doctor {
	
	private Patient patient;
	
	public Doctor(Patient patient) {
		super();
		this.patient = patient;
	}

	public void askPatientState() {
		patient.tellYourIllness();
	}
	
	public void treat() {
		patient.doWhatDoctorSay();
	}
	
	public void comeToControl() {
		writeReceipt();
		patient.goToControl();
	}
	
	public void writeReceipt() {
		System.out.println("I will write medicine to you. Take them all. And come next week.");
	}
	
	

}
