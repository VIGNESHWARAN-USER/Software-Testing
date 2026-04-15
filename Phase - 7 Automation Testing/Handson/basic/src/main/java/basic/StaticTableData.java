package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTableData {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        
        List<WebElement> head = driver.findElements(By.xpath("//table[@id = \"table1\"]/thead/tr/th"));
        List<WebElement> body = driver.findElements(By.xpath("//table[@id = \"table1\"]/tbody/descendant::td"));
        
        for(WebElement i: head)
        {
        	System.out.print(i.getText()+" ");
        }
        
        System.out.println();
        
        int size = head.size(), x=0;
        
        for(WebElement i: body)
        {
        	x++;
        	System.out.print(i.getText()+" ");
        	if(x%size == 0) System.out.println();
        }
        
	}
}
