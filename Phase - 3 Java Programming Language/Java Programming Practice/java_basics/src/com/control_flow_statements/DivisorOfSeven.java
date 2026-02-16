package com.control_flow_statements;

import java.util.Scanner;

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
