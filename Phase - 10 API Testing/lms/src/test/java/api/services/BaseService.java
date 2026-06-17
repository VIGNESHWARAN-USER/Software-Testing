package api.services;

import io.restassured.specification.RequestSpecification;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import api.utilities.TestContext;
import api.endpoints.Routes;

public class BaseService {
	
	public static RequestSpecification request() {

	    RequestSpecification request =
	            RestAssured
	            .given()
	            .baseUri(Routes.BASE_URL);

	    if(TestContext.getToken() != null) {
	        request.header("Authorization","Bearer "+TestContext.getToken());
	    }
	    
	    return request;
	}
	
	
}