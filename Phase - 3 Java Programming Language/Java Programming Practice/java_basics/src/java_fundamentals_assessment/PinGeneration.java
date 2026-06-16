package java_fundamentals_assessment;

import java.util.*;

public class PinGeneration {
	
	public static int maxDigit = 0;
	
	public static int findMin(int a, int b, int c)
	{
		int min = 0;
		if(a <= b && a <= c)
		{
			min = a;
		}
		else if(b <= a && b <= c)
		{
			min = b;
		}
		else
		{
			min = c;
		}
		
		if(a >= b && a >= c && a > maxDigit)
		{
			maxDigit = a;
		}
		else if(b >= a && b >= c && b > maxDigit)
		{
			maxDigit = b;
		}
		else if( c > maxDigit)
		{
			maxDigit = c;
		}
		
		return min;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("The input must have only 3 digits.");
		System.out.print("Enter Input 1: ");
		int input1 = sc.nextInt();
		if(input1 < 100 || input1 > 999)
		{
			System.out.println("Invalid Input");
			return;
		}
		System.out.print("Enter Input 2: ");
		int input2 = sc.nextInt();
		if(input1 < 100 || input1 > 999)
		{
			System.out.println("Invalid Input");
			return;
		}
		System.out.print("Enter Input 3: ");
		int input3 = sc.nextInt();
		if(input1 < 100 || input1 > 999)
		{
			System.out.println("Invalid Input");
			return;
		}
		
		int pin = 0, max = 0, place = 1;
		
		while(input1 > 0)
		{
			pin = findMin(input1%10, input2%10, input3%10)*place + pin;
			input1/=10;
			input2/=10;
			input3/=10;
			place*=10;
		}
		pin += maxDigit*1000;
		System.out.println("The generated four digit pin is: "+pin);
	}
}
