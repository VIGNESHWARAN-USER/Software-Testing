package com.control_flow_statements;

import java.util.*;

/* 
* Level: Easy
* Question: 3. Use switch case structure to print the appropriate message to recognize the entered
*              character is vowel, consonant or symbol. 
*/

public class SwitchAlphabetDigitOrSpeacialSymbol {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char val = sc.next().charAt(0);
		switch(val)
		{
			case 'a', 'e', 'i', 'o', 'u':
				System.out.println("The given charater is vowel.");
			default:
				if(val >= 'a' && val <= 'z')
				{
					System.out.println("The given character is consonant.");
				}
				else
				{
					System.out.println("The given character is a speacial symbol.");
				}
		}
	}
}
