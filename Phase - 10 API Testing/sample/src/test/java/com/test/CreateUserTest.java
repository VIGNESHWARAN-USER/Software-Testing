package com.test;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateUserTest {
	
	@Test
	public void createUser() {
		Map<String, Object> payload = new HashMap<>();
		
		payload.put("title", "My first post");
		payload.put("body", "Learning Rest Assued");
		payload.put("userId", 1);
		
		Response res = RestAssured.given()
				.contentType(ContentType.JSON)
				.body(payload)
				.when()
				.post("https://jsonplaceholder.typicode.com/posts");
		
		System.out.println("Status code: "+res.statusCode());
		res.prettyPrint();
		
	}
}
