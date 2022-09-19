package com.aytuncbakir.oop.ch08.lecture04;

public class Student {
	
	private Advisor advisor;  // one-to-one 1-1 relation 
	private String name;
	
	public Student(String name) {
		super();
		this.name = name;
	}

	public Advisor getAdvisor() {
		return advisor;
	}

	public void setAdvisor(Advisor advisor) {
		this.advisor = advisor;
	}

	public String getName() {
		return name;
	}

}
