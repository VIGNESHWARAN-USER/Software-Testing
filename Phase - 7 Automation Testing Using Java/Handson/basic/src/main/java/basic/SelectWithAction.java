package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectWithAction {
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		
		Actions act = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://leafground.com/select.xhtml;jsessionid=node01eoe4m4ary1jpew30i04p8uz114556587.node0");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement input = driver.findElement(By.xpath("//input[@id = \"j_idt87:auto-complete_input\"]"));
		
		input.sendKeys("AWS");
		
		
		
	}
}
