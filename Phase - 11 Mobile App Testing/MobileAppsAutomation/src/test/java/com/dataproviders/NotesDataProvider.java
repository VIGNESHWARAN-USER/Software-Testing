package com.dataproviders;

import org.testng.annotations.DataProvider;

import com.utilities.ExcelReader;

public class NotesDataProvider {
	
	@DataProvider(name = "notesData")
	public Object[][] getNotesData() {
		String filePath = "/src/test/resources/TestData.xlsx";
		String sheetName = "Sheet1";
		
		return ExcelReader.getTestData(filePath, sheetName);
	}
}
