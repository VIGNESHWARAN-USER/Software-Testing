package com.oops;

import java.util.*;

class Movie
{
	private String title;
	private String genre;
	
	public Movie(String title, String genre)
	{
		this.title = title;
		this.genre = genre;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getGenre() {
		return genre;
	}
	
	
	public String getMovieDetails()
	{
		return "Movie Title: "+title+"\nMovie Genre: "+genre;
	}
	
	
}

interface SearchByGenre
{
	public abstract void searchByGenre(String genre);
}

interface SearchByTitle
{
	public abstract void searchByTitle(String title);
}

public class MovieCatalog implements SearchByGenre, SearchByTitle{
	private static Date lastUpdated;
	private static ArrayList<Movie> movieList = new ArrayList<>();
	
	public void searchByGenre(String genre)
	{
		for(Movie movie: movieList)
		{
			if(movie.getGenre().equals(genre))
			{
				System.out.println(movie.getMovieDetails());
				return;
			}
		}
		System.out.println("Movie not found");
	}
	
	public void searchByTitle(String title)
	{
		for(Movie movie: movieList)
		{
			if(movie.getTitle().equals(title))
			{
				System.out.println(movie.getMovieDetails());
				return;
			}
		}
		System.out.println("Movie not found");
	}
	
	public static void main(String args[])
	{
		MovieCatalog mc = new MovieCatalog();
		
		movieList.add(new Movie("ABC", "Drama"));
		movieList.add(new Movie("XYZ", "Thriller"));
		movieList.add(new Movie("ABC", "Comedy"));
		movieList.add(new Movie("XYZ", "Horror"));
		
		mc.searchByGenre("Thriller");
		mc.searchByTitle("ABC");
	}
	
}
