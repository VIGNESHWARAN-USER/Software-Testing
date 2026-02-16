package com.control_flow_statements;

import java.util.*;

/*
 * Level: Medium
 * 4. Write a program to calculate bill for Internet browsing. The conditions are:
 * a. 1 hr 50 Rs.
 * b. 1min 1 Re.
 * c. 5 hrs 200 Rs.
 * d. User can only browse maximum 7 hrs
*/

public class InternetBrowsingBill {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the hours: ");
		int hours = sc.nextInt();
		System.out.print("Enetr the minutes: ");
		int minutes = sc.nextInt();
		if(hours > 7)
		{
			System.out.println("User can only browse maximum 7 hrs.");
		}
		else if(hours >= 5)
		{
			int amount = 200 + ((hours-5)*50) + minutes;
			System.out.println("Your amount for the internet browsing is: "+amount);
		}
		else
		{
			int amount = hours*50 + minutes;
			System.out.println("Your amount for the internet browsing is: "+amount);
		}
	}
}
