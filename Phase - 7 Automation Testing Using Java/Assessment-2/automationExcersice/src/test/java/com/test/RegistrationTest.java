package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.RegistrationPage;

public class RegistrationTest extends BaseTest{
	
	HomePage hp;
	LoginPage lp;
	RegistrationPage rp;
	
	@Test(dataProvider = "signUpData", dataProviderClass = DP.class, priority = 1)
	public void validRegistration(String email, String password, String name)
	{
		hp = new HomePage(driver);
		hp.clickLogin();
		
		lp = new LoginPage(driver);
		lp.signUp(name, email);
		
		rp = new RegistrationPage(driver);
		rp.signup("Mr.", password, name, "M", "Address", "India", "Salem", "TN", "637501", "9092174486");
	
		Assert.assertEquals(rp.getMessage(),"Account Created!");
	}
	
	@Test(dataProvider = "signUpData", dataProviderClass = DP.class, priority = 2)
	public void inValidRegistrationWithExistingData(String email, String password, String name)
	{
		hp = new HomePage(driver);
		hp.clickLogin();
		
		lp = new LoginPage(driver);
		lp.signUp(name, email);
		
		rp = new RegistrationPage(driver);
		rp.signup("Mr.", password, name, "M", "Address", "India", "Salem", "TN", "637501", "9092174486");
		
		Assert.assertEquals(rp.getMessage(),"Email Address already exist!");
		
	}
}
