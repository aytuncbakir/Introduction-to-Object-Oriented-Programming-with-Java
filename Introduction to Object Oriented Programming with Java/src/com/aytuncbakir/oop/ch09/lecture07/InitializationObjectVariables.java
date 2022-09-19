package com.aytuncbakir.oop.ch09.lecture07;

public class InitializationObjectVariables {
	
	public static void main(String[] args) {
		System.out.println(new Table());
	}

}

class Table{
	
	int area;
	float weight;
	double height;
	String type;
	boolean isdurable;
	char code;
	Leg leg;
	@Override
	public String toString() {
		return "Table [area=" + area + ", weight=" + weight + ", height=" + height + ", type=" + type + ", isdurable="
				+ isdurable + ", code=" + (int)code + ", leg=" + leg + "]";
	}
	
	
}

class Leg{
	double height;
	
}