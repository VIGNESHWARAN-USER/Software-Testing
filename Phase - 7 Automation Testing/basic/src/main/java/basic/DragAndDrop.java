package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		
		Actions act = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://leafground.com/drag.xhtml");
		
		WebElement src = driver.findElement(By.xpath("//div[@id = \"form:drag\"]"));
		WebElement target = driver.findElement(By.xpath("//div[@id = \"form:drop\"]"));
		
		//act.dragAndDrop(src, target).perform();
		
		Action click = act.clickAndHold(src).moveToElement(target).release().build();
		
		click.perform();
		
		//act.dragAndDropBy(src, -400, -100).perform();
		
		
		System.out.println(driver.findElement(By.xpath("//p[text() = \"Dropped!\"]")).getText());
	}
}
