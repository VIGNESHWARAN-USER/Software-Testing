package arrays_hand_on;

public class EvenAndOddArray {
	public static void main(String args[])
	{
		int[] odd = new int[5];
		int[] even = new int[5];
		int oddIndex = 0, evenIndex = 0;
		for(int i=1; i<=10; i++)
		{
			odd[oddIndex++] = i++;
			even[evenIndex++] = i;
		}
		int oddSum = 0, evenSum = 0;
		System.out.print("Elements in Odd Array: ");
		for(int i: odd)
		{
			oddSum += i;
			System.out.print(i+" ");
		}
		System.out.println("\nOdd Sum: "+oddSum);
		System.out.print("Elements in Even Array: ");
		for(int i: even)
		{
			evenSum += i;
			System.out.print(i+" ");
		}
		System.out.println("\nEven Sum: "+evenSum);
	}
}
