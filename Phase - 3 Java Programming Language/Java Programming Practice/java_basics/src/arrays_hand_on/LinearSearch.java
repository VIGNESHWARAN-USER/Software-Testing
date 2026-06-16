package arrays_hand_on;

import java.util.*;

public class LinearSearch {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements in the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter elements for the array:");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the target element: ");
		int target = sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			if(arr[i] == target)
			{
				System.out.println("The target element is found on index: "+i);
			}
		}
		System.out.println("The target element is not found in the Array");
	}
}
