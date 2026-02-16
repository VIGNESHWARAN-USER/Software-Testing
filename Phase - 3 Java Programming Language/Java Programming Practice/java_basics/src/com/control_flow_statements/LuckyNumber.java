package com.control_flow_statements;

import java.util.*;

/*
 * Level: Hard
 * Ana planned to choose the four digit lucky number for her car. Her lucky numbers are 3,
 * 5 and 7. Help her to find the number, whose sum is divisible by 3 or 5 or 7. Provide a
 * valid car number, Fails to provide a valid input then display that number is not a valid
 * car number.
 * Sample Input 1:
 * Enter the car no: 1234
 * Sample Output 1:
 * Lucky Number
 * Sample Input 2:
 * Enter the car no: 1214
 * Sample Output 2:
 * Sorry it’s not my lucky number
 * Sample Input 3:
 * Enter the car no: 14
 * Sample Output 3:
 * 14 is not a valid car number
*/

public class LuckyNumber {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the car number: ");
		int n = sc.nextInt();
		if(n >= 1000 && n <= 9999)
		{
			int sum = SumOfDigits.sumOfDigits(n);
			if(sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0)
			{
				System.out.println("Lucky Number.");
			}
			else
			{
				System.out.println("Sorry it’s not my lucky number");
			}
		}
		else
		{
			System.out.println(n+" is not a valid car number");
		}
	}
}
