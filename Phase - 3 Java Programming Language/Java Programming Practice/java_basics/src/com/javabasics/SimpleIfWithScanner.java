package com.javabasics;

import java.util.Scanner;

public class SimpleIfWithScanner {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		boolean isSeatAvailable = true;
		System.out.print("Enter the seat number: ");
		String seatNo = sc.next();
		if(isSeatAvailable)
		{
			System.out.println("Your seat "+seatNo+" has been successfully booked");
		}
	}
}
