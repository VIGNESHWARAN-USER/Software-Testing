package com.control_flow_statements;

import java.util.*;

public class PerfectFactorial {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int ans = 2;
		while(num > 1)
		{
			if(num%ans != 0)
			{
				System.out.println("Sorry. The given number is not a perfect factorial");
				return;
			}
			num/=ans;
			ans++;
		}
		System.out.println(ans-1);
	}
}
