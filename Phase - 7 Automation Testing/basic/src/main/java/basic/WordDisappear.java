package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WordDisappear {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/l");
		
		WebElement text = driver.findElement(By.id("deletesuccess"));
		WebElement button = driver.findElement(By.id("alert2"));
		
		wait.until(ExpectedConditions.invisibilityOf(text));
		
		button.click();
		
		
	}
}
