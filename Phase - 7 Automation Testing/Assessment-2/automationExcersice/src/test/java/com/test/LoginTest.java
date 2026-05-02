package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.LoginPage;

public class LoginTest extends BaseTest{
	HomePage hp;
	LoginPage lp;
	
	@Test(dataProvider = "logInData", dataProviderClass = DP.class, priority = 1)
	public void validLoginTest(String email, String password, String name)
	{
		hp = new HomePage(driver);
		hp.clickLogin();
		
		lp = new LoginPage(driver);
		lp.logIn(email, password);
		
	
		Assert.assertTrue(lp.getMessage().contains(name));
	}
	
	@Test(dataProvider = "invalidLogInData", dataProviderClass = DP.class, priority = 2)
	public void inValidLoginTest(String email, String password, String name)
	{
		hp = new HomePage(driver);
		hp.clickLogin();
		
		lp = new LoginPage(driver);
		lp.logIn(email, password);

		Assert.assertEquals(lp.getMessage(),"Your email or password is incorrect!");
		
	}
}
