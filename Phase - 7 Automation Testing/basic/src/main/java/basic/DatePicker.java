package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        
        
        driver.findElement(By.cssSelector("input#datepicker")).click();
        
        driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
        
        js.executeScript("document.querySelector(\".ui-datepicker-calendar tbody tr:nth-child(4) td:nth-child(2\").click()");
        
        System.out.println(js.executeScript("return document.getElementsByClassName(\".hasDatepicker\")[0]").toString());
        
	}
}
