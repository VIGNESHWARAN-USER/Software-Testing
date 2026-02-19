package arrays_hand_on;

import java.util.*;

public class DuplicateAndUniqueCount {
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
		boolean[] checked = new boolean[n];
		int duplicate = 0, unique = n;
		
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
				if(count != 1)
				{
					duplicate++;
					unique -= count;
				}
			}
		}
		System.out.println("Number of unique elements in the Array: "+unique);
		System.out.println("Number of duplicate elements in the Array: "+duplicate);
	}
}
