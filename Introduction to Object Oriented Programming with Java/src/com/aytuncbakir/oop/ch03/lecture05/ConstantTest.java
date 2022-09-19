package com.aytuncbakir.oop.ch03.lecture05;

public class ConstantTest {
	
	public static void main(String[] args) {
		
		// access both object reference and class reference
		// No need to create instance of class to access the class variable
		ConstantValues city = new ConstantValues();
		
		String licensePlateAnkara = ConstantValues.ankara;
		
		System.out.println(licensePlateAnkara);
		
		String licensePlateAdana = city.adana;
		System.out.println(licensePlateAdana);
		
		
	}

}
