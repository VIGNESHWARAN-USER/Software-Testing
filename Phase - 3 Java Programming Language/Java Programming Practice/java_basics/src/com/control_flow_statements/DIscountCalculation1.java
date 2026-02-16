package com.control_flow_statements;

import java.util.*;
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
