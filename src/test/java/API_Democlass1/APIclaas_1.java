package API_Democlass1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIclaas_1 {
	
	public static void main(String[] args) {
	
//		Set the base url
		RestAssured.baseURI="http://localhost:3000/employees";
		
//		Get the RequestSpecification interface object so we can select the get method
		RequestSpecification httpRequest = RestAssured.given();
		//Step 3: select the HTTP GET Request
		
		Response response = httpRequest.get();
		
		//step 4: capture status code
		int a = response.getStatusCode();
		System.out.println(a);
		
		//step 5: capture status line
		String b = response.getStatusLine();
		System.out.println(b);
		
		//step 6: capture response time
		long c = response.getTime();
		System.out.println(c);
		
		//step 7" capture response body
		String d = response.getBody().asString();
		System.out.println(d);
				
		
	}

}
