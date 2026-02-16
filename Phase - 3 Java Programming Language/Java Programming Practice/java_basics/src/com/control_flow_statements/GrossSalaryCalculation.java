package com.control_flow_statements;

import java.util.Scanner;

public class GrossSalaryCalculation {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Basic Salary: ");
		float grossSalary;
		float basicSalary = sc.nextFloat();
		if(basicSalary <= 10000)
		{
			grossSalary = basicSalary + basicSalary*0.20f + basicSalary*0.80f;
		}
		else if(basicSalary <= 20000)
		{
			grossSalary = basicSalary + basicSalary*0.25f + basicSalary*0.90f;
		}
		else
		{
			grossSalary = basicSalary + basicSalary*0.30f + basicSalary*0.95f;
		}
		System.out.println("Your Gross Salary is: "+grossSalary);
	}
}
