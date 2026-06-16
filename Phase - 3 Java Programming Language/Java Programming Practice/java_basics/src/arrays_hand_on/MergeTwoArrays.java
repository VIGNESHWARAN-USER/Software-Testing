package arrays_hand_on;

import java.util.Scanner;

public class MergeTwoArrays {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the Array 1: ");
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		
		System.out.println("Enter the elements of the array 1.");
		for(int i=0; i<n; i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		System.out.print("Enter the size of the Array 2: ");
		int m = sc.nextInt();
		int[] arr2 = new int[m];
		
		System.out.println("Enter the elements of the array 2.");
		for(int i=0; i<m; i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		int sum = n+m;
		int arr[] = new int[sum];
		int i = 0;
		for(int x: arr1)
		{
			arr[i++] = x;
		}
		for(int x: arr2)
		{
			arr[i++] = x;
		}
		
		System.out.println("Array after merging.");
		for(int x: arr)
		{
			System.out.print(x+" ");
		}
	}
}
