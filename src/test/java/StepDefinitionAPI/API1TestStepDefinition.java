package StepDefinitionAPI;

import java.util.HashMap;
import java.util.Map;

import Utilities.ConfigurationReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

public class API1TestStepDefinition {

	
	Map <Object,Object> myExpectedResult= new HashMap<Object,Object>();
	Response response;
	Map <Object,Object> myActualResult= new HashMap<Object,Object>();
	
		
	
	@Given("^I create map and store data in the map$")
	public void i_create_map_and_store_data_in_the_map() {
		myExpectedResult.put("department_id", 539);
		myExpectedResult.put("department_name", "IT department");
		myExpectedResult.put("location_id", 1700);
		
		
	}

	@Given("^I create response class and get my data from API server$")
	public void i_create_response_class_and_get_my_data_from_API_server() {
		response = given().accept(ContentType.JSON)
				.when().get(ConfigurationReader.getProperty("APIurl")+"/departments/539");
	}

	@Given("^I check status code as \"([^\"]*)\"$")
	public void i_check_status_code_as(String arg1) {
	   assertEquals(response.statusCode(), 200);
	}

	@When("^I deserialize code from JSON to java$")
	public void i_deserialize_code_from_JSON_to_java() {
		myActualResult=response.body().as(Map.class);
	}

	@Then("^I check my expected data and actual data should be same$")
	public void i_check_my_expected_data_and_actual_data_should_be_same() {
			assertEquals(myExpectedResult.get("department_id"), myActualResult.get("department_id"));
			assertEquals(myExpectedResult.get("department_name"), myActualResult.get("department_name"));
			assertEquals(myExpectedResult.get("location_id"), myActualResult.get("location_id"));
	}
}
