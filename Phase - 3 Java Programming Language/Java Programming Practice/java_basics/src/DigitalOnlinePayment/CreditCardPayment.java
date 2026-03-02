package DigitalOnlinePayment;

public class CreditCardPayment extends Payment{
	private String cardNumber;
	private String cvv;
	private String expiryDate;
	
	public CreditCardPayment(String transactionId, double amount, String customerName, String paymentStatus,
			String cardNumber, String cvv, String expiryDate) {
		super(transactionId, amount, customerName, paymentStatus);
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
	}
	
	public boolean validatePayment()
	{
		return true;
	}
	
	public boolean processPayment()
	{
		return true;
	}
}
