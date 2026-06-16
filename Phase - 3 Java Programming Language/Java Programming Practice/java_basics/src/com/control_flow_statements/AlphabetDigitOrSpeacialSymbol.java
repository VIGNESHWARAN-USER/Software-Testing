package com.control_flow_statements;

import java.util.Scanner;

/*
 * Level: Easy
 * 8. Write a program to check whether the given Character is an Alphabet/ Digit /Special
 * Symbol using if-else-if statement.
*/

public class AlphabetDigitOrSpeacialSymbol {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char val = sc.next().charAt(0);
		if(val >= 65 && val <= 90 || val >= 97 && val <= 122)
		{
			System.out.println("The entered character is alphabet.");
		}
		else if(val >= 48 && val <= 57)
		{
			System.out.println("The entered character is number.");
		}
		else
		{
			System.out.println("The entered character is special symbol.");
		}
	}
}
