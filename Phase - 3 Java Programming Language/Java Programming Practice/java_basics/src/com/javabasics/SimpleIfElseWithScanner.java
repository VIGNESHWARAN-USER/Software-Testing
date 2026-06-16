package com.javabasics;

import java.util.*;

public class SimpleIfElseWithScanner {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		boolean seatAvailable = false;
		System.out.print("Enter the seat number: ");
		String seatNo = sc.next();
		if(seatAvailable)
		{
			System.out.println("Your seat "+seatNo+" has been booked successfully");
		}
		else
		{
			System.out.println("Sorry, the given seat is not available");			
		}
	}
}
