package DigitalOnlinePayment;

public class NetBankingPayment extends Payment{
	private String bankName;
	private String accoountNumber;
	private String ifscCode;
	public NetBankingPayment(String transactionId, double amount, String customerName, String paymentStatus,
			String bankName, String accoountNumber, String ifscCode) {
		super(transactionId, amount, customerName, paymentStatus);
		this.bankName = bankName;
		this.accoountNumber = accoountNumber;
		this.ifscCode = ifscCode;
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
