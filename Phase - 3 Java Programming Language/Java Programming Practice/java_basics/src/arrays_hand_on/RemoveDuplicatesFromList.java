package arrays_hand_on;

import java.util.*;

public class RemoveDuplicatesFromList {
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
		
		int newLength = 0;
		int[] newArr = new int[n];
		
		for(int i=0; i<n; i++)
		{
			boolean isPresent = false;
			
			for(int j=0; j<newLength; j++)
			{
				if(newArr[j] == arr[i]) isPresent = true;
			}
			
			if(!isPresent)
			{
				newArr[newLength++] = arr[i];
			}
		}
		
		for(int i = 0; i < newLength; i++)
		{
			System.out.print(newArr[i]+" ");
		}
	}
}
