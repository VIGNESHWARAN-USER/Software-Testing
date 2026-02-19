package com.accountManagementSystem;

public class Account {
	private String id;
	private String name;
	private int balance;
	
	public Account(String id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public Account(String id, String name, int balance)
	{
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public String getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getBalance()
	{
		return balance;
	}
	
	public int credit(int amount)
	{
		balance += amount;
		return balance;
	}
	
	public int debit(int amount)
	{
		if(balance < amount)
		{
			System.out.println("Amount exceeded balance.");
			return 0;
		}
		
		balance -= amount;
		return balance;
	}
	
	public int transferTo(Account another, int amount)
	{
		if(balance < amount)
		{
			System.out.println("Amount exceeded balance.");
			return 0;
		}
		
		balance -= amount;
		another.balance += amount;	
		return balance;
	}
	
	@Override
	public String toString()
	{
		return "ID: "+id+"\nName: "+name+"\nBalance: "+balance;
	}
}
