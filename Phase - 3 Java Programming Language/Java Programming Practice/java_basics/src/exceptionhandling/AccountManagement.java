package exceptionhandling;

import java.util.Scanner;

class PayOutOfBoundsException extends Exception{
	PayOutOfBoundsException(String msg){
		super(msg);
	}
}

public class AccountManagement {
	
	static double balance=8000;
	
	public static void withdrawAmount(double amount) throws PayOutOfBoundsException{
		if(amount>3000.0) {
			throw new PayOutOfBoundsException("Amount limit exceeds.");
		}
		else {
			balance-=amount;
			System.out.println("Withdrawn success");
			System.out.print("Balance : "+balance);
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Withdrawl Amount : ");
		double amount=sc.nextDouble();
		
		try {
			withdrawAmount(amount);
		}
		catch(PayOutOfBoundsException e) {
			e.printStackTrace();
		}
		
	}
}