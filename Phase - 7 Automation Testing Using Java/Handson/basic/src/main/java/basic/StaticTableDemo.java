package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTableDemo {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id = \"table1\"]/thead/tr/th"));
        
        for(WebElement i: headers)
        {
        	System.out.println(i.getText());
        }
        
	}
}
