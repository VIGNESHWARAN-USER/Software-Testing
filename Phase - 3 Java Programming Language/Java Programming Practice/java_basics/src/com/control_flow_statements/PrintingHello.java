package com.control_flow_statements;

import java.util.*;

/*
 * Level: Easy
 * 6. Write a program that reads an integer continuously and displays "Hello" as many times
 * as the value of the integer. If the user enters a negative number, the insertion of
 * integers should end and the program should display the total number of the displayed
 * "Hello".
*/

public class PrintingHello {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int val, sum = 0;
		while(true)
		{
			System.out.print("Enter the number: ");
			val = sc.nextInt();
			if(val < 0)
			{
				break;
			}
			sum += val;
			for(int i=0; i<val; i++)
			{
				System.out.print("Hello ");
			}
			System.out.println();
		}
		System.out.println("The number of times the Hello printed is: "+sum);
	}
}
