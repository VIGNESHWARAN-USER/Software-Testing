package BankApplication;

public class InsufficientFundsException extends BankTransactionException{
	public InsufficientFundsException(String message, int errorCode) {
		super(message, errorCode);
	}
}
