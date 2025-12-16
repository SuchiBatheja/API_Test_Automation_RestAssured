
import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class BasicsGETMethodAutomation {

	public static void main(String[] args) {
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		given().log().all().queryParam("key", "qaclick123")
		.queryParam("place_id", "a1c536602942a9e36dc2e9323cc62bf6")
		.header("Content-Type","application/json")
		
		.when().post("maps/api/place/get/json")
		.then().log().all().assertThat().statusCode(200);
		
		
		System.out.println("GET Request Submitted successfully");
		
		System.out.println("GET Request Submitted successfully2");
		
		
		
		

		
		
	}

}
