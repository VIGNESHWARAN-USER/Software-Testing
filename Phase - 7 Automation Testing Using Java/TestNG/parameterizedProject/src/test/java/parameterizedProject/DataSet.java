package parameterizedProject;

import org.testng.annotations.DataProvider;

public class DataSet {
	
	@DataProvider(name = "testData", parallel = false)
	public Object[][] dataProvider(){
		return new Object[][]{{"admin","admin123"},{"admin", "admin234"},{"admin", "admin456"}};
	}
}
