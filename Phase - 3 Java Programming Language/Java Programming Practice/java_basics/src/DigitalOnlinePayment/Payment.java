package DigitalOnlinePayment;

abstract class Payment {
	private String transactionId;
	private double amount;
	private String customerName;
	private String paymentStatus;
	public Payment(String transactionId, double amount, String customerName, String paymentStatus) {
		super();
		this.transactionId = transactionId;
		this.amount = amount;
		this.customerName = customerName;
		this.paymentStatus = paymentStatus;
	}
	
	abstract public boolean validatePayment();
	abstract public boolean processPayment();
	
	public void executeTransaction()
	{
		
	}

	public String getTransactionId() {
		return transactionId;
	}

	public double getAmount() {
		return amount;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	
	public String generateReceipt() {
		return "TransactionId=" + transactionId + ", amount=" + amount + ", customerName=" + customerName
				+ ", paymentStatus=" + paymentStatus;
	}
	
	
	
}
