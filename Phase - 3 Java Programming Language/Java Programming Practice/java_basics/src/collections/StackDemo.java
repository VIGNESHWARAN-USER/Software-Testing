package collections;

import java.util.*;

public class StackDemo {
	public static void main(String args[])
	{
		Stack<Integer> stack = new Stack<>();
		
		stack.add(1);
		stack.add(0, 2);
		stack.push(6);
		stack.add(5);
		
		stack.pop();
		
		System.out.println("Stack : "+stack);
	}
}
