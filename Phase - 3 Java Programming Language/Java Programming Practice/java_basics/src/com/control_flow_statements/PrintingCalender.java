package com.control_flow_statements;

import java.util.*;

public class PrintingCalender {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter month number: ");
		int monthNumber = sc.nextInt();
		if(monthNumber >= 1 && monthNumber <= 12)
		{
			System.out.print("Enter the day number: ");
			int dayNumber = sc.nextInt();
			if(dayNumber >= 1 && dayNumber <= 7)
			{
				int numberOfDays;
				if(monthNumber == 2)
				{
					System.out.print("Enter number of Days: ");
					numberOfDays = sc.nextInt();
				}
				else
				{
					switch(monthNumber)
					{
						case 1, 3, 5, 7, 8, 10, 12:
							numberOfDays = 31;
							break;
						default:
							numberOfDays = 30;
					}
				}
				System.out.println("MON TUE WED THU FRI SAT SUN");
				int daysCount = 0;
				for(int i=0; i<dayNumber-1;i++)
				{
					daysCount++;
					System.out.print("    ");
				}
				int i=1;
				while(i <= numberOfDays)
				{
					if(i < 10)
					{
						System.out.print("0"+i+"  ");
					}
					else
					{
						System.out.print(i+"  ");
					}
					i++;
					daysCount++;
					if(daysCount%7 == 0) 
					{
						System.out.println();
					}
				}
			}
		}
	}
}
