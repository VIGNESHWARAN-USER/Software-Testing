package BankApplication;

public class TransactionValidator {
	
	public static boolean validateTransaction(String accountId, double balance, 
			double amount, double dailyLimit) throws InsufficientFundsException, InvalidAccountException, TransactionLimitException
	{
		if(accountId == null || accountId.length() == 0) 
		{
			throw new InvalidAccountException("Accunt ID cannot be empty", 1001);
		}
		if(balance < amount)
		{
			String message = "Shortfall: "+(amount-balance);
			throw new InsufficientFundsException(message, 1002);
		}
		if(dailyLimit < amount)
		{
			String message = "Limit: "+(amount-balance);
			throw new TransactionLimitException(message, 1002);
		}
		return true;
	}
}
