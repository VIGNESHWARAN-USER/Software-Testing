package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.page.HomePage;
import com.page.LoginPage;

public class LoginTest extends BaseTest {

	LoginPage loginPage;
	HomePage homePage;

	@Test
	public void loginButtonVisible() {

		loginPage = new LoginPage(driver.get());
		
		Assert.assertTrue(loginPage.isLoginPresent());

	}

	@Test(dataProvider = "validDataSet", dataProviderClass = DPExceldata.class)
	public void validLoginTest(String username, String password) {
		loginPage = new LoginPage(driver.get());
		loginPage.login(username, password);
		
		homePage = new HomePage(driver.get());
		
		Assert.assertTrue(homePage.getGreetMessage().contains("Welcome"));
	}

	@Test(dataProvider = "invalidDataSet", dataProviderClass = DPExceldata.class)
	public void invalidLoginTest(String username, String password) {
		loginPage = new LoginPage(driver.get());
		loginPage.login(username, password);
		
		String message = loginPage.handleAlert();
		
		System.out.println(message);
		
		Assert.assertTrue(message.equals("Wrong username.") || message.equals("Wrong password.") || message.equals("User does not exist.") || message.equals("Please fill out Username and Password."));
	}

}
