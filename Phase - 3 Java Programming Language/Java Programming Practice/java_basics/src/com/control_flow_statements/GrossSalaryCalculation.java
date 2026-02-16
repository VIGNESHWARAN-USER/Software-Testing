package com.control_flow_statements;

import java.util.Scanner;

/*
 * Level: Medium
 * To input basic salary of an employee and calculate gross salary based on the condition
 * given below using if-else-if ststement:
 * Basic Salary <= 10000 : HRA = 20%, DA = 80%
 * Basic Salary is between 10001 to 20000: HRA = 25%, DA = 90%
 * Basic Salary >= 20001 : HRA = 30%, DA = 95%
 * Gross Salary=Basic Salary + HRA + DA
*/

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
