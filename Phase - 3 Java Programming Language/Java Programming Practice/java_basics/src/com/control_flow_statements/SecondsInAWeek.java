package com.control_flow_statements;

/*
 * Level: Medium
 * 1. Keeping in mind there are 86400 seconds per day, write a program that calculates how
 * many seconds there are in a week if a week is 7 days.
*/

public class SecondsInAWeek {
	public static void main(String args[])
	{
		int secondsPerDay = 86400;
		int numberOfDays = 7;
		int secondsPerWeek = secondsPerDay * numberOfDays;
		System.out.println("Seconds per week of seven days is: "+secondsPerWeek+" seconds.");
	}
}
