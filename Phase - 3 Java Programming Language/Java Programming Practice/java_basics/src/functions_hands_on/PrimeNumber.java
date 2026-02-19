package functions_hands_on;

public class PrimeNumber {
	public static boolean isPrime(int n)
	{
		if(n < 2) return false;
		
		for(int i=2; i<=Math.sqrt(n); i++)
		{
			if(n%i == 0) return false;
		}
		
		return true;
	}
	
	public static void main(String args[])
	{
		System.out.println("The prime numbers 1 to 100 are:");
		for(int i=1; i<=100; i++)
		{
			if(isPrime(i))
			{
				System.out.print(i+" ");
			}
		}
	}
}
