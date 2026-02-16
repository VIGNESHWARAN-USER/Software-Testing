package com.control_flow_statements;

import java.util.Scanner;

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
