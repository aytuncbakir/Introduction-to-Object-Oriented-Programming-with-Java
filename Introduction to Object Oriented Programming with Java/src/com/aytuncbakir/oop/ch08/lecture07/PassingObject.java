package com.aytuncbakir.oop.ch08.lecture07;

public class PassingObject {
	
	public static void main(String[] args) {
		
		PassingObject passingObject = new PassingObject();
		
		Values values = new Values();
		values.i = 5;
		values.b = true;
		// 1
		System.out.println("1- i of values is " + values.i + "  and b of values is " + values.b);
		
		passingObject.assignValues(values);
		//3
		System.out.println("3- i of values is " + values.i + "  and b of values is " + values.b);
		
	}
	
	public void assignValues(Values v) {   // v = values
		v.i = 3;
		v.b = true;     // v = values
		
		Values vv = new Values();  // new reference and object
		vv.i = 7;
		vv.b = true;   
		
		v = vv;       // v = vv
		v.i = 12;
		v.b = false;
		//2
		System.out.println("2- i of v is " + v.i + "  and b of v is " + v.b);
	}
}
