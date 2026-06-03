package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.ProductsPage;

public class ProductsTest extends BaseTest{
	
	ProductsPage pp;
	
	
	@Test(dataProvider = "validSearchKeys", dataProviderClass = DP.class)
	public void validSearchTest(String searchKey)
	{
		pp = new ProductsPage(driver);
		Assert.assertTrue(pp.isSearchKeyValid(searchKey));
	}
	
	@Test(dataProvider = "invalidSearchKeys", dataProviderClass = DP.class)
	public void invalidSearchTest(String searchKey)
	{
		pp = new ProductsPage(driver);
		Assert.assertTrue(pp.isSearchKeyInvalid(searchKey));
	}
}
