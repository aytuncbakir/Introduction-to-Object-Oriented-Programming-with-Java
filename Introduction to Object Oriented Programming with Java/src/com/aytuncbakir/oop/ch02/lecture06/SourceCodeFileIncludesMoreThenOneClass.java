package com.aytuncbakir.oop.ch02.lecture06;

public class SourceCodeFileIncludesMoreThenOneClass {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		System.out.println(student.name);
		
		Teacher teacher = new Teacher();
		System.out.println(teacher.name);
		
		School school = new School();
		System.out.println(school.name);
		
	}
	
	

}



class Student{
	String name = "John";
}

class Teacher {
	String name = "Mike";
}

class School {
	String name = "Sait Faik Abasiyanik Lisesi";
}

//public class Lecture{
//
//}
class javadaSinifAdiKucukHarfleBaslayabilir{
	// Class - Sinif isimlendirmesi - UpperCamelCase style
	// Property ve method isimlendirmesu  - lowerCamelCase style
}
