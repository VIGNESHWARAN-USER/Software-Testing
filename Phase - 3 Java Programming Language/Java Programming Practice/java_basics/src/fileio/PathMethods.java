package fileio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathMethods {
	public static void main(String args[])
	{
		Path p = Paths.get("C:\\Directory\\Package\\filename.txt");
		
		Path p1 = Paths.get("C:\\Directory\\Package\\filename.txt");
		
		System.out.println("Path : "+p);
		
		System.out.println("Normalized Path : "+p.normalize());
		
		System.out.println("Root directory : "+p.getRoot());
		
		System.out.println("Parent directory : "+p.getParent());
		
		System.out.println("URI: "+p.toUri());
		
		System.out.println("File Name : "+p.getFileName());
		
		System.out.println("Name Count : "+p.getNameCount());
		
		System.out.println("Subpath : "+p.subpath(0, 2));
		
		System.out.println("Absolute Path : "+p.toAbsolutePath());
		
		System.out.println("Is Absolute Path? : "+p.isAbsolute());
		
		if(p.equals(p1)) System.out.println("Both are equal paths.");
		else System.out.println("Both are not equal paths.");
	}
}
