package com.control_flow_statements;

import java.util.*;

public class PrintingHello {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int val, sum = 0;
		while(true)
		{
			System.out.print("Enter the number: ");
			val = sc.nextInt();
			if(val < 0)
			{
				break;
			}
			sum += val;
			for(int i=0; i<val; i++)
			{
				System.out.print("Hello ");
			}
			System.out.println();
		}
		System.out.println("The number of times the Hello printed is: "+sum);
	}
}
