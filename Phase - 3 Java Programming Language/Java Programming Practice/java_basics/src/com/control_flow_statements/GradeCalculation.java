package com.control_flow_statements;

import java.util.*;

/*
 * Level: Hard
 * 2. The final grade of a student in a course is calculated as 30% of the exercise’s grade and
 * as 70% of the exam’s grade, only if both grades are greater than or equal to 5;
 * otherwise, the final grade will be their minimum. Write a program that reads
 * continuously pairs of grades (exercises and exam grades) and displays the final grade
 * for each student, until the user enters a pair of grades containing the value −1. Before it
 * ends, the program should display the average grade of all students in the course. The
 * program should check that all given grades belong in [0,10].
*/

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
