package exceptionhandling;

import java.util.Scanner;

class InvalidUsernameException extends Exception
{
	public InvalidUsernameException(String msg)
	{
		super(msg);
	}
}

class InvalidPasswordException extends Exception
{
	public InvalidPasswordException(String msg)
	{
		super(msg);
	}
}

public class UsernameAndPassword {
	
	public static void validateUsername(String name) throws InvalidUsernameException
	{
		if(name.length() < 6 && name.length() > 30) throw new InvalidUsernameException("Invalid username");
	}
	
	public static void validatePassword(String password) throws InvalidPasswordException
	{
		
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter username : ");
		String name = sc.nextLine();
		
		System.out.print("Enter password : ");
		String password = sc.next();
		
		try
		{
			validateUsername(name);
			validatePassword(password);
		}
		catch(InvalidUsernameException e)
		{
			System.out.println("Error : "+e.getMessage());
		}
		catch(InvalidPasswordException e)
		{
			System.out.println("Error : "+e.getMessage());
		}
	}
}
