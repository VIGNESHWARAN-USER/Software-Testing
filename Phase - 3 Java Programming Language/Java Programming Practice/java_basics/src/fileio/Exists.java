package fileio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exists {
	public static void main(String args[])
	{
		Path p = Paths.get("F:\\Personal\\Training\\Example\\Symbolic_Link\\Test.txt");
		Boolean result=Files.exists(p);
		System.out.println("Path" + p + "exists = " + result);
	}
}
