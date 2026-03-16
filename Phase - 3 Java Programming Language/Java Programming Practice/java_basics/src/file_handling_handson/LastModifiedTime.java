package file_handling_handson;

import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LastModifiedTime {
	public static void main(String args[]) throws IOException
	{
		Path path = Paths.get("src/file_handling_handson/input.txt");
		System.out.println("Last Modified Time : "+Files.getLastModifiedTime(path));
		
	}
}
