package com.control_flow_statements;

import java.util.*;


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
