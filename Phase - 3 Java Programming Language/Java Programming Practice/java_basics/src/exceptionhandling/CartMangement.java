package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CartMangement {
	
	public static void validatePartDetails(int partNumber, String partDescription, int quantity, int pricePerItem) throws InputMismatchException
	{
		if(partNumber == 0) 
			throw new InputMismatchException("The part number is 0");
		
		if(partDescription == null) 
			throw new InputMismatchException("The part description is null");
		
		if(quantity == 0) 
			throw new InputMismatchException("The quantity is 0");
		
		if(pricePerItem == 0) 
			throw new InputMismatchException("The price per item is 0");
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter part number : ");
		int partNumber = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter part description : ");
		String partDescription = sc.nextLine();
		
		System.out.print("Enter part quantity : ");
		int quantity = sc.nextInt();
		
		System.out.print("Enter price per item : ");
		int pricePerItem = sc.nextInt();
		
		
		try {
			validatePartDetails(partNumber, partDescription, quantity, pricePerItem);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Error: "+e.getMessage());
		}
	}
}
