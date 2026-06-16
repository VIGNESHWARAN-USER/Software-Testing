package com.control_flow_statements;

import java.util.Scanner;

/* 
* Level: Easy
* 2. Write a program to check whether the given number is divisor of 7 using simple if
* statement.
*/


public class DivisorOfSeven {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int val = sc.nextInt();
		if(val%7 == 0)
		{
			System.out.println("The given number is divisible by 7.");
		}
	}
}
