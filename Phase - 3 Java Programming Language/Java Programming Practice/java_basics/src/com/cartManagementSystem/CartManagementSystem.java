package com.cartManagementSystem;

import java.util.Scanner;

public class CartManagementSystem {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Cart cart = new Cart();
		System.out.println("Cart Management System."
				+ "\n1. Add Product"
				+ "\n2. Remove Product"
				+ "\n3. Calculate Cart Amount"
				+ "\n4. Display Cart Items"
				+ "\n5. Exit");
		while(true)
		{
			System.out.print("Enter your choice: ");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1:
					sc.nextLine();
					System.out.print("Enter product name: ");
					String productName = sc.nextLine();
					System.out.print("Enter product price: ");
					double price = sc.nextDouble();
					System.out.print("Enter product quantity: ");
					int quantity = sc.nextInt();
					Product product = new Product(productName, price, quantity);
					cart.addProduct(product);
					break;
				case 2:
					System.out.print("Enter product ID: ");
					int productID = sc.nextInt();
					cart.removeProduct(productID);
					break;
				case 3:
					System.out.println("The cart amount is: "+cart.calculateCartTotal());
					break;
				case 4:
					cart.displayCartItems();
					break;
				case 5:
					System.out.println("Thank You!");
					return;
				default:
					System.out.println("Invalid Input. Try Again...");
			}
		}
	}
}
