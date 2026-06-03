package com.test;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;

public class LoginTest extends BaseTest{


	@Test
	public void loginTest() {

		loginPage = new LoginPage(driver);

		String loginTitle = "Login";

		Assert.assertEquals(loginPage.getTitleText(), loginTitle);

	}

}
