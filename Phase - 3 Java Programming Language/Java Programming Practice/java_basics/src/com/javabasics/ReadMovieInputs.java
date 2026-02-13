package com.javabasics;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ReadMovieInputs {
	public static void main(String args[]) throws ParseException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter movie ID:");
		int movieID = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter movie name:");
		String movieName = sc.next();
		System.out.print("Enter movie description:");
		String movieDescription = sc.next();
		System.out.print("Enter movie language:");
		String movieLanguage = sc.next();
		System.out.print("Enter Genre");
		String movieGenre = sc.next();
		System.out.print("Enter movie release date (dd-mm-yyyy): ");
		String date = sc.next();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
		Date releaseDate = dateformat.parse(date);
		System.out.print("Enter movie seat cost");
		float movieSeatCost = sc.nextFloat();
		System.out.println("ENTERED MOVIE DETAILS ARE: ");
		System.out.println("Movie ID: "+movieID);
		System.out.println("Movie Name: "+movieName);
		System.out.println("Movie Description: "+movieDescription);
		System.out.println("Movie Language: "+movieLanguage);
		System.out.println("Movie Genre: "+movieGenre);
		System.out.println("Movie Release Date: "+releaseDate);
		System.out.println("Movie Seat Cost: "+movieSeatCost);
	}
}
