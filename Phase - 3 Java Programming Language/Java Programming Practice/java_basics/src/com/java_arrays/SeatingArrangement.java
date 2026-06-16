package com.java_arrays;

public class SeatingArrangement {

	public static void main(String args[])
	{
		char seats[][] = {{'A', 'A', 'A', 'B', 'B'}, {'B', 'A', 'B', 'A', 'A'}, 
						 {'A', 'B', 'A', 'A', 'B'}, {'B', 'A', 'B', 'A', 'A'}};
		int vipSeats = 0, premiumSeats = 0, regularSeats = 0;
		for(int i=0; i<seats.length; i++)
		{
			for(int j=0; j<seats[i].length; j++)
			{
				if(i == 0)
				{
					if(seats[i][j] == 'A') vipSeats++;
				}
				else if(i == 1 || i == 2)
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
		System.out.println("VIP Seats :         "+vipSeats+"           "+(5-vipSeats)+"         "+5);
		System.out.println("Premium Seats :     "+premiumSeats+"           "+(10-premiumSeats)+"        "+10);
		System.out.println("Regular Seats :     "+regularSeats+"           "+(5-regularSeats)+"         "+5);
	}
}
