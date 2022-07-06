package skill2Develop.com.apiim;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class postOrder {
	
	@Test
	public void test1() {
	
	RequestSpecification request = given();
			
	request.header("Content-Type","application/json");
	
	
	//JSONObject reqParam = new JSONObject();
		//reqParam.put("clientName", "soniac");
		//reqParam.put("clientEmail", "soniac@gmail.com");
	
		//request.body(reqParam.toJSONString());
		//Response res = request.post("https://simple-books-api.glitch.me/api-clients/");
		//String AuthToken = res.getBody().jsonPath().get("accessToken");
		
		//System.out.println("Accesstoke ----"+AuthToken);
		
		String order= "{\n" + 
				"  \"bookId\": 1,\n" + 
				"  \"customerName\": \"Sonia23535\"\n" + 
				"}";
		
		
		request.header("Authorization","b3b4e37da792cec70b2b42cd1c2648a99fd3518efa5a90eaacc3c43bdd9b094e");
		request.body(order);
		request.log().all();
		Response orderRes = request.post("https://simple-books-api.glitch.me/orders");
		
		orderRes.prettyPrint();

	
		
	}

	
}
