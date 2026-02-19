package com.oops;

public class ArrayOfObjects {
	public static void main(String args[])
	{
		Theatre[] theatres = new Theatre[5];
		for(int i=0; i<5; i++)
		{
			theatres[i] = new Theatre();
			theatres[i].id = i;
			theatres[i].name = "DNC";
		}
		for(Theatre i: theatres)
		{
			System.out.println(i.id+" "+i.name+" "+i.location);
		}
	}
}
