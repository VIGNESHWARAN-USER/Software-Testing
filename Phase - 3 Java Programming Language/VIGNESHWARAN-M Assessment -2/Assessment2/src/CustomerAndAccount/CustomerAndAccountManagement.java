package CustomerAndAccount;

import java.util.*;

public class CustomerAndAccountManagement {
	public static Account account;
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account id: ");
		int account_ID = sc.nextInt();
		System.out.print("Enter customer id: ");
		int customer_ID = sc.nextInt();
		System.out.print("Enter customer name: ");
		String name = sc.next();
		System.out.println("Enter customer gender: ");
		char gender = sc.next().charAt(0);
		System.out.print("Enter account balance: ");
		double balance = sc.nextDouble();
		
		account = new Account(account_ID, new Customer(customer_ID, name, gender), balance);
		
		System.out.println("PLEASE SELECT ONE OPTION FROM BELOW"
				+ "\n1. WITHDRAW"
				+ "\n2. DEPOSIT"
				+ "\n3. CHECK BALANCE"
				+ "\n4. EXIT ");
		
		while(true)
		{
			int choice = 0;
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.print("Enter the amount to withdraw: ");
					double amount = sc.nextDouble();
					account.withdraw(amount);
					break;
				case 2:
					System.out.print("Enter the amount to deposit: ");
					amount = sc.nextDouble();
					account.deposit(amount);
					break;
				case 3: 
					System.out.println("Your Current balance: "+account.getBalance());
					break;
				case 4:
					System.out.println("THANK YOU FOR BANKING WITH US!!");
					return;
				default:
					System.out.println("Invalid Input.Try again...");
			}
		}
	}
}
