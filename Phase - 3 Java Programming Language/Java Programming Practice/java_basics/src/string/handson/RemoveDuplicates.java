package string.handson;

import java.util.*;

public class RemoveDuplicates {
	
	public static String removeDuplicates(String s)
	{
		boolean[] checked = new boolean[255];
		
		char[] arr = s.toCharArray();
		
		String ans = new String("");
		
		for(char i: arr)
		{
			if(!ans.contains(Character.toString(i)))
			{
				ans = ans + i;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String: ");
		String val = sc.nextLine();
		
		System.out.println("The String after removing the duplicates : "+removeDuplicates(val));
	}

}
