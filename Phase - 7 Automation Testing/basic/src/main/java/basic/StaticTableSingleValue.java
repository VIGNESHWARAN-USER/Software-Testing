package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTableSingleValue {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        
        WebElement singleValue = driver.findElement(By.xpath("//table[@id = \"table1\"]/tbody/tr[2]/td[3]"));
        
       
        System.out.println(singleValue.getText());
        
	}
}
