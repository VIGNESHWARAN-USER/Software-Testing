package com.oops;

class Student1
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
	
	public Student1 setId(int id) {
		this.id = id;
		return this;
	}
	
	public Student1 setName(String name) {
		this.name = name;
		return this;
	}
	
	public Student1 setDepartment(String department) {
		this.department = department;
		return this;
	}
	
	
}

public class MethodChaining {
	public static void main(String args[])
	{
		Student1 student = new Student1().setId(1).setName("Vignesh").setDepartment("CSE");;
		
	 // Method chaining.
		
		System.out.println("ID: "+student.getId()+
				"\nName: "+student.getName()+
				"\nDepartment: "+student.getDepartment());
	}
}
