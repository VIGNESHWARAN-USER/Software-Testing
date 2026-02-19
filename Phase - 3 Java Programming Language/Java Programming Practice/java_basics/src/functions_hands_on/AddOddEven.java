package functions_hands_on;

import java.util.*;

public class AddOddEven {
	
	public static void printOddEvenSum(int[] arr, int n)
	{
		int oddSum = 0, evenSum = 0;
		for(int i: arr)
		{
			if(i%2 == 0) evenSum += i;
			else oddSum += i;
		}
		System.out.println("The Odd Sum of the array is: "+oddSum);
		System.out.println("The Even Sum of the array is: "+evenSum);
		
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of the array.");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		printOddEvenSum(arr, n);
	}
}
