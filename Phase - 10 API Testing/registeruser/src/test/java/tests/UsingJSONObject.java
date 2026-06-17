package tests;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class UsingJSONObject {
	@Test
	public void createUserUsingJSONObject() {
		JSONObject payload = new JSONObject();
		
		payload.put("name", "Jagadeep");
		payload.put("email", "user3@gmail.com");
		payload.put("password", "user123");
		payload.put("role", "user");
		
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
