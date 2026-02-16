package com.control_flow_statements;

import java.util.*;

/*
 * Level: Medium
 * To check whether the given number is Armstrong number or not.
 * Note: Armstrong number is 3 digit number, the sum of cubes of each digit is equal to
 * the number itself.
*/


public class ArmstrongNumber {
	
	public static boolean isArmstrongNumber(int num)
	{
		int sum = (int) Math.log10(num)+1;
		int ans = 0, tempNum = num;
		while(tempNum > 0)
		{
			ans += Math.pow(tempNum%10, sum);
			tempNum/=10;
		}
		return ans == num;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		if(isArmstrongNumber(num)) {
			System.out.println("The given number is armstrong number.");
		}
		else
		{
			System.out.println("The given number is not armstrong number.");
		}
	}
}
