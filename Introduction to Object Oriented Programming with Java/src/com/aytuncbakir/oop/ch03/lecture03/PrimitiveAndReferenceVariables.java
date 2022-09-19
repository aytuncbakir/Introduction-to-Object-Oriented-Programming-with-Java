package com.aytuncbakir.oop.ch03.lecture03;

public class PrimitiveAndReferenceVariables {
	
	public static void main(String[] args) {
		
		//Primitive types
		int i = 3;
		int j = i;
		i = 5;   // j nin degeri nedir?
		
		System.out.println("j: "+j);
		
		Nesne ii = new Nesne("3");
		Nesne jj = ii;
		ii.objectName = "5";  // n2 ne gösterir?
		
		System.out.println("j: "+jj.objectName);
		
//		http://xyzcode.blogspot.com/2016/03/determine-effect-upon-object-references.html
		
	}

}

class Nesne{
	public String objectName;
	
	public Nesne(String objectName) {
		this.objectName = objectName;
	}
}


