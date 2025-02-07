package Step;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class All_Http_E2EMethods {

	private RequestSpecification httpRequest;
	private String requestBody;
	private Response response;
	private String responseBody;

	@Given("Configure base URI")
	public void configure_base_uri() {

		RestAssured.baseURI = "http://localhost:3000/employees";

	}

	@Given("User create the object of RequestSpecification Interface")
	public void user_create_the_object_of_request_specification_interface() {
		httpRequest = RestAssured.given();

	}

	@Given("User create the hearder with content Type")
	public void user_create_the_hearder_with_content_type() {
		httpRequest.header("Content-Type", "application/json");

	}

	@Given("User create the request body for the POST Request")
	public void user_create_the_request_body_for_the_post_request() {

//		Need to add json RestAssured simple dependancy
		JSONObject json = new JSONObject();
		json.put("firstName", "Prasad");
		json.put("lastName", "Ghule");
		json.put("address", "Pune");
		json.put("mobileNumber", 7777777777f);
		json.put("gender", "M");

		requestBody = json.toString();

	}

	@Given("User add http request body to http POST Request")
	public void user_add_http_request_body_to_http_post_request() {

		httpRequest.body(requestBody);
	}

	@When("User selects the http POST request")
	public void user_selects_the_http_post_request() {

		response = httpRequest.post();

	}

	@Then("User get the status code")
	public void user_get_the_status_code() {

		int status_code = response.getStatusCode();
		System.out.println(status_code);
	}

	@Then("User get the status line")
	public void user_get_the_status_line() {
		String status_line = response.getStatusLine();
		System.out.println(status_line);
	}

	@Then("user get the reponse Time")
	public void user_get_the_reponse_time() {
		long status_time = response.getTime();
		System.out.println(status_time);
	}

	@Then("user get the response header")
	public void user_get_the_response_header() {
		Headers Allheaders = response.getHeaders();

		for (Header hr : Allheaders) {
			System.out.println(hr.getName() + "   ::    " + hr.getValue());
		}
	}

	@Then("user get the response body")
	public void user_get_the_response_body() {
		responseBody = response.getBody().asString();
		System.out.println(responseBody);
	}

	private static String id;

	@Then("User capture ID from the response")
	public void user_capture_id_from_the_response() {
//	Create the jsonpath object RestAssured

		JsonPath jsonPath = new JsonPath(responseBody);
		id = jsonPath.getString("id");
		System.out.println(id);
	}

	@When("User selects the http GET request")
	public void user_selects_the_http_get_request() {
		response = httpRequest.get(id);

	}
	
	String putrequestBody;

	@Given("User create the request body for the PUT Request")
	public void user_create_the_request_body_for_the_put_request() {
	    
		JSONObject json = new JSONObject();
		json.put("firstName", "NewValue");
		json.put("lastName", "New Ghule");
		json.put("address", "Mumbai");
		json.put("mobileNumber", 1111117777f);
		json.put("gender", "M");

		putrequestBody = json.toString();
	}

	@Given("User add http request body to http PUT Request")
	public void user_add_http_request_body_to_http_put_request() {
		httpRequest.body(putrequestBody);

	}

	@When("User selects the http PUT request")
	public void user_selects_the_http_put_request() {

		response = httpRequest.put(id);

	}
	
	@When("User selects the http Delete request")
	public void user_selects_the_http_delete_request() {

		response=httpRequest.delete(id);

		
	}

}
