package com.aytuncbakir.oop.ch09.lecture06;

public class ClassVariables {
	
	public int objectVariable1 ;
	public String objectVariable2 ;
	
	public static int classVariable1 = 5;
	public static int classVariable2 = 0;
	
	
	public static void main(String[] args) {
		
		ClassVariables  classObject =  new ClassVariables();
		int i = classObject.objectVariable1;
		String s = classObject.objectVariable2;
		
		int j = classObject.classVariable1;
		
		int k = ClassVariables.classVariable1;
	}

}
