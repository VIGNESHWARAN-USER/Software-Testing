package tests;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class UsingJSONFile {
	@Test
	public void createUserUsingJSONFile() throws FileNotFoundException {
		
		FileReader reader = new FileReader("src/test/resources/user.json");
		
		JSONTokener jt = new JSONTokener(reader);
		JSONObject payload = new JSONObject(jt);
		
		
		RestAssured.given()
				.contentType(ContentType.JSON)
				.body(payload.toString())
				.when()
				.post("http://localhost:5000/api/auth/register")
				.then()
				.statusCode(201)
				.log().all();
		
	}
}
