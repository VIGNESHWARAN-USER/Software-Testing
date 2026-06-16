package com.oops;

class ProjectLeader1
{
	String proLeadName = "Vignesh";
	int empId = 100;
	
	void displayData()
	{
		System.out.println("Project Leader Id: "+empId);
		System.out.println("Project Leader Name: "+proLeadName);
	}
}

class Programmer1 extends ProjectLeader1
{
	String progName;
	int empId = 101;
	
	void setData(String name, int Id)
	{
		progName = name;
		empId = Id;
	}
	
	void displayData()
	{
		System.out.println("Programmer Id: "+empId);
		System.out.println("Programmer Name: "+progName);
		super.displayData();
	}
}

public class SuperMethodDemo {
	public static void main(String args[])
	{
		Programmer1 p = new Programmer1();
		p.setData("Vetri", 101);
		p.displayData();
	}
}
