package APITEST;



import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import org.testng.annotations.Test;

import API_TESTING_.API_TESTING_.ExtentTestManager;
import com.relevantcodes.extentreports.LogStatus;

public class DeleteRequest {

	
	@Test
	public static void putRequest()
	{
		
	String url="https://reqres.in/api/users/2";
		RestAssured.baseURI=url;
		
		//Response url = RestAssured.get("https://reqres.in/api/users/2");
		
		ValidatableResponse response = RestAssured.given().when().
				header("Content-Type", "application/json").delete().then();
		
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "URL is: " +url);
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Response is: " +response.extract().asString());
		response.statusCode(201);
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Have verified the Status Code Successfully !!");
		response.contentType(ContentType.JSON);
		
		//Implement verification logic as per previous example
	}


}
