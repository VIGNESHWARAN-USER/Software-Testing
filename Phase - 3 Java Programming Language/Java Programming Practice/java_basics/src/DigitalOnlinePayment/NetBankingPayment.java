package DigitalOnlinePayment;

public class NetBankingPayment extends Payment{
	private String bankName;
	private String accountNumber;
	private String ifscCode;
	public NetBankingPayment(String transactionId, double amount, String customerName, 
			String bankName, String accountNumber, String ifscCode) {
		super(transactionId, amount, customerName);
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
	}
	
	public boolean validatePayment()
	{
		if(accountNumber.length() != 14 && ifscCode.length() != 11)	return false;
		return true;
	}
	
	public boolean processPayment()
	{
		return true;
	}
}
