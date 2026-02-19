package com.oops;

class Student
{
	private int id;
	private String name;
	private String department;
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public Student setId(int id) {
		this.id = id;
		return this;
	}
	
	public Student setName(String name) {
		this.name = name;
		return this;
	}
	
	public Student setDepartment(String department) {
		this.department = department;
		return this;
	}
	
	
}

public class MethodChaining {
	public static void main(String args[])
	{
		Student student = new Student().setId(1).setName("Vignesh").setDepartment("CSE");;
		
	 // Method chaining.
		
		System.out.println("ID: "+student.getId()+
				"\nName: "+student.getName()+
				"\nDepartment: "+student.getDepartment());
	}
}
