package api.services;

import api.endpoints.Routes;
import api.payload.Note;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class NotesServive {
	
	public static Response createNoteService(Note payload, boolean isAuthRequired) {
		
		Response response = BaseService.request(isAuthRequired)
							.when()
							.contentType(ContentType.JSON)
							.body(payload)
							.post(Routes.CREATE_NOTE_URL);
		
		return response;
	}
}
