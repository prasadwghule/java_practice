package API_Democlass1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIClass__2 {
	
	public static void main(String[] args) {
		//Set BAseURI
		RestAssured.baseURI="http://localhost:3000/employees";
		
//		Create theobject of the RequestSpecification Interface so we use the http get method
		RequestSpecification httpRequest=RestAssured.given();
		
//		Use the get method
		Response response= httpRequest.get();
		
//		Get the status coede
		System.out.println(response.getStatusCode());
		
//		Get the statu line
		String Status_line= response.getStatusLine();
		System.out.println(Status_line);
		
		
		
		
		
	}

}
