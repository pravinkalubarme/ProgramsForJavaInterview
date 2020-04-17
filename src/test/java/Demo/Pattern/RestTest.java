package Demo.Pattern;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.hamcrest.collection.HasItemInArray;

public class RestTest {
	public static void main(String[] args) {
		
		RestAssured.baseURI="https://reqres.in/api";
		
		HashMap<String, String> authentication= new HashMap<String, String>();
		authentication.put("name", "morpheus");
		authentication.put("job", "leader");
		
		Response response = given().with().body(authentication).when().post("/users");
		System.out.println(response.asString());
		
	}
}
