package java_fundamentals_assessment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class PerfectNumber {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader bf = new BufferedReader(new FileReader("src/java_fundamentals_assessment/PerfectNumber.txt"));
		
		System.out.print("Enter the number: ");
		int val = Integer.parseInt(bf.readLine());
		int sum = 0;
		for(int i=1; i<val; i++)
		{
			if(val%i == 0) sum+=i;
		}
		if(sum == val)
		{
			System.out.println("The given number is perfect");
		}
		else
		{
			System.out.println("The given number is not perfect");
		}
	}
}
