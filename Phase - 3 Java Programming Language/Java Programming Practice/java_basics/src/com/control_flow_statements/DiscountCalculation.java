package com.control_flow_statements;

import java.util.Scanner;

/*
 * Level: Medium
 * Mark is purchasing certain glossary items in a supermarket. While purchasing certain items,
 * a discount of 15% is offered to him if the quantity purchased is more than 500. Help, Mark
 * to calculate the total expenses. 
*/

public class DiscountCalculation {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount: ");
		float purchaseAmount = sc.nextFloat();
		if(purchaseAmount > 500)
		{
			float discount = purchaseAmount*0.15f;
			System.out.println("Your bill amount after discount is: "+(purchaseAmount-discount));
		}
		else
		{
			System.out.println("Your bill amount after discount is: "+purchaseAmount);
		}
	}
}
