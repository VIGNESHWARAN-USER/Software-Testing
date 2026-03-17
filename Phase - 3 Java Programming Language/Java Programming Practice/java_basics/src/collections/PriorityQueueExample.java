package collections;

import java.util.*;

public class PriorityQueueExample {
	public static void main(String args[])
	{
		PriorityQueue<String> pq = new PriorityQueue<>();
		
		pq.offer("A");
		pq.offer("B");
		pq.offer("C");
		pq.offer("D");
		pq.offer("E");
		pq.offer("F");
		pq.offer("G");
		
		System.out.println(pq);
		
		pq.poll();
		pq.poll();
		
		System.out.println(pq);
	}
}
