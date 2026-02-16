package com.control_flow_statements;

import java.util.*;

/*
 * Level: Easy
 * 9. Write a program to print sum of digits of a given number.
*/

public class SumOfDigits {
	
	public static int sumOfDigits(int val)
	{
		int sum = 0;
		while(val > 0)
		{
			sum += val%10;
			val /= 10;
		}
		return sum;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enetr the number: ");
		int val = sc.nextInt();
		int ans = sumOfDigits(val);
		System.out.println("The sum of digits of given number is: "+ans);
	}
}
