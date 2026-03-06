package DigitalOnlinePayment;

import java.time.LocalDate;

public class CreditCardPayment extends Payment{
	private String cardNumber;
	private String cvv;
	private String expiryDate;
	
	public CreditCardPayment(String transactionId, double amount, String customerName, 
			String cardNumber, String cvv, String expiryDate) {
		super(transactionId, amount, customerName);
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
	}
	
	public boolean validatePayment()
	{
		if(cardNumber.length() != 16 ) return false;
		if(cvv.length() != 3) return false;
		LocalDate date = LocalDate.now();
		if(!date.toString().equals(expiryDate)) return false;
		return true;
	}
	
	public boolean processPayment()
	{
		return true;
	}
}
