package com.accountManagementSystem;

import java.util.*;

public class AccountManagement {
	int id = 0;
	static ArrayList<Account> accounts = new ArrayList<>();
	
	public static int findAccount(String id)
	{
		for(int i=0; i<accounts.size(); i++)
		{
			if(accounts.get(i).getId().equals(id)) return i;
		}
		return -1;
	}
	
	public String accountCreation(String name, int balance)
	{
		id++;
		Account account = new Account("ACC"+id, name, balance);
		accounts.add(account);
		return "Account created successfully";
	}
	
	public void creditOperation(String id, int amount)
	{
		int index = findAccount(id);
		if(index == -1) 
		{
			System.out.println("Account not exist");
			return;
		}
		int newBalance = accounts.get(index).credit(amount);
		if(newBalance != 0)
		{
			System.out.println("Amount credited successfully");
			System.out.println("The updated balance is; "+newBalance);
		}
	}
	
	public void debitOperation(String id, int amount)
	{
		int index = findAccount(id);
		if(index == -1) 
		{
			System.out.println("Account not exist");
			return;
		}
		int newBalance = accounts.get(index).debit(amount);
		if(newBalance != 0)
		{
			System.out.println("Amount debited successfully");
			System.out.println("The updated balance is; "+newBalance);
		}
	}
	
	public void fundTransfer(String id, String receiverId, int amount)
	{
		int senderIndex = findAccount(id);
		if(senderIndex == -1) 
		{
			System.out.println("Account not exist");
			return;
		}
		int receiverIndex = findAccount(id);
		if(receiverIndex == -1) 
		{
			System.out.println("Account not exist");
			return;
		}
		int newBalance = accounts.get(senderIndex).transferTo(accounts.get(receiverIndex), amount);
		if(newBalance != 0)
		{
			System.out.println("Amount transfered successfully");
			System.out.println("The updated balance is: "+newBalance);
		}
	}
	
	public void accoutDisplay()
	{
		if(accounts.size() == 0)
		{
			System.out.println("The accounts list is empty");
			return;
		}
		System.out.println("------ Accounts ------");
		
		for(Account account: accounts)
		{
			System.out.println(account.toString());
			System.out.println();
		}
	}
	
}
