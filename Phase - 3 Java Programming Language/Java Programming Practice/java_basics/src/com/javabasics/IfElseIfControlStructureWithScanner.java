package com.javabasics;

import java.util.Scanner;

public class IfElseIfControlStructureWithScanner {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Types of Seats Available\n1. REGULAR\n2. PREMIUM\n3. EXECUTIVE\n4. VIP\nSelect the option: ");
		String seatType = sc.next();
		if(seatType.equals("REGULAR"))
		{
			System.out.println("You have selected REGULAR and seat cost is 80.");
		}
		else if(seatType.equals("PREMIUM"))
		{
			System.out.println("You have selected PREMIUM and seat cost is 120.");
		}
		else if(seatType.equals("EXECUTIVE"))
		{
			System.out.println("You have selected EXECUTIVE and seat cost is 150.");
		}
		else if(seatType.equals("VIP"))
		{
			System.out.println("You have selected VIP and seat cost is 200.");
		}
		else 
		{
			System.out.println("You have not selected any type.");
		}
	}
}
