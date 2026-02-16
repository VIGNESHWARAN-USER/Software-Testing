package com.control_flow_statements;

import java.util.*;

/*
 * Level: Medium
 * 8. Accepts a string and calculate the number of digits and letters.
 * Sample I/O:
 * Enter String: India became independent in 1947
 * Output:
 * Letters: 24, Digits: 4, Other Symbols: 4
*/

public class NumberOfDigitsAndLetters {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sentence: ");
		String sentence = sc.nextLine();
		int letters = 0, number = 0, specialSymbols = 0;
		for(char val: sentence.toCharArray())
		{
			if(val >= 65 && val <= 92 || val >= 97 && val <= 124)
			{
				letters++;
			}
			else if(val >= 48 && val <= 58)
			{
				number++;
			}
			else
			{
				specialSymbols++;
			}
		}
		System.out.println("Letters: "+letters+", Digits: "+number+", Other Symbols: "+specialSymbols);
	}
}
