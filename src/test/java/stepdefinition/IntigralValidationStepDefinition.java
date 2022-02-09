package stepdefinition;

import static io.restassured.RestAssured.given;
import java.io.File;
import java.io.IOException;
import static org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.ApiEnum;
import resources.Utils;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class IntigralValidationStepDefinition extends Utils  {
	Response response;	
	ResponseSpecification respSpec;
	RequestSpecification resp;
	JsonPath js;
	
	
	@Given("the Intigral endpoint url with the apikey (.*)")
	public void the_Intigral_endpoint_url_with_the_apikey(String value) throws IOException {		
		
		resp = given().spec(requestSpecification(value));
	}

	@When("the user calls the {string} with GET http request")
	public void the_user_calls_the_with_GET_http_request(String resource) {
	    		
		ApiEnum resourceApi = ApiEnum.valueOf(resource);
		
		respSpec = new ResponseSpecBuilder().expectContentType(ContentType.JSON).build();
		
	   response = resp.when().get(resourceApi.getResource())
			   .then().spec(respSpec).extract().response();
	   System.out.println(response.getStatusCode());
	}

	@Then("the API call got the status code {int}")
	public void the_API_call_got_success_with_status_code(int statusCode) {
	    
		assertEquals(response.getStatusCode(),statusCode);	
	}
	
	@Then("the API response schema should be in expected format")
	public void the_API_response_schema_should_be_in_expected_format() {		
		response.then().assertThat().log().all().body(JsonSchemaValidator.matchesJsonSchema(new File("src/test/java/resources/IntigralSchema.json")));		   
		}
	
	@Then("{string} in response body is {string}")
	public void in_response_body_is(String keyValue, String Expectedvalue) {
	    	
	String actualValue = getJsonPath(response,"error."+keyValue+"");		
	assertEquals( actualValue, Expectedvalue);
	}
	
	@Then("check the (.*) parameter should not be null")
	public void check_the_parameter_should_not_be_null(String key) {
		
		String value = getJsonPath(response,"error."+key+"");
		int count = value.length();		
		assertTrue("The length of the parameter is greater than 0", count>0);
	            
	}
	
	@Then("the user should see the (.*) parameter values under promotions array in the response")
	public void the_user_should_see_the_parameter_values_under_promotions_array_in_the_response(String parameter) {
		String respo = response.asString();		
		boolean result = false;
	    js = new JsonPath(respo);
	    int count = js.getInt("promotions.size()");
	   switch(parameter)
	   {
	   case "promoType":	   
	    for(int i=0;i<=count-1;i++)
	    {
	    	String programName = js.get("promotions["+i+"]."+parameter+"");
	    	System.out.println(programName);
	    	if(programName.equals("EPISODE") || programName.equals("SERIES") || programName.equals("SEASON") || programName.equals("MOVIE"))
	    	{
	    	result = true;
	    	break;
	    	}	    	
	    }
	    assertTrue(result);
	    break;
	   case "promotionId":
		   for(int i=0; i<=count-1;i++)		   
			   assertNotNull("sds", js.get("promotions["+i+"]."+parameter+""));
		   default:
	   }
	}
}
	