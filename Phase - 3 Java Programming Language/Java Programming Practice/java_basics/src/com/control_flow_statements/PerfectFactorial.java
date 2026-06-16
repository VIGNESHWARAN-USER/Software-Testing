package com.control_flow_statements;

import java.util.*;

/*
 * Level: Hard
 * Sam teaches his student to find the factorial of a number. He wanted to test the
 * understanding of the student. For that, he provides a number. He wants the students
 * to tell him that number is a factorial of which number. Help the student by writing a
 * program to do this.
 * Note that the input should be a number greater than zero. If the input is less than or
 * equal to zero, the output should be “Invalid Input”. Also, if the input provided is not
 * exactly the factorial of a number, say, the input provided is 122, which is not a perfect
 * factorial of a number; it should return “Sorry. The given number is not a perfect
 * factorial”.
 * Sample Input 1:
 * 5040
 * Sample Output 1:
 * 7
 * Sample Input 2:
 * 0
 * Sample Output 2:
 * Invalid Input
 * Sample Input 3:
 * 700
 * Sample Output 3:
 * Sorry. The given number is not a perfect factorial
*/

public class PerfectFactorial {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int ans = 2;
		if(num < 1) 
		{
			System.out.println("Invalid Input.");
			return;
		}
		while(num > 1)
		{
			if(num%ans != 0)
			{
				System.out.println("Sorry. The given number is not a perfect factorial");
				return;
			}
			num/=ans;
			ans++;
		}
		System.out.println(ans-1);
	}
}
