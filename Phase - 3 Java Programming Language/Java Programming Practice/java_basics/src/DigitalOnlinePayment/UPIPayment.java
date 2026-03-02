package DigitalOnlinePayment;

public class UPIPayment extends Payment{
	private String UPIId;
	private String UPIPin;
	public UPIPayment(String transactionId, double amount, String customerName, String paymentStatus, String uPIId,
			String uPIPin) {
		super(transactionId, amount, customerName, paymentStatus);
		UPIId = uPIId;
		UPIPin = uPIPin;
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
