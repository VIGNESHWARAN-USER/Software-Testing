package com.oops;

public class CollegeManagementSystem {
	public static void main(String args[])
	{
		Staff staff = new Staff("Vetri", "Salem", "KIOT", 20000);
		Student student = new Student("Vignesh", "Salem", "B.E CSE", 4, 100000);
		
		System.out.println("Staff Details: "+staff);
		System.out.println("Student Details: "+student);
	}
}
