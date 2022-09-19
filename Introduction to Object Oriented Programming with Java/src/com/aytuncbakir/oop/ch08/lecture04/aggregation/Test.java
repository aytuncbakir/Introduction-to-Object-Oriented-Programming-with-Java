package com.aytuncbakir.oop.ch08.lecture04.aggregation;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		// Creating object of Student class inside main()
        Student s1 = new Student("John", 33333, "CS");
        Student s2 = new Student("Adam", 555, "CE");
        Student s3 = new Student("Paul", 5666, "EEE");
        Student s4 = new Student("Sofia", 5667, "EEE");
 
        // Creating a List of CSE Students
        List<Student> cse_students = new ArrayList<Student>();
 
        // Adding CSE students
        cse_students.add(s1);
        cse_students.add(s2);
 
        // Creating a List of EE Students
        List<Student> ee_students
            = new ArrayList<Student>();
 
        // Adding EE students
        ee_students.add(s3);
        ee_students.add(s4);
 
        // Creating objects of EE and CSE class inside
        // main()
        Department CSE = new Department("CSE", cse_students);
        Department EE = new Department("EE", ee_students);
 
        List<Department> departments = new ArrayList<Department>();
        departments.add(CSE);
        departments.add(EE);
 
        // Lastly creating an instance of Institute
        Institute institute = new Institute("BITS", departments);
 
        // Display message for better readability
        System.out.print("Total students in institute: ");
 
        // Calling method to get total number of students
        // in institute and printing on console
        System.out.print(institute.getTotalStudentsInInstitute());
	}

}
