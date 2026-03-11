package string.handson;

import java.util.*;

public class Encryption {
	
	public static String encrypt(String val)
	{
		StringBuilder ans = new StringBuilder("");
		
		char[] arr = val.toCharArray();
		
		for(char i: arr)
		{
			if(i == ' ') ans.append("_");
			else if(i >= 65 && i < 91)
			{
				int temp = i+3;
				if(temp >= 91)
					ans.append((char)(temp-26));
				else
					ans.append((char)(temp));
			}
			else if(i >= 97 && i <= 122)
			{
				int temp = i+3;
				if(temp > 122)
					ans.append((char)(temp-26));
				else
					ans.append((char)(temp));
			}
			else ans.append(i);
		}
		
		return ans.toString();
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String: ");
		String val = sc.nextLine();
		
		System.out.println("The encrypted string is : " + encrypt(val));
	}
}
