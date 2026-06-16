package com.control_flow_statements;

import java.util.Scanner;

/*
 * Level: Easy
 * 7. Write a program using if statement to check whether the blood donor is eligible or not
 * for donating blood. The rules laid down are as follows.
 * a. Age should be above 18 yrs but less than 55 yrs.
 * b. Weight should be more than 45kg.
*/

public class BloodDonar {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		if(age > 18 && age < 55)
		{
			System.out.println("Enter your weight: ");
			float weight = sc.nextFloat();
			if(weight > 45)
			{
				System.out.println("You are eligible to donate blood");
			}
			else
			{
				System.out.println("You are not eligible because you are under weight");
			}
		}
		else
		{
			System.out.println("You are not eligible because of age criteria");
		}
	}
}
