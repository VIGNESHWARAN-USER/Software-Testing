package com.java_arrays;

import java.util.*;
public class JaggedArray {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char seats[][] = new char[3][];
		for(int i=0; i<3; i++)
		{
			System.out.print("Enter the number of seats in row "+ (i+1)+ ": ");
			int num = sc.nextInt();
			seats[i]  = new char[num];
			System.out.println("Enter the seat values:");
			for(int j=0; j<num; j++)
			{
				seats[i][j] = sc.next().charAt(0);
			}
		}
		int vipSeats = 0, premiumSeats = 0, regularSeats = 0;
		for(int i=0; i<seats.length; i++)
		{
			for(int j=0; j<seats[i].length; j++)
			{
				if(i == 0)
				{
					if(seats[i][j] == 'A') vipSeats++;
				}
				else if(i == 1)
				{
					if(seats[i][j] == 'A') premiumSeats++;
				}
				else
				{
					if(seats[i][j] == 'A') regularSeats++;
				}
			}
		}
		System.out.println("                 Available    Booked    Total");
		System.out.println("VIP Seats :         "+vipSeats+"           "+(4-vipSeats)+"         "+4);
		System.out.println("Premium Seats :     "+premiumSeats+"           "+(10-premiumSeats)+"        "+10);
		System.out.println("Regular Seats :     "+regularSeats+"           "+(3-regularSeats)+"         "+3);
	}
}
