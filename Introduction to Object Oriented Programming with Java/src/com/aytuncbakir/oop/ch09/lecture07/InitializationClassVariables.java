package com.aytuncbakir.oop.ch09.lecture07;

public class InitializationClassVariables {
	
	public static void main(String[] args) {
		System.out.println(StaticTable.print());
	}

}

class StaticTable{
	
	static int area;
	static float weight;
	static double height;
	static String type;
	static boolean isdurable;
	static char code;
	static Leg leg;
	
	public static String print() {
		return "Table [area=" + area + ", weight=" + weight + ", height=" + height + ", type=" + type + ", isdurable="
				+ isdurable + ", code=" + (int)code + ", leg=" + leg + "]";
	}
	
	
}

class StaticLeg{
	static double height;
	
}