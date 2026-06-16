package BankApplication;

public class InvalidAccountException extends BankTransactionException{
	public InvalidAccountException(String message, int errorCode) {
		super(message, errorCode);
	}

	
}
