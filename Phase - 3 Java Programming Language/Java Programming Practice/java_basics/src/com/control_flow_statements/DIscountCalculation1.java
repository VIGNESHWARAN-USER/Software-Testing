package com.control_flow_statements;

import java.util.*;

/*
 * Level: Medium
 * Calculate purchase amount to be paid after discount using if-else. Consider 10 %
 * discount for the Sale amount above 1000 and 5% discount for the Sale amount less
 * than 1000.
 * Formula:
 * Purchase Amount = price * quantity
 * Discount Amount = Purchase amount * 0.10(10%)
 * Paid Amount = Purchase Amount – Discount Amount
*/
public class DIscountCalculation1 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("How many products did you buy: ");
		int numberOfProducts = sc.nextInt();
		float amount = 0;
		for(int i = 1; i < numberOfProducts+1; i++)
		{
			System.out.print("Enter the price of product "+i+": ");
			float price = sc.nextFloat();
			System.out.print("Enter the quantity of product "+i+": ");
			int quantity = sc.nextInt();
			amount += price*quantity;
		}
		if(amount < 1000)
		{
			amount -= amount*0.05f;
			System.out.println("Your bill amonunt after discount is: "+amount);
		}
		else
		{
			amount -= amount*0.10f;
			System.out.println("Your bill amonunt after discount is: "+amount);
		}
	}
}
