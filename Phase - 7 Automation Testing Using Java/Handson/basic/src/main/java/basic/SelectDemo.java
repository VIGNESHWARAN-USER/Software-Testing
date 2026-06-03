package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		
		Actions act = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://leafground.com/select.xhtml;jsessionid=node01eoe4m4ary1jpew30i04p8uz114556587.node0");
		
		WebElement src = driver.findElement(By.xpath("//select[@class = \"ui-selectonemenu\"]"));
		
		Select tag = new Select(src);
		
		
		List<WebElement> options = tag.getOptions();
		
		for(WebElement i: options)
		{
			System.out.println(i.getText());
		}
		
		tag.selectByIndex(2);
		tag.deselectByIndex(2);
		
		List<WebElement> selectedOptions = tag.getAllSelectedOptions();
		System.out.println("\nSelected Options:");
		for(WebElement i: selectedOptions)
		{
			System.out.println(i.getText());
		}
		
		//tag.deselectByIndex(2);
	}
}
