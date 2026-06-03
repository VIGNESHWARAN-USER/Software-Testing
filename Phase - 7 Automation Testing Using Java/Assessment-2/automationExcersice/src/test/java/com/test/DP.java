package com.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.utils.ExcelData;

public class DP {
	
	@DataProvider(name = "signUpData")
	public Object[][] signUpData() throws IOException
	{
		return ExcelData.getData("dataset.xlsx", "SignUp");
	}
	
	@DataProvider(name = "logInData")
	public Object[][] logInData() throws IOException
	{
		return ExcelData.getData("dataset.xlsx", "Login");
	}
	
	@DataProvider(name = "invalidLogInData")
	public Object[][] invalidLogInData() throws IOException
	{
		return ExcelData.getData("dataset.xlsx", "InvalidLogin");
	}
	
	@DataProvider(name = "validSearchKeys")
	public Object[][] validSearchKeys() throws IOException
	{
		return ExcelData.getData("dataset.xlsx", "ValidSearchKeys");
	}
	
	@DataProvider(name = "invalidSearchKeys")
	public Object[][] invalidSearchKeys() throws IOException
	{
		return ExcelData.getData("dataset.xlsx", "InvalidSearchKeys");
	}
}

