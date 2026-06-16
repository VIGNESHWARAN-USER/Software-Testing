package fileio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IsReadable {
	public static void main(String args[])
	{
		Path p = Paths.get("F:\\Personal\\Training\\Example\\Symbolic_Link\\Test.txt");
		boolean result = Files.isReadable(p);
		System.out.println("File " + p + " is Readable = " + result);
	}
}
