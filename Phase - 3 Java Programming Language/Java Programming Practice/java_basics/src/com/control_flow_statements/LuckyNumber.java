package com.control_flow_statements;

import java.util.*;

public class LuckyNumber {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the car number: ");
		int n = sc.nextInt();
		if(n >= 1000 && n <= 9999)
		{
			int sum = SumOfDigits.sumOfDigits(n);
			if(sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0)
			{
				System.out.println("Lucky Number.");
			}
			else
			{
				System.out.println("Sorry it’s not my lucky number");
			}
		}
		else
		{
			System.out.println(n+" is not a valid car number");
		}
	}
}
