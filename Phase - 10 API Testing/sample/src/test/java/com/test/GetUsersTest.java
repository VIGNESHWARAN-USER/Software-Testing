package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetUsersTest {
	
	@Test
	public void getUserTest()
	{
		int id = 1;
		Response res = RestAssured.given()
				.when()
				.get("https://jsonplaceholder.typicode.com/users/"+id);
		
		System.out.println("Status code: "+res.statusCode());
		res.prettyPrint();
		Assert.assertEquals(res.statusCode(), 200);
		Assert.assertTrue(res.jsonPath().getString("id").equals(""+id));
	}
}
