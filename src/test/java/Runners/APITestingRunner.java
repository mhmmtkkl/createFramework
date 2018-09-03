package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin = {"pretty", 
				"html:target/cucumbe r-report",
				"json:target/cucumber.json"
		},
		 tags ="@API",
		features= {"src/test/feature/myFeauteFile/"},
		glue="StepDefinitionAPI/" ,
		dryRun=false
		  
		)
 
public class APITestingRunner extends AbstractTestNGCucumberTests {

}

 
