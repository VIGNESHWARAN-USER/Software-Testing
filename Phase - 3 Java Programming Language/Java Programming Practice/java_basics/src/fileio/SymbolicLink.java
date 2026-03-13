package fileio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SymbolicLink {

    public static void main(String args[]) {

        Path orgPath = Paths.get("D:\\EXPLEO SMARTCLIFF\\Phase - 3 Java Programming Language\\Study Materials\\1.Class_Object_Encapsulation_V1.0 1.pdf");
        Path symbolicPath = Paths.get("");

        try {
            Files.createSymbolicLink(symbolicPath, orgPath);
            System.out.println("Symbolic link created");
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}