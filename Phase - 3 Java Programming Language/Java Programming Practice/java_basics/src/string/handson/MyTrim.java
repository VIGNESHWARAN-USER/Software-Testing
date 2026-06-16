package string.handson;

import java.util.Scanner;

public class MyTrim {
	
	public static String myTrim(String val)
	{	
		
		int l = 0, r = val.length();
		
		while(l < r && val.charAt(l++) == ' ');
		while(r > l && val.charAt(--r) == ' ');
		
		
		return val.substring(l-1, r+1);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String: ");
		String val = sc.nextLine();
		
		System.out.println("The String after trim is : "+myTrim(val));
	}
}
