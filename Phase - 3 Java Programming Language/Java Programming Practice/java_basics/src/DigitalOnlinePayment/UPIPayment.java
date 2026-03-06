package DigitalOnlinePayment;

import java.util.Scanner;

public class UPIPayment extends Payment{
	private String UPIId;
	private String UPIPin;
	public UPIPayment(String transactionId, double amount, String customerName,  String uPIId,
			String uPIPin) {
		super(transactionId, amount, customerName);
		UPIId = uPIId;
		UPIPin = uPIPin;
	}
	
	public boolean validatePayment()
	{
		if(UPIId.length() != 14)	return false;
		System.out.println("Enter the Pin Number: ");
		Scanner sc = new Scanner(System.in);
		String pin = sc.next();
		if(!pin.equals(UPIPin)) return false;
		return true;
	}
	
	public boolean processPayment()
	{
		return true;
	}
}
