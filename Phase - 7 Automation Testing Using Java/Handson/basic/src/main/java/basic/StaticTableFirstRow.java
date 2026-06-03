package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTableFirstRow {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        
        List<WebElement> firstRow = driver.findElements(By.xpath("//table[@id = \"table1\"]/tbody/tr[1]/td"));
        
        for(WebElement i: firstRow)
        {
        	System.out.println(i.getText());
        }
        
	}
}
