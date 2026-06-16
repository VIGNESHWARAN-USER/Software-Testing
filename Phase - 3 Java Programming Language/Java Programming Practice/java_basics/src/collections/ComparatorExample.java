package collections;

import java.util.*;

class Task implements Comparable<Task>{
	
	public String task;
	public int priority;
	
	public Task(String task, int priority)
	{
		this.task = task;
		this.priority = priority;
	}

	public int compareTo(Task o) {
		return this.priority - o.priority;
	}
	
	public String toString()
	{
		return "Task : "+task+" Priority : "+priority;
	}

}

class ComparatorExample
{
	public static void main(String args[])
	{
		PriorityQueue<Task> pq = new PriorityQueue<>();
		
		pq.offer(new Task("Task 1", 1));
		pq.offer(new Task("Task 2", 2));
		pq.offer(new Task("Task 3", 3));
		pq.offer(new Task("Task 4", 4));
		pq.offer(new Task("Task 5", 5));
		
		for(Task i: pq)
		{
			System.out.println(i);
		}
	}
}
