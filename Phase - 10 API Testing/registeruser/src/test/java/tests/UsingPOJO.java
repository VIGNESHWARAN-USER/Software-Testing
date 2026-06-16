package tests;

import org.testng.annotations.Test;

import classes.User;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class UsingPOJO {
	@Test
	public void createUserUsingPOJO() {
		
		User user = new User();
		user.name = "Jagadeep";
		user.email = "user1@gmail.com";
		user.password = "user123";
		user.role = "user";
		
		RestAssured.given()
				.contentType(ContentType.JSON)
				.body(user)
				.when()
				.post("http://localhost:5000/api/auth/register")
				.then()
				.statusCode(201)
				.log().all();
		
	}
}
