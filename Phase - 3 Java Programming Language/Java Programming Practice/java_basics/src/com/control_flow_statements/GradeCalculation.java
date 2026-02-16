package com.control_flow_statements;

import java.util.*;

public class GradeCalculation {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float sum = 0, exersice = 0, exam = 0;
		int n = 0;
		while(true)
		{
			System.out.print("Enter the excersise grade of student "+(n+1)+": ");
			exersice = sc.nextFloat();
			System.out.print("Enter the exam grade of student "+(n+1)+": ");
			exam = sc.nextFloat();
			if(exersice < 0 && exam < 0) break;
			if(exersice >= 0 && exersice <=10 && exam >= 0 && exam <= 10)
			{
				float finalGrade = exersice*0.3f + exam*0.7f;
				System.out.println("Your final grade of student "+(n+1)+": "+finalGrade+"\n");
				sum += finalGrade;
				n++;
			}
		}
		System.out.println("The average grade for all the students is: "+(sum/n));
	}
}
