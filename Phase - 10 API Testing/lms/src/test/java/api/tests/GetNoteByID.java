package api.tests;

import org.testng.annotations.Test;

import static org.hamcrest.Matchers.*;
import api.services.NotesService;
import api.utilities.TestContext;
import io.restassured.response.Response;

public class GetNoteByID {
	
	@Test(dependsOnMethods = "api.tests.CreateNoteTest.validCreateNoteTest")
	public void getNoteByValidId(){
		Response response = NotesService.getNoteById(true, TestContext.getNoteId());
		
		response.then()
				.statusCode(200)
				.body("success", equalTo(true))
				.body("data._id", equalTo(TestContext.getNoteId()));
		
	}
	
	@Test(dependsOnMethods = "api.tests.LoginTest.validLoginTest")
	public void getNoteByInvalidId(){
		Response response = NotesService.getNoteById(true, "INVALID_ID");
		
		response.then()
				.statusCode(404)
				.body("success", equalTo(false))
				.body("message", equalTo("Note Not Found"));
		
	}
	
	@Test
	public void getNoteWithoutToken(){
		Response response = NotesService.getNoteById(false, "DUMMY_ID");
		
		response.then()
				.statusCode(401);
		
	}
}