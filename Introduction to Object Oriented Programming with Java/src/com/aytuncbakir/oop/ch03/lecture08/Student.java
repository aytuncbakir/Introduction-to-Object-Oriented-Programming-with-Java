package com.aytuncbakir.oop.ch03.lecture08;

import java.util.Date;

public class Student {
	
	public String no;
	public String name;
	public String dateOfBirth;
	public Date registrationDate;
	public String city;
	public String motherName;
	public String fatherName;
	public boolean isActive;
	
	
	public Student(String no, String name, String dateOfBirth, Date registrationDate, 
			String city, String motherName,
			String fatherName) {
		super();
		this.no = no;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.registrationDate = registrationDate;
		this.city = city;
		this.motherName = motherName;
		this.fatherName = fatherName;
		isActive = true;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public void addCourse(String course) {
		if(isActive) {
			System.out.println(course + " is added");
			return;
		}
		System.out.println("Education is not active!");
	}
	
	public void removeCourse(String course) {
		if(isActive) {
			System.out.println(course + " is removed.");
			return;
		}
		System.out.println("Education is not active!");
	}
	
	public void frezee() {
		if(isActive) {
			System.out.println("Education was frozen!");
			setActive(false);
		}
		
	}
	
	public void activate() {
		if(!isActive) {
			System.out.println("Education has been activated!");
			setActive(true);
		}
		
	}
	
	@Override
	public String toString() {
		return "Student \n[\nno=" + no + ", \nname=" + name + ", \ndateOfBirth=" + dateOfBirth + ", \nregistrationDate="
				+ registrationDate + ", \ncity=" + city + ", \nmotherName=" + motherName + ", \nfatherName=" + fatherName
				+ "\n]";
	}

	public String getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public String getMotherName() {
		return motherName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
}
