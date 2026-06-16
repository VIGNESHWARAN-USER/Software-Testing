package arrays_hand_on;

import java.util.*;

public class SortArray {
	
	public static void sortArray(int[] arr, int n)
	{
		for(int i=1; i<n; i++)
		{
			int j = i-1;
			int temp = arr[i];
			while(j >= 0 && temp < arr[j])
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the Array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter the elements of the array.");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		sortArray(arr, n);
		System.out.println("Array after sorting.");
		for(int i: arr)
		{
			System.out.print(i+" ");
		}
	}
}
