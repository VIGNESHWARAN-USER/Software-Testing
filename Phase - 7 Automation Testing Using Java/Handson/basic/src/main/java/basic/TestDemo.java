package basic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemo {
	public static void main(String args[]) throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		System.out.println("Page title is: "+driver.getTitle());
		System.out.println(driver.getPageSource());
		System.out.println("URL: "+driver.getCurrentUrl());
		System.out.println("EOF");
		driver.close();
	}
}
