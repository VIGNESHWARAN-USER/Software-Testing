package com.accountManagementSystem;

import java.util.Scanner;

public class AccountManagementSystem {
	public static void main(String args[])
	{
		AccountManagement am = new AccountManagement();
		Scanner sc = new Scanner(System.in);
		System.out.println("Account Management System."
				+ "\n1. Account Creation"
				+ "\n2. Credit Operation"
				+ "\n3. Debit Operation"
				+ "\n4. Fund Transfer"
				+ "\n5. Account Display"
				+ "\n6. Exit");
		while(true)
		{
			System.out.print("Enter your choice: ");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.print("Enter your name: ");
					String name = sc.next();
					System.out.print("Enter the amount to credit: ");
					int balance = sc.nextInt();
					am.accountCreation(name, balance);
					break;
				case 2:
					System.out.print("Enter your ID: ");
					String id = sc.next();
					System.out.print("Enter the amount to credit: ");
					int amount = sc.nextInt();
					am.creditOperation(id, amount);
					break;
				case 3:
					System.out.print("Enter your ID: ");
					id = sc.next();
					System.out.print("Enter the amount to debit: ");
					amount = sc.nextInt();
					am.debitOperation(id, amount);
					break;
				case 4:
					System.out.print("Enter your ID: ");
					String senderId = sc.next();
					System.out.print("Enter receiver ID: ");
					String receiverId = sc.next();
					System.out.print("Enter the amount to transfer: ");
					amount = sc.nextInt();
					am.fundTransfer(senderId, receiverId, amount);
					break;
				case 5:
					am.accoutDisplay();
					break;
				case 6:
					System.out.println("Thank You!");
					return;
				default:
					System.out.println("Invalid Input. Try Again...");
			}
		}
	}
}
