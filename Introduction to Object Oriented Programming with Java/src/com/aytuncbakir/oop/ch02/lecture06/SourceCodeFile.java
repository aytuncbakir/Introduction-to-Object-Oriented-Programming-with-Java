package com.aytuncbakir.oop.ch02.lecture06;

import java.util.ArrayList;
import java.util.List;

public class SourceCodeFile {
	
	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<String>();
	}

}

// Note : Package and import fields are not mandatory.

/*  
	package <packageName>;
	import <type1>;
	…
	import <typeN>;
	
	<modifier>* class <ClassName>{
		<propert>*
		<method>*
	}
 */


/*  
	package <packageName>;
	import <type1>;
	…
	import <typeN>;
	
	// What is the meaning of public?
	public class ClassWithPublicModifier{
	
	}
	
	class OtherClass{
	
	}
	
	class AnotherClass{
	
	}
	
	...
	
	class NOtherClass{
	
	}
*/
