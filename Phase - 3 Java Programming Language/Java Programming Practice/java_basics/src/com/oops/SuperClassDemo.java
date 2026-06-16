package com.oops;

class ProjectLeader
{
	String proLeadName = "Vignesh";
	int empId = 100;
}

class Programmer extends ProjectLeader
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
		System.out.println("Project Leader Id: "+super.empId);
		System.out.println("Project Leader Name: "+proLeadName);
	}
}

public class SuperClassDemo {
	public static void main(String args[])
	{
		Programmer p = new Programmer();
		p.setData("Vetri", 101);
		p.displayData();
	}
}
