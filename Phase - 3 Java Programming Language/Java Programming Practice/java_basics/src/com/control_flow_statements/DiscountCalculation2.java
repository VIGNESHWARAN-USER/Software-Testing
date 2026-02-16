package com.control_flow_statements;

import java.util.Scanner;

/*
 * Level: Hard
 * A cloth showroom has announced the following festival discounts on the purchase of
 * items based on the total cost of the items purchased:
 * Total Cost Discount Rate
 * Less than Rs. 2000 5%
 * Rs. 2000 to less than Rs. 5000 25%
 * Rs. 5000 to less than Rs. 10,000 35%
 * Rs. 10,000 and above 50%
 * Write a program to input the total cost and to compute and display the amount to be
 * paid by the customer availing the discount.
 * Sample Input 1:
 * 4500
 * Sample Output 1:
 * 3375.0
 * Sample Input 2:
 * 6800
 * Sample Output 2:
 * 4420.0
*/

public class DiscountCalculation2 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the total cost: ");
		float purchaseAmount = sc.nextFloat();
		float discount;
		if(purchaseAmount < 2000)
		{
			discount = purchaseAmount*0.05f;
		}
		else if(purchaseAmount < 5000)
		{
			discount = purchaseAmount*0.25f;
		}
		else if(purchaseAmount < 10000)
		{
			discount = purchaseAmount*0.35f;
		}
		else
		{
			discount = purchaseAmount*0.50f;	
		}
		System.out.println("Your bill amount after discount is: "+(purchaseAmount-discount));
	}
}
