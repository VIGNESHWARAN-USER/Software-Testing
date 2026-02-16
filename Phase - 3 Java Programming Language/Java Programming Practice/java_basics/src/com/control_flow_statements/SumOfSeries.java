package com.control_flow_statements;

import java.util.*;

public class SumOfSeries {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int sum = 0;
		do
		{
			sum += num;
			num--;
		}while(num > 0);
		System.out.println("The sum is: "+sum);
	}
}
