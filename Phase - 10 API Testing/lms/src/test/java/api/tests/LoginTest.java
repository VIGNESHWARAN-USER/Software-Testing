package api.tests;

import org.testng.annotations.Test;



import api.dataproviders.*;
import api.payload.LoginRequest;

import api.services.LoginService;
import api.utilities.ConfigReader;
import static org.hamcrest.Matchers.*;
import io.restassured.response.Response;

public class LoginTest {
	
	@Test
	public void validLoginTest()
	{
		LoginRequest payload = new LoginRequest(ConfigReader.getProperty("admin.email"), ConfigReader.getProperty("admin.password"));
		
		Response response = LoginService.loginservice(payload);
		response
		.then()
		.statusCode(201)
		.body("token", notNullValue())
		.body("message[0].key", equalTo("success"))
		.body("message[0].value", equalTo("Admin logged in successfully"));
	}
	
	@Test(dataProvider = "invalidLoginData" ,dataProviderClass = InvalidLoginDataProvider.class)
	public void invalidLoginTest(String testcase, String email, String password)
	{
		LoginRequest payload = new LoginRequest(email, password);
		
		Response response = LoginService.loginservice(payload);
		response
		.then()
		.statusCode(400);
	}
}
