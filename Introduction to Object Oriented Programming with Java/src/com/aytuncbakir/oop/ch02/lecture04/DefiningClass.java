package com.aytuncbakir.oop.ch02.lecture04;


/*
  Class template
  
  <niteleyici>* class <Sınıfİsmi>{
	<değişken>*
	<metot>*
  }
  
   <modifier>* class <ClassName>{
	<property-attribute-filed>*
	<method>*
  }
 
 */
public class DefiningClass {
	// Javada en genis blok sinif (class) blogudur
	// siniflarin özellikleri ve davranislari vardir.
	
	// Nesne degiskenleri (object / instance variables)  -- field
	int property;
	String attribute;
	double field;
	
	// behaviour
	public void nesneMethodu1() {
		System.out.println("Object - instance methods");
	}
	
	// behaviour
	public void nesneMethodu2() {
		System.out.println("siniflarin birden cok davranisi olabilir");
	}

}

/*
Niteleyici (modifier) Java’da, sınıf, metot, değişken gibi yapılarla beraber kullanilmaktadir. 
Niteleyiciler kullanilarak bu yapilarin davranislari degistirilebilmektedir.

• Örnek olaral erişim niteleyicileri (access modifiers)
*/

//  Note: Javada ayrica enum ve interface yapilarida mevcuttur.

