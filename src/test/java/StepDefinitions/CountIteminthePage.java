package StepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pages.HomePage;
import Pages.shoesPage;
import Utilities.ConfigurationReader;
import Utilities.Driver;
 
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CountIteminthePage {
	
	 WebDriver driver=Driver.getDriver();
	HomePage HP = new HomePage();
	shoesPage SP = new shoesPage();
	
	
	@Given("^I am at home page in my page$")
	public void i_am_at_home_page_in_my_page() {
	    driver.get(ConfigurationReader.getProperty("QVChomePage"));
	}
 
	@When("^I click on shoes icon$")
	public void i_click_on_shoes_icon() {
		HP.shoesIcon.click();
	}

	@Then("^I should be able to count how many item in the page$")
	public void i_should_be_able_to_count_how_many_item_in_the_page() {
		 List<WebElement>  listOfElement= driver.findElements(By.xpath("//span[@class='priceSell']"));
		 System.out.println(listOfElement.size());
	   
	}
}
