package com.aytuncbakir.oop.ch08.lecture07;

import com.aytuncbakir.oop.ch07.lecture02.Doctor;
import com.aytuncbakir.oop.ch07.lecture02.Patient;

public class CallingMethodWithoutReference {
	
	public static void main(String[] args) {
		
		new FinalParameterPassToMethod().assignNewValue("new value");
		
		// new FinalParameterPassToMethod() that is a reference
		
		// Doctor class constructor: Doctor(Patient patient)
		new Doctor(new Patient()).askPatientState();
	}
}
