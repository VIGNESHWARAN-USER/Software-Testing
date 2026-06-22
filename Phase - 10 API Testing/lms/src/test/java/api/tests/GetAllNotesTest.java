package api.tests;

import org.testng.annotations.Test;

import api.services.NotesServive;

import static org.hamcrest.Matchers.*;
import io.restassured.response.Response;

public class GetAllNotesTest {
	
	@Test(dependsOnMethods = "api.tests.LoginTest.validLoginTest")
	public void getAllNodesWithValidParamsTest() {
		
		Response response = NotesServive.getAllNotes(true, 1, 10, "asc", "title");
		
		response
		.then()
		.statusCode(200)
		.body("success", is(true))
		.body("data", notNullValue())
		.body("pagination", notNullValue());
	}
	
	@Test(dependsOnMethods = "api.tests.LoginTest.validLoginTest")
	public void getAllNodesWithNoParamsTest() {
		
		Response response = NotesServive.getAllNotesWithNoParams(true);
		
		response
		.then()
		.statusCode(200)
		.body("success", is(true))
		.body("data", notNullValue())
		.body("pagination", notNullValue());
		
		response.prettyPrint();
		System.out.println(response.jsonPath().getList("data").size());
	}
	
	@Test(dependsOnMethods = "api.tests.LoginTest.validLoginTest")
	public void getAllNodesWithInvalidParamsTest() {
		
		Response response = NotesServive.getAllNotes(true, -500, -100, "abc", "abc");
		
		response
		.then()
		.statusCode(200)
		.body("success", is(true))
		.body("data", notNullValue())
		.body("pagination", notNullValue());
		
		response.prettyPrint();
	}
	
	@Test
	public void getAllNodesWithoutToken() {
		
		Response response = NotesServive.getAllNotes(true, 1, 10, "desc", "title");
		
		response
		.then()
		.statusCode(401);
	}
	
}
