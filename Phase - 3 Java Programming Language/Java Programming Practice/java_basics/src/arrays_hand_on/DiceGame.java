package arrays_hand_on;

import java.util.*;

public class DiceGame {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = 10;
		int arun[] = new int[n];
		int naveen[] = new int[n];
		
		System.out.println("Enter the dice values of Arun:");
		for(int i = 0; i < n; i++)
		{
			arun[i] = sc.nextInt();
		}
		
		System.out.println("Enter the dice values of Naveen:");
		for(int i = 0; i < n; i++)
		{
			naveen[i] = sc.nextInt();
		}
		
		int pointsOfArun = 0, pointsOfNaveen = 0;
		
		for(int i = 0; i < n; i++)
		{
			if(arun[i] > naveen[i]) pointsOfArun++;
			else if(arun[i] < naveen[i]) pointsOfNaveen++;
		}
		if(pointsOfArun > pointsOfNaveen)
		{
			System.out.println("Arun Wins!!!");
		}
		else if(pointsOfArun < pointsOfNaveen)
		{
			System.out.println("Naveen Wins!!!");
		}
		else
		{
			System.out.println("Match Draw!!!");
		}
	}
}
