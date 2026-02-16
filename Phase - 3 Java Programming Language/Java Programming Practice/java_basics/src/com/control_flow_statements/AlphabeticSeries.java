package com.control_flow_statements;

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
