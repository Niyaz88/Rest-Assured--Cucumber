package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Utils {
	
	RequestSpecification reqSpec;
	
	public RequestSpecification requestSpecification(String keyValue) throws IOException
	{
		PrintStream logging = new PrintStream(new FileOutputStream("logging.txt"));
		reqSpec  = new RequestSpecBuilder().setBaseUri(getPropertyValue("baseUrl")).addQueryParam("apikey", keyValue)
				.addFilter(RequestLoggingFilter.logRequestTo(logging))
				.addFilter(ResponseLoggingFilter.logResponseTo(logging))
				.setContentType(ContentType.JSON).build();
		return reqSpec;
	}
	
	public String getPropertyValue(String key) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream("src/test/java/resources/config.properties");
		prop.load(fs);
		return prop.getProperty(key);		
	}
	
	public String getJsonPath(Response response,String key)
	{
		  String resp=response.asString();
		JsonPath   js = new JsonPath(resp);
		return js.get(key).toString();
	}

}
