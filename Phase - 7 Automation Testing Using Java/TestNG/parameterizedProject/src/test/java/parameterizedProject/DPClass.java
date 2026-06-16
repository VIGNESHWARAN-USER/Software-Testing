package parameterizedProject;

import org.testng.annotations.DataProvider;

public class DPClass {
  
	@DataProvider(name = "testData", parallel = true)
	public Object[][] dataProvider(){
		return new Object[][]{{"Selenium"},{"TestNG"}};
	}
}
