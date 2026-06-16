package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class SoftAssertionExample {

	WebDriver driver;
	WebDriverWait wait;

	SoftAssert sa = new SoftAssert();

	@Test
	public void loginTest() {

		driver.findElement(By.id("login2")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
		driver.findElement(By.id("loginusername")).sendKeys("admin");
		driver.findElement(By.id("loginpassword")).sendKeys("admin");
		driver.findElement(By.xpath("//button[text() = \"Log in\"]")).click();
		System.out.println("User logged in");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));

		String expectedMessage = "Welcome";
		String actualMessage = driver.findElement(By.id("nameofuser")).getText();

		sa.assertEquals(actualMessage, expectedMessage);
	}

	@Test
	public void invalidLoginTestWithWrongUsername() {

		driver.findElement(By.id("login2")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
		driver.findElement(By.id("loginusername")).sendKeys("vetri1234663");
		driver.findElement(By.id("loginpassword")).sendKeys("admin");
		driver.findElement(By.xpath("//button[text() = \"Log in\"]")).click();

		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();

		String expectedMessage = "User does not exist.";
		String actualMessage = alert.getText();

		alert.accept();

		sa.assertEquals(actualMessage, expectedMessage);

		sa.assertAll();

	}

	@Test
	public void invalidLoginTestWithWrongPassword() {

		driver.findElement(By.id("login2")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
		driver.findElement(By.id("loginusername")).sendKeys("admin");
		driver.findElement(By.id("loginpassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text() = \"Log in\"]")).click();

		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();

		String expectedMessage = "Wrong password.";
		String actualMessage = alert.getText();

		alert.accept();

		sa.assertEquals(actualMessage, expectedMessage);

		sa.assertAll();
	}

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		//options.addArguments("--headless");

		driver = new ChromeDriver(options);

		driver.get("https://demoblaze.com");

		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}

	@AfterMethod(alwaysRun = true)
	public void afterMehod() {
		driver.quit();
	}

}
