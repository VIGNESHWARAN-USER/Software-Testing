package com.control_flow_statements;

import java.util.*;

/*
 * Level: Easy
 * 10. Write a program to print the following number pattern
 * Sample I/O
 * Enter the N value: 5
 * 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 * 5 5 5 5 5
*/

public class NumberPattern {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int val = sc.nextInt();
		for(int i=1; i<=val; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
