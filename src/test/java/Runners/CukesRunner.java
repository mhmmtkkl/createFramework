package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
 

@CucumberOptions(
		plugin = {"pretty", 
				"html:target/cucumbe r-report",
				"json:target/cucumber.json"
		},
		 
		features= {"src/test/feature/myFeauteFile/"},
		glue="StepDefinitions/" ,
		dryRun=false
		  
		)
 
public class CukesRunner extends AbstractTestNGCucumberTests {

}
