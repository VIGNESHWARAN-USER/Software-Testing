package BankApplication;

public class TransactionLimitException extends BankTransactionException{
	
	public TransactionLimitException(String message, int errorCode) {
		super(message, errorCode);
	}
}
