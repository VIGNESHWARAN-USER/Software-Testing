package com.control_flow_statements;

import java.util.Scanner;

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
