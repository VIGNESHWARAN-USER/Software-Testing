package com;

import java.util.*;

public class AssertionExample {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value : ");
		int val = sc.nextInt();
		
		assert val > 0 : "Invalid Input";
		
		System.out.println("The given value is : "+val);
		
	}
}
