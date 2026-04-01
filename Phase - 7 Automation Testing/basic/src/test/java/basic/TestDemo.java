package basic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemo {
	public static void main(String args[]) throws IOException
	{
		
		BufferedWriter file = new BufferedWriter(new FileWriter("src/test/java/basic/output.txt"));
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		file.write("Page title is: "+driver.getTitle());
		file.append("\n");
		file.append(driver.getPageSource());
		file.append("\n");
		file.append("URL: "+driver.getCurrentUrl());
		file.append("\n\n");
		file.append("EOF");
		//driver.close();
		file.close();
	}
}
