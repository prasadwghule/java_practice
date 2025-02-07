package API_Democlass1;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class API_Serialisations {
	
	public static void main(String[] args) {
		
	RestAssured.baseURI="http://localhost:3000/customers";
	RequestSpecification httpRequest= RestAssured.given();
	httpRequest.header("Content-Type", "Application/json");
	
		
	}
	
	
	

}
