package test;

import utilities.ExcelUtils;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DPExceldata {
  
  @DataProvider(name = "invalidDataSet")
  public static Object[][] invalidDataProvider() throws IOException
	{
		String[][] data = ExcelUtils.getData("dataset.xlsx", "Sheet1");
		return data;
	}
  
  @DataProvider(name = "validDataSet")
  public static Object[][] validDataProvider() throws IOException
	{
		String[][] data = ExcelUtils.getData("dataset.xlsx", "Sheet2");
		return data;
	}
}
