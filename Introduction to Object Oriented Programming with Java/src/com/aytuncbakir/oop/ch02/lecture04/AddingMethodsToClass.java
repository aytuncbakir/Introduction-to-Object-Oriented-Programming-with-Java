package com.aytuncbakir.oop.ch02.lecture04;

public class AddingMethodsToClass {
	
	/*
	  	• Metotlar (methods) siniflarin davranislaridir(behaviors).
	  	 Siniflar sorumluluklarını (responsibility) metodlari ile yerine getirirler.
		• Metotlar, argüman olarak bilgi alırlar ve çağrıldıkları yere bilgi döndürürler.
		• Ancak bu zorunlu degildir. Bilgi almayan ve/veya bilgi döndurmeyen metodlarda olabilir.
		• Metotlarla da modifiers-niteleyiciler kullanilabilir.
70
	 */
	
	/*
	  Method Template
		<niteleyici>* <dönüş tipi> <metotAdi>(<Argüman>*){
			<ifade>*
		}	
	
		<niteleyici>* <return type> <methodName>(<Arguments>*){
			<expression>*
		}
	 */
	
	public static void main(String[] args) {
		
		System.out.print("sayHello: ");
		sayHello1();
		
		System.out.print("sayHello2: ");
		sayHello2("Ali");
		
		System.out.print("sayHello3: ");
		String gelenBilgi = sayHello3();
		System.out.println(gelenBilgi);
		
		System.out.print("sayHello4: ");
	    gelenBilgi = sayHello4("Veli");
		System.out.println(gelenBilgi);
	}
	
	public static void sayHello1() {
		System.out.println("Hello World!");
	}
	
	public static void sayHello2(String name) {
		System.out.println( "Hello "+ name);
	}
	
	public static String sayHello3() {
		return "Merhaba Dunya";
	}
	
	public static String sayHello4(String name) {
		String greetingLause = "Hello " + name;
		return greetingLause;
	}

}
