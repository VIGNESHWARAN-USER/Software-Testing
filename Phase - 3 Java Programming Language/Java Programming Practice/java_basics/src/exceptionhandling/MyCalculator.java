package exceptionhandling;
import java.util.Scanner;

public class MyCalculator {
	
	public static long exp(int n,int p) throws Exception {
		
		if(n==0 && p==0)throw new Exception("n or p should not be negative.");
		if(n<0 || p<0)throw new Exception("n and p should not be zero.");
		
		return (long)Math.pow(n, p);
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter n value : ");
		int n=sc.nextInt();
		
		System.out.print("Enter p value : ");
		int p=sc.nextInt();
		
		try {
			System.out.print(exp(n, p));
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}