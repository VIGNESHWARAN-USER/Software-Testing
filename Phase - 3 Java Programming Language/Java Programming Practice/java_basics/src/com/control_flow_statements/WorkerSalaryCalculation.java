package com.control_flow_statements;

import java.util.Scanner;

class Worker
{
	private int id;
	private String name;
	private float wages;
	private int workingDays;
	
	public Worker()
	{
		
	}
	
	public Worker(int id, String name, float wages, int workingDays)
	{
		this.id = id;
		this.name = name;
		this.wages = wages;
		this.workingDays = workingDays;
	}
	
	public void setID(int id)
	{
		this.id = id;
	}
	
	public void setWages(float wages)
	{
		this.wages = wages;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setWorkingDays(int workingDays)
	{
		this.workingDays = workingDays;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public float calculateSalary()
	{
		return this.wages * this.workingDays;
	}
}

public class WorkerSalaryCalculation {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Worker worker = new Worker();
		System.out.print("Enter the ID: ");
		worker.setID(sc.nextInt());
		System.out.print("Enter the name: ");
		worker.setName(sc.next());
		System.out.print("Enter the wages: ");
		worker.setWages(sc.nextFloat());
		System.out.print("Enter the no. of days worked: ");
		worker.setWorkingDays(sc.nextInt());
		
		System.out.print("The salary of the worker "+worker.getName()+" is: "+worker.calculateSalary());
	}
}
