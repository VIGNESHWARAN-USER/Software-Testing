package CustomerAndAccount;

public class Account {
	private int id;
	private Customer customer;
	private double balance;
	
	public Account(int id, Customer customer, double balance) {
		super();
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}
	
	public Account(int id, Customer customer) {
		super();
		this.id = id;
		this.customer = customer;
	}
	
	public int getId() {
		return id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public double getBalance() {
		return balance;
	}
	
	public String getCustomerName()
	{
		return customer.getName();
	}
	
	public void setBalance(double amount)
	{
		this.balance  = amount;
	}
	
	public void withdraw(double amount)
	{
		if(amount < 0) 
		{
			System.out.println("Enter valid amount");
		}
		if(balance < amount)
		{
			System.out.println("Sorry, Insufficient Balance...");
			return;
		}
		
		balance -= amount;
		System.out.println("The amount withdrawed successfully. Your current balance is: "+balance);
	}
	
	public void deposit(double amount)
	{
		if(amount < 0) 
		{
			System.out.println("Enter valid amount");
		}
		balance += amount;
		System.out.println("The amount deposited successfully. Your current balance is: "+balance);
	}

	@Override
	public String toString() {
		return "Account id=" + id + "\nCustomer=" + customer + "\nBalance=" + balance;
	}
	
	
}
