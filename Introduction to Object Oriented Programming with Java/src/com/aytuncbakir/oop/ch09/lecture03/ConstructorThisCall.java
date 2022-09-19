package com.aytuncbakir.oop.ch09.lecture03;

public class ConstructorThisCall {
	
	public static void main(String[] args) {
		
		System.out.println("----------------------------------------------");
		System.err.println("Created Citizen by no :");
		System.out.println("----------------------------------------------");
		Citizen citizen1 = new Citizen(123);
		System.out.println("----------------------------------------------");
		System.out.println();
		
		System.out.println("----------------------------------------------");
		System.err.println("Created Citizen by name :");
		System.out.println("----------------------------------------------");
		Citizen citizen2 = new Citizen("Vatandas Riza");
		System.out.println("----------------------------------------------");
		System.out.println();
		
		System.out.println("----------------------------------------------");
		System.err.println("Created Citizen by name and no :");
		System.out.println("----------------------------------------------");
		Citizen citizen3 = new Citizen("Vatandas Ali", 33778);
		System.out.println("----------------------------------------------");
		System.out.println();
	
		System.out.println("----------------------------------------------");
		System.err.println("Created Citizen by name, no and homecity :");
		System.out.println("----------------------------------------------");
		Citizen citizen4 = new Citizen("Vatandas Ali", 33778, "Alanya");
		System.out.println("----------------------------------------------");
		System.out.println();
		
	}

}



class Citizen{
	
	private String name;
	private int no;
	private String homeCity;
	
	// DRY - DO NOT REPEAT YOURSELF
	public Citizen(String name, int no, String homeCity) {
		this.name = name;
		this.no = no;
		this.homeCity = homeCity;
		System.out.println("Citizen(String name, int no, String homeCity)");
	}
	
	public Citizen(String name, int no) {
		this(name, no, "Adana");
		System.out.println("Citizen(String name, int no)");
	}
	public Citizen(String name) {
		this(name, 1234);
		System.out.println("Citizen(String name)");
	}
	public Citizen(int no) {
		this("Mehmet" , no);
		System.out.println("Citizen(int no)");
	}
	
}
