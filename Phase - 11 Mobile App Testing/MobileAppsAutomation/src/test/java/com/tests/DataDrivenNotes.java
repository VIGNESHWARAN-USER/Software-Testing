package com.tests;

import java.net.MalformedURLException;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dataproviders.NotesDataProvider;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DataDrivenNotes {

	private AndroidDriver driver;
	
	@BeforeClass
	public void setUp() throws MalformedURLException {
		System.out.println("Setting up device capabilities...");
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("Android");
		options.setAutomationName("UiAutomator2");
		options.setUdid("R9ZL50NGWQX"); 
		options.setAppPackage("com.atomczak.notepat");
		options.setAppActivity("com.atomczak.notepat.MainActivity");
		options.setNoReset(true);

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Appium session created and Phone opened!");
	}
	 
	@Test(dataProvider = "notesData", dataProviderClass = NotesDataProvider.class)
	public void sendNotes(String excelTitle, String excelContent) {
		
		driver.findElement(AppiumBy.id("com.atomczak.notepat:id/new_note_fab_layout")).click();
		 
		WebElement titleElement = driver.findElement(AppiumBy.id("com.atomczak.notepat:id/textNoteTitleEdit"));
		titleElement.sendKeys(excelTitle);
		 
		WebElement contentElement = driver.findElement(AppiumBy.id("com.atomczak.notepat:id/textNoteContentEdit"));
		contentElement.sendKeys(excelContent);
		 
		driver.findElement(AppiumBy.id("com.atomczak.notepat:id/action_save_note")).click();
	}
	 
	
	
	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}