package tests;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class UsingMap {
	@Test
	public void createUserUsingMap() {
		Map<String, Object> payload = new HashMap<>();
		
		payload.put("name", "Jagadeep");
		payload.put("email", "user2@gmail.com");
		payload.put("password", "user123");
		payload.put("role", "user");
		
		RestAssured.given()
				.contentType(ContentType.JSON)
				.body(payload)
				.when()
				.post("http://localhost:5000/api/auth/register")
				.then()
				.statusCode(201)
				.log().all();
		
	}
}
