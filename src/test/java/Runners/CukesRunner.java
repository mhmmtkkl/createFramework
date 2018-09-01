package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
 

@CucumberOptions(
		
		
		features="src/test/feature/",
		glue="src/test/java/StepDefinitions/",
		dryRun=false
		
		
		)




public class CukesRunner extends AbstractTestNGCucumberTests {

}
