package skill2Develop.com.apiim;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class getStatus {
	
	
	@Test
	public void getReq() {
		
		Response response = get("https://simple-books-api.glitch.me/status");
		
		int statusCode = response.getStatusCode();
		
		System.out.println("status Code is -----> "+ statusCode);
		
		Assert.assertEquals(statusCode, 200);
		
		response.prettyPrint();
		
		String ResponseText = response.asString();
		
		System.out.println(ResponseText);
		
		System.out.println(response.getTime());
		
		
		String Status = response.getBody().jsonPath().get("status");
		
		System.out.println(Status);
		
		Assert.assertEquals(Status, "OK");
		
		
	}

}
