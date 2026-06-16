package arrays_hand_on;

import java.util.*;

public class FrequencyOfElements {
	
	public static void printFrequency(int[] arr, int n)
	{
		boolean[] checked = new boolean[n];
				
		Arrays.fill(checked, false);
		
		for(int i=0; i<n; i++)
		{
			if(!checked[i])
			{
				int count = 0;
				checked[i] = true;
				for(int j=i; j<n; j++)
				{
					if(arr[i] == arr[j])
					{
						count++;
						checked[j] = true;
					}
				}
				System.out.println(arr[i]+" - "+count);
			}
		}
	}
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
		printFrequency(arr, n);
	}
}
