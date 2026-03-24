package BankApplication;
import java.util.Scanner;

public class Main {
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account ID: ");
		String accountId = sc.nextLine();
		
		System.out.println("Enter balance: ");
		double balance = sc.nextDouble();
		
		System.out.println("Enter amount: ");
		double amount = sc.nextDouble();
		
		System.out.println("Enter daily limit: ");
		double limit = sc.nextDouble();
		
		try
		{
			if(TransactionValidator.validateTransaction(accountId, balance, amount, limit))
			{
				System.out.println("The details are valid");
			}
		}
		catch(InvalidAccountException e)
		{
			System.out.println(e);
		}
		catch(TransactionLimitException e)
		{
			System.out.println(e);
		}
		catch(InsufficientFundsException e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("Transaction Completed");
		}
	}
}
