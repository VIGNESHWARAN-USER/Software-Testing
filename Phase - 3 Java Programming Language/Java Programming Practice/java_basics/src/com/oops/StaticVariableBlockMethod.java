package com.oops;

class TheatreScreen{
	static int totalSeats;
	
	static {
		System.out.println("Static block 1");
		totalSeats = 20;
	}
	
	static {
		System.out.println("Static block 2");
		totalSeats = 50;
	}
	
	public void bookTicket(int count)
	{
		totalSeats -= count;
	}
	
	public static void getAvailableSeats()
	{
		System.out.println(totalSeats);
	}
}

public class StaticVariableBlockMethod {
	public static void main(String args[])
	{
		System.out.println("Available seats: "+TheatreScreen.totalSeats);
		System.out.println("Creating object and Booking 5 tickets");
		TheatreScreen ts = new TheatreScreen();
		ts.bookTicket(5);
		
	}
}
