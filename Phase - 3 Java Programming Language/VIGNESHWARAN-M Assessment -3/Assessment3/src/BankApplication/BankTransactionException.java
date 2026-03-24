package BankApplication;

public abstract class BankTransactionException extends Exception{
	
	public BankTransactionException(String message, int errorCode) {
		
		System.out.println(message+" [Code: "+errorCode+"]");
	}

}
