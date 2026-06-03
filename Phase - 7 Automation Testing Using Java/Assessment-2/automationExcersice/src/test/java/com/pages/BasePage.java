package com.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public static WebDriver driver;
	
	public BasePage(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, driver);
	}
	
	public void safeClick(By locator) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	    } catch (ElementClickInterceptedException e) {
	        handleAdIfPresent();
	        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	    }
	}
	
	public void handleAdIfPresent() {
	    try {
	        List<WebElement> frames = driver.findElements(By.cssSelector("iframe"));

	        for (WebElement frame : frames) {
	            driver.switchTo().frame(frame);

	            List<WebElement> closeBtn = driver.findElements(
	                By.xpath("//button[contains(@id,'dismiss') or contains(@aria-label,'close')]")
	            );

	            if (!closeBtn.isEmpty()) {
	                closeBtn.get(0).click();
	                driver.switchTo().defaultContent();
	                return;
	            }

	            driver.switchTo().defaultContent();
	        }

	    } catch (Exception ignored) {
	        driver.switchTo().defaultContent();
	    }
	}
}
