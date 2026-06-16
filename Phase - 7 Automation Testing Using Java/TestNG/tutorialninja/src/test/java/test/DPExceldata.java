package test;

import utilities.ExcelUtils;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DPExceldata {
  
  @DataProvider(name = "validDataSet")
  public static Object[][] validDataProvider() throws IOException
	{
		String[][] data = ExcelUtils.getData("dataset.xlsx", "Sheet1");
		return data;
	}
  
  @DataProvider(name = "invalidDataSet")
  public static Object[][] invalidDataProvider() throws IOException
	{
		String[][] data = ExcelUtils.getData("dataset.xlsx", "Sheet2");
		return data;
	}
  
  @DataProvider(name = "validSearchDataSet")
  public static Object[][] validSearchDataProvider() throws IOException
	{
		String[][] data = ExcelUtils.getData("dataset.xlsx", "Sheet3");
		return data;
	}
  
  @DataProvider(name = "invalidSearchDataSet")
  public static Object[][] invalidSearchDataProvider() throws IOException
	{
		String[][] data = ExcelUtils.getData("dataset.xlsx", "Sheet4");
		return data;
	}
}
