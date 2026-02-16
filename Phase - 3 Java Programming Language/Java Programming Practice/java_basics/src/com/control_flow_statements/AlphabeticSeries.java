package com.control_flow_statements;

/*
 * Level: Easy
 * 5. Write a program using for loop to print alphabets as follows:
 * az by cx dw ev fu gt hs ir jq kp lo mn nm ol pk qj ri sh tg uf ve wd xc yb za
*/

public class AlphabeticSeries {
	public static void main(String args[])
	{
		int x = 25;
		for(char i = 'a'; i<='z'; i++)
		{
			System.out.print(i+""+(char)(i+x)+" ");
			x-=2;
		}
	}
}
