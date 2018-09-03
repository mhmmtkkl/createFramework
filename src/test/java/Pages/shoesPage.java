package Pages;

import java.util.List;

import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class shoesPage {
	
private WebDriver driver;
	
	public shoesPage() {
		this.driver= Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@class='priceSell']")
	public WebElement priceofShoes;
	
	
  
//	public void  getListOfelemnt() {
//		listOfElement.size();
//	 }
		 
 
	  
	  
	  
	  
	  
}
