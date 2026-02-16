package com.control_flow_statements;

import java.util.*;

public class NumberPattern {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int val = sc.nextInt();
		for(int i=1; i<=val; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
