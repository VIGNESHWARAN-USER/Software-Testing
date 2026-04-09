package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
        
        driver.findElement(By.id("email")).sendKeys("vigneshwaran.coder@gmail.com");
        driver.findElement(By.id("password")).sendKeys("12345678");
        driver.findElement(By.id("submit")).click();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        
        List<WebElement> head = driver.findElements(By.xpath("//table/thead/tr/th"));
        
        System.out.println(head);
        
        List<WebElement> body = driver.findElements(By.xpath("//table/tr/descendant::td"));
        
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
