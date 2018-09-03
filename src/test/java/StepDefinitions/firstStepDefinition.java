package StepDefinitions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Pages.HomePage;
import Utilities.Driver;
 
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class firstStepDefinition {

	private WebDriver driver = Driver.getDriver();
	HomePage hp = new HomePage();
	
   
	@Given("^I am at login page in my page$")
	public void i_am_at_login_page_in_my_page() {
		driver.get("https://www.google.com/");
	}

	 
	@Given("^I wrote username as this Password is like that$")
	public void i_wrote_username_as_this_Password_is_like_that() {
		 hp.search.sendKeys("q7"+Keys.ENTER);
	}

	 
	@When("^I am clicking login button$")
	public void i_am_clicking_login_button() {
		 assertTrue(driver.getTitle().equals("q7 - Google Search"));
	}
	 
	@Then("^I am in home page$")
	public void i_am_in_home_page() {
		assertTrue(driver.getTitle().equals("q7 - Google Search"));
	}
	 

}
