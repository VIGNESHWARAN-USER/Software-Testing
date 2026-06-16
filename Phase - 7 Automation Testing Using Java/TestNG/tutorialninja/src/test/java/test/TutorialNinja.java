package test;

import org.testng.annotations.Test;
import utilities.TestDriver;

import java.util.List;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(utilities.Listener.class)
public class TutorialNinja extends TestDriver {

	ThreadLocal<WebDriverWait> wait = new ThreadLocal<>();

	@Test(dataProvider = "validDataSet", dataProviderClass = DPExceldata.class)
	public void validLoginTest(String correctUsername, String correctPassword) {

		try {

			wait.get().until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title = \"My Account\"]"))).click();

			driver.get()
					.findElement(
							By.xpath("//ul[@class = \"dropdown-menu dropdown-menu-right\"]/li/a[text() = \"Login\"]"))
					.click();

			driver.get().findElement(By.xpath("//input[@name = \"email\"]")).sendKeys(correctUsername);
			driver.get().findElement(By.xpath("//input[@name = \"password\"]")).sendKeys(correctPassword);

			driver.get().findElement(By.xpath("//input[@value = \"Login\"]")).click();

			System.out.println(correctUsername + " " + correctPassword);

			int expectedCount = 4;
			int actualCount = driver.get().findElements(By.xpath("//h2[text() = \"My Account\"]/following-sibling::ul")).size();

			Assert.assertTrue(expectedCount == actualCount);

			System.out.println("User Logged in");
		} catch (Exception e) {

		}
	}

	@Test(dataProvider = "invalidDataSet", dataProviderClass = DPExceldata.class)
	public void invalidLoginTest(String username, String password) {

		wait.get().until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title = \"My Account\"]"))).click();
		driver.get()
				.findElement(By.xpath("//ul[@class = \"dropdown-menu dropdown-menu-right\"]/li/a[text() = \"Login\"]"))
				.click();

		driver.get().findElement(By.xpath("//input[@name = \"email\"]")).sendKeys(username);
		driver.get().findElement(By.xpath("//input[@name = \"password\"]")).sendKeys(password);
		driver.get().findElement(By.xpath("//input[@value = \"Login\"]")).click();

		System.out.println(username + " " + password);

		String expectedURL = "https://tutorialsninja.com/demo/index.php?route=account/account";
		String actualURL = driver.get().getCurrentUrl();

		Assert.assertTrue(driver.get().findElement(By.xpath("//div[@class=\"alert alert-danger alert-dismissible\"]"))
				.isDisplayed());

		System.out.println("Invalid credentials");
	}

	@Test(dataProvider = "validSearchDataSet", dataProviderClass = DPExceldata.class)
	public void searchTestWithValidDataSet(String searchKey) {

		driver.get().findElement(By.xpath("//div[@id = \"search\"]/input")).sendKeys(searchKey, Keys.ENTER);

		List<WebElement> products = driver.get().findElements(By.xpath(
				"//div[@class = \"row\"]/div[@class =\"product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12\"]"));

		Assert.assertTrue(products.size() > 0);

		System.out.println("Valid search key " + searchKey);
	}

	@Test(dataProvider = "invalidSearchDataSet", dataProviderClass = DPExceldata.class)
	public void searchTestWithInvalidDataSet(String searchKey) {

		driver.get().findElement(By.xpath("//div[@id = \"search\"]/input")).sendKeys(searchKey, Keys.ENTER);

		List<WebElement> products = driver.get().findElements(By.xpath(
				"//div[@class = \"row\"]/div[@class =\"product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12\"]"));

		Assert.assertTrue(products.size() == 0);

		System.out.println("Invalid search key " + searchKey);
	}

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");

		Map<String, Object> prefs = new HashMap<>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);

		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--disable-notifications");

		WebDriver d = new ChromeDriver(options);
		setDriver(d);

		driver.get().manage().deleteAllCookies();

		driver.get().get("https://tutorialsninja.com/demo/index.php?route=common/home");

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
