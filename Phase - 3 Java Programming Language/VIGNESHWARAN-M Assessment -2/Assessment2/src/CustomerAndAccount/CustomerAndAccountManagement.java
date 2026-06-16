package CustomerAndAccount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CustomerAndAccountManagement {
	public static Account account;
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader bf = new BufferedReader(new FileReader("src/CustomerAndAccount/input.txt"));
		
		String[] accountDetails = bf.readLine().split(" ");
		
		System.out.print("Enter account id: ");
		int account_ID = Integer.parseInt(accountDetails[0]);
		System.out.println(account_ID);
		System.out.print("Enter customer id: ");
		int customer_ID = Integer.parseInt(accountDetails[1]);
		System.out.println(customer_ID);
		System.out.print("Enter customer name: ");
		String name = accountDetails[2];
		System.out.println(name);
		System.out.println("Enter customer gender: ");
		char gender = accountDetails[3].charAt(0);
		System.out.println(gender);
		System.out.print("Enter account balance: ");
		double balance = Double.parseDouble(accountDetails[4]);
		System.out.println(balance);
		
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
			String[] array = bf.readLine().split(" ");
			choice = Integer.parseInt(array[0]);
			if(choice == -1) break;
			
			switch(choice)
			{
				case 1:
					System.out.print("Enter the amount to withdraw: ");
					double amount = Integer.parseInt(array[1]);
					System.out.println(amount);
					account.withdraw(amount);
					break;
				case 2:
					System.out.print("Enter the amount to deposit: ");
					amount = Integer.parseInt(array[1]);
					System.out.println(amount);
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
