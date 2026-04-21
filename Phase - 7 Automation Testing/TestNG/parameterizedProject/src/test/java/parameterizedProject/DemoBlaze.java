package parameterizedProject;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class DemoBlaze {

	WebDriver driver;
	WebDriverWait wait;

	@Test
	@Parameters({ "correctUsername", "correctPassword" })
	public void loginTest(String correctUsername, String correctPassword) {

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id = \"logInModal\"]")));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("login2"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
		driver.findElement(By.id("loginusername")).sendKeys(correctUsername);
		driver.findElement(By.id("loginpassword")).sendKeys(correctPassword);
		driver.findElement(By.xpath("//button[text() = \"Log in\"]")).click();
		System.out.println("User logged in");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));

		String expectedMessage = "Welcome admin";
		String actualMessage = driver.findElement(By.id("nameofuser")).getText();

		Assert.assertEquals(actualMessage, expectedMessage);
		
		System.out.println("User Logged in.");
	}

	@Test
	@Parameters({ "wrongUsername", "correctPassword" })
	public void invalidLoginTestWithWrongUsername(String wrongUsername, String correctPassword) {

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id = \"logInModal\"]")));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("login2"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
		driver.findElement(By.id("loginusername")).sendKeys(wrongUsername);
		driver.findElement(By.id("loginpassword")).sendKeys(correctPassword);
		driver.findElement(By.xpath("//button[text() = \"Log in\"]")).click();

		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();

		String expectedMessage = "User does not exist.";
		String actualMessage = alert.getText();

		alert.accept();

		Assert.assertEquals(actualMessage, expectedMessage);

		System.out.println("Wrong Username.");
	}

	@Test
	@Parameters({ "correctUsername", "wrongPassword" })
	public void invalidLoginTestWithWrongPassword(String correctUsername, String wrongPassword) {

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id = \"logInModal\"]")));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("login2"))).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
		driver.findElement(By.id("loginusername")).sendKeys(correctUsername);
		driver.findElement(By.id("loginpassword")).sendKeys(wrongPassword);
		driver.findElement(By.xpath("//button[text() = \"Log in\"]")).click();

		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();

		String expectedMessage = "Wrong password.";
		String actualMessage = alert.getText();

		alert.accept();

		Assert.assertEquals(actualMessage, expectedMessage);
		
		System.out.println("Wrong Password.");

	}

	@BeforeMethod(alwaysRun = true)
	@Parameters({ "baseURL", "browser" })
	public void beforeMethod(String baseUrl, String browser) {

		if (browser.equals("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			options.addArguments("--headless");

			driver = new ChromeDriver(options);

			driver.get(baseUrl);
		} else {
			System.out.println("Not Specified");
		}

		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	@AfterMethod(alwaysRun = true)
	public void afterMehod() {
		if (driver != null) {
		    try {
		        driver.quit();
		    } catch (Exception e) {
		        // ignore
		    }
		}
	}

}
