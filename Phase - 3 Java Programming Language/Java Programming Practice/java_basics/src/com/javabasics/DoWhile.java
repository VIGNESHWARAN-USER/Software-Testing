package com.javabasics;

public class DoWhile {
	public static void main(String args[])
	{
		int seatCount = 1, maxSeatCount = 10;
		do
		{
			System.out.println("Count is : "+seatCount);
			seatCount++;
		}while(seatCount <= maxSeatCount);
		System.out.println("Seats are filled");
	}
}
