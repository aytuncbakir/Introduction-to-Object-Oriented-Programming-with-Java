package com.aytuncbakir.oop.ch09.lecture06;

public class CitizenTest {
	
	public static void main(String[] args) {
		
		// No need to create object
		System.out.println("Citizen  :"+Citizen.nationality);
		
		Citizen citizen1 = new Citizen();
		Citizen citizen2 = new Citizen();
		Citizen citizen3 = new Citizen();
		Citizen citizen4 = new Citizen();
		
		System.out.println("citizen1 :" + citizen1.nationality);
		System.out.println("citizen2 :" +citizen2.nationality);
		System.out.println("citizen3 :" +citizen3.nationality);
		System.out.println("citizen4 :" +citizen4.nationality);
		
		
		
	}

}
