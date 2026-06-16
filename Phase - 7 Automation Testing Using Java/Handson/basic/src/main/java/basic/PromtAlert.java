package basic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PromtAlert {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/alert.xhtml");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.id("j_idt88:j_idt104")).click();
        
        Alert alert = driver.switchTo().alert();
        
        alert.sendKeys("Vignesh");
        Thread.sleep(2000);
        alert.accept();
	}
}
