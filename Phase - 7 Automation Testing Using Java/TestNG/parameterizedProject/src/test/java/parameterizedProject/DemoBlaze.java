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

	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	ThreadLocal<WebDriverWait> wait = new ThreadLocal<WebDriverWait>();

	@Test
	@Parameters({ "correctUsername", "correctPassword" })
	public void loginTest(String correctUsername, String correctPassword) {

		wait.get().until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id = \"logInModal\"]")));
		wait.get().until(ExpectedConditions.elementToBeClickable(By.id("login2"))).click();

		wait.get().until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
		driver.get().findElement(By.id("loginusername")).sendKeys(correctUsername);
		driver.get().findElement(By.id("loginpassword")).sendKeys(correctPassword);
		driver.get().findElement(By.xpath("//button[text() = \"Log in\"]")).click();
		System.out.println("User logged in");

		wait.get().until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));

		String expectedMessage = "Welcome admin";
		String actualMessage = driver.get().findElement(By.id("nameofuser")).getText();

		Assert.assertEquals(actualMessage, expectedMessage);
		
		System.out.println("User Logged in.");
	}

	@Test
	@Parameters({ "wrongUsername", "correctPassword" })
	public void invalidLoginTestWithWrongUsername(String wrongUsername, String correctPassword) {

		wait.get().until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id = \"logInModal\"]")));
		wait.get().until(ExpectedConditions.elementToBeClickable(By.id("login2"))).click();

		wait.get().until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
		driver.get().findElement(By.id("loginusername")).sendKeys(wrongUsername);
		driver.get().findElement(By.id("loginpassword")).sendKeys(correctPassword);
		driver.get().findElement(By.xpath("//button[text() = \"Log in\"]")).click();

		wait.get().until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.get().switchTo().alert();

		String expectedMessage = "User does not exist.";
		String actualMessage = alert.getText();

		alert.accept();

		Assert.assertEquals(actualMessage, expectedMessage);

		System.out.println("Wrong Username.");
	}

	@Test
	@Parameters({ "correctUsername", "wrongPassword" })
	public void invalidLoginTestWithWrongPassword(String correctUsername, String wrongPassword) {

		wait.get().until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id = \"logInModal\"]")));
		wait.get().until(ExpectedConditions.elementToBeClickable(By.id("login2"))).click();

		wait.get().until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
		driver.get().findElement(By.id("loginusername")).sendKeys(correctUsername);
		driver.get().findElement(By.id("loginpassword")).sendKeys(wrongPassword);
		driver.get().findElement(By.xpath("//button[text() = \"Log in\"]")).click();

		wait.get().until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.get().switchTo().alert();

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

			driver.set(new ChromeDriver(options));
			
			driver.get().manage().deleteAllCookies();
			
			driver.get().get(baseUrl);
		} else {
			System.out.println("Not Specified");
		}

		wait.set(new WebDriverWait(driver.get(), Duration.ofSeconds(30)));
	}

	@AfterMethod(alwaysRun = true)
	public void afterMehod() {
		if (driver.get() != null) {
		    try {
		        driver.get().quit();
		        driver.remove();
		    } catch (Exception e) {
		        // ignore
		    }
		}
	}

}
