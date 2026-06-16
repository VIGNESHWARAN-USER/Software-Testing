package com.javabasics;

import java.util.Scanner;

public class NestedIfControlStructureWithScanner {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String username = "Vignesh", password = "1234", usernameEntered, passwordEntered;
		System.out.print("Enter the username: ");
		usernameEntered = sc.next();
		if(username.equals(usernameEntered))
		{
			System.out.print("Enter the password: ");
			passwordEntered = sc.next();
			if(password.equals(passwordEntered))
			{
				System.out.println("User Login successfull");
			}
			else
			{
				System.out.println("Incorrect Password");
			}
		}
		else
		{
			System.out.println("Incorrect username");
		}
	}
}
