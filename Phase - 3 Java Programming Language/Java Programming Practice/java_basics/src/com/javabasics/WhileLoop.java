package com.javabasics;

public class WhileLoop {
	public static void main(String args[])
	{
		int seatCount = 1, maxSeatCount = 10;
		while(seatCount <= maxSeatCount)
		{
			System.out.println("Count is : "+seatCount);
			seatCount++;
		}
		System.out.println("Seats are filled");
	}
}
