package utilities;

import org.openqa.selenium.WebDriver;

public class TestDriver {
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	public void setDriver(WebDriver driverInstance) {
		driver.set(driverInstance);
	}

	public WebDriver getDriver() {
		return driver.get();
	}
}