package fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectory{
	public static void main(String args[]){
		try{
			Path path = Paths.get("F:\\Personal\\Training\\Example\\Sample");
			if (!Files.exists(path)) {
				Files.createDirectory(path);
				System.out.println("Directory created");
			} else {
				System.out.println("Directory already exists");
			}
		}catch (IOException e) {
			System.out.println(e); 
		}        
	}
}
