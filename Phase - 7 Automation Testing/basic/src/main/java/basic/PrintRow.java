package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintRow {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
        
        driver.findElement(By.id("email")).sendKeys("vigneshwaran.coder@gmail.com");
        driver.findElement(By.id("password")).sendKeys("12345678");
        driver.findElement(By.id("submit")).click();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        
        
        String expectedName = "VIGNESHWARAN M";
      
        
        int rows = driver.findElements(By.xpath("//table/tr")).size();
        
        for(int i=1; i <= rows; i++)
        {
        	WebElement name = driver.findElement(By.xpath("//table/tr["+i+"]/td["+1+"]"));
        	
        	
        	
        	if(name.getText().equals(expectedName))
        	{	
        		List<WebElement> row = driver.findElements(By.xpath("//table/tr["+i+"]/td"));
        		for(WebElement val: row)
        		{
        			System.out.println(val.getText());
        		}
        	}
        }
        
        //driver.quit();
	}
}
