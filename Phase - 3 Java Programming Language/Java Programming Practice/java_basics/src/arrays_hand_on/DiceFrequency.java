package arrays_hand_on;

public class DiceFrequency {
	public static void main(String args[])
	{
		int[] arr = new int[100];
		
		for(int i = 0; i<100; i++)
		{
			arr[i] = (int) (Math.random() * 7);
		}
		System.out.println("The freqency of numbers after rolling dice 100 times is:");
		FrequencyOfElements.printFrequency(arr, 100);
	}
}
