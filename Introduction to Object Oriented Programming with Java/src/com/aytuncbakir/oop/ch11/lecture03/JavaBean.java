package com.aytuncbakir.oop.ch11.lecture03;

public class JavaBean {
	
	// private fields  -  required
	private int a;
	private String s;
	
	// Default constructor - required
	public JavaBean() {
		// TODO Auto-generated constructor stub
	}

	// another constructor - not required but ok
//	public JavaBean(int a, String s) {
//		super();
//		this.a = a;
//		this.s = s;
//	}
	
	// Method   -  not required but ok
//	public void method() {
//		
//	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
	
}
