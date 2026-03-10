package demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JenkinsDemo {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(
            new FileReader("D:\\EXPLEO SMARTCLIFF\\Phase - 3 Java Programming Language\\Java Programming Practice\\java_basics\\src\\demo\\Input.txt")
        );

        String line = reader.readLine();

        String[] numbers = line.split(" ");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        System.out.println("The value of A is : " + a);
        System.out.println("The value of B is : " + b);
        System.out.println("The sum is : " + (a + b));

        reader.close();
    }
}