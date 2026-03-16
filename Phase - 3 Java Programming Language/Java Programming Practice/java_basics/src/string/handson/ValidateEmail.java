package string.handson;

import java.util.Scanner;

public class ValidateEmail {
	
	public static boolean checkEmail(String mail)
	{
		if(mail == null || mail.length() == 0) return false;
		
		if(mail.startsWith(".") || mail.endsWith(".")) return false;
		
		if(mail.contains("..")) return false;
		
		if(mail.charAt(0) <= '9' && mail.charAt(0) >= '0') return false;
		
		if(!mail.matches("[A-Za-z]+@[A-Za-z]+.com")) return false;
		
		return true;
		
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String email = sc.next();
		
		if(checkEmail(email))
		{
			System.out.println("The email is valid");
		}
		else
		{
			System.out.println("The email is invalid");
		}
	}
}
