package collections;

import java.util.*;

public class SpliteratorExample {
	public static void main(String args[])
	{
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(8);
		
		Spliterator<Integer> sp = arr.spliterator();
		
		System.out.print("Try Advance : ");
		while(sp.tryAdvance(n-> System.out.print(n+" ")));
		System.out.println();
		
		sp = arr.spliterator();
		System.out.print("For each remaining : ");
		sp.forEachRemaining(n-> System.out.print(n+" "));
		System.out.println();
		
		sp = arr.spliterator();
		Spliterator<Integer> spArray = sp.trySplit();
		System.out.print("Try Split : ");
		spArray.forEachRemaining(n-> System.out.print(n+" "));
		spArray.forEachRemaining(n-> System.out.print(n+" "));
	}
}
