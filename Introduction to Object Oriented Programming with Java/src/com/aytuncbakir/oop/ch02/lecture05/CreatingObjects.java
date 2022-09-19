package com.aytuncbakir.oop.ch02.lecture05;

public class CreatingObjects {
	
	/*
		(object creation / instantiation)
	• Nesneler siniflarinin bir örnegidir (instance). 
	• new anahtar sözcugu kullanılırak nesne yaratilir,
	• new anahtar sözcugu sadece nesne yaratmak icin kullanılır 
	  ve new'den sonra her zaman, yaratilacak nesnenin kurucu metot çağrısı 
	  (constructor call) gelir.
	    
	 -When object is created, object will placed anywhere in  memory and  
	 	address of this place assigns to object's reference. 
	 -After the object is created, the properties and 
	 	methods defined in its class can be accessed through the object.  
	    
	  */
	
	public static void main(String[] args) {
		
		// Reference    = new Constructor call
		Student student  = new Student();
		// Reference type have to be same object type
		
//		Null
//		Student student1;
//		System.out.println(student1.toString());
		
		Student ahmet = new Student("Ahmet");
		
		System.out.println(ahmet.name);
		ahmet.sayHello();
	}

}
