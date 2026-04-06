package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocator {
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		WebElement firstName = driver.findElement(By.xpath("//label[text() = \"First Name \"]/following-sibling::input[@name = \"name\"]"));
		WebElement lastName = driver.findElement(with(By.tagName("input")).below(firstName));
		firstName.sendKeys("Vignesh");
		lastName.sendKeys("M");
		WebElement password = driver.findElement(By.xpath("//div/input[@type=\"password\"]"));
		WebElement email = driver.findElement(with(By.tagName("input")).above(password));
		WebElement rePassword = driver.findElement(with(By.tagName("input")).below(password));
		email.sendKeys("vigneshwaran.coder@gmail.com");
		password.sendKeys("12345678");
		rePassword.sendKeys("12345678");
		WebElement clearButton = driver.findElement(By.xpath("//button[@type = \"reset\"][1]"));
		WebElement resetButton = driver.findElement(By.xpath("//button[@type = \"reset\"][2]"));
		WebElement registerButton = driver.findElement(with(By.tagName("button")).near(clearButton));
		registerButton.click();
		//driver.close();
	}
}
