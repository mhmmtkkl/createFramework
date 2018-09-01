package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	private Driver() {
	}

	private static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null) {
			switch (ConfigurationReader.getProperty("browser")) {

			case "chrome":
				WebDriverManager.chromedriver().setup();

				driver = new ChromeDriver();

				break;
			
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				
				break;
				
			default: 
				WebDriverManager.chromedriver().setup();

				driver = new ChromeDriver();
			}
		}
		return driver;
	}
	
	public static void closeDriver() {
		if(driver != null) {
			driver.quit();
			driver =null;
		}
	}

}
