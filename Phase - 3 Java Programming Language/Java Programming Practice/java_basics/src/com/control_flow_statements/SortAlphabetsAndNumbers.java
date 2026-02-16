package com.control_flow_statements;

import java.util.Scanner;

/*
 * Level: Hard
 * 1. Numbers and Alphabets has equivalent ASCII values i.e Numbers (0 to 9) equivalent
 * ASCII value is 48 to 57, uppercase alphabet (A to Z) equivalent ASCII value is 65 to 90
 * and lowercase alphabet (a to z) equivalent ASCII value is 97 to 120. Write a program to
 * sort numbers 0 to 9, alphabets in upper and lowercase using equivalent ASCII values.
*/

public class SortAlphabetsAndNumbers {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value: ");
		String val = sc.next();
		char[] charArray = val.toCharArray();
		for(int i=1; i<charArray.length; i++)
		{
			int j = i-1;
			char temp = charArray[i];
			while(j>=0 && temp < charArray[j])
			{
				charArray[j+1] = charArray[j];
				j--;
			}
			charArray[j+1] = temp;
		}
		System.out.println("The sorted string is: ");
		for(char i: charArray)
		{
			System.out.print(i);
		}
	}
}
