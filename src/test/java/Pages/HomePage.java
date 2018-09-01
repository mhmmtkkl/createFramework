package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class HomePage {
private WebDriver driver;
	
	public HomePage() {
		this.driver= Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input [@name='q']")
	public WebElement search ;
	
}
