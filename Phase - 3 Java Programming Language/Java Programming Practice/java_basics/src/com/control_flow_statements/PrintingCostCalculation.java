package com.control_flow_statements;

import java.util.*;

/*
 * Level: Medium
 * 3. Write a program to calculate bill of a job work done as follows by using if-else
 * statement.
 * a. Rate of typing 3 Rs. per page
 * b. Printing of 1s copy Rs. per page and later every copy 3 Rs. per page.
*/

public class PrintingCostCalculation {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of pages: ");
		int numberOfPages = sc.nextInt();
		System.out.print("Enter number of copies: ");
		int numberOfCopies = sc.nextInt();
		int costOfTyping = numberOfPages*3;
		int costOfPrinting = numberOfPages + numberOfPages*(numberOfCopies-1)*3;
		System.out.println("The total cost of the job work done is: "+(costOfPrinting+costOfTyping));
	}
}
