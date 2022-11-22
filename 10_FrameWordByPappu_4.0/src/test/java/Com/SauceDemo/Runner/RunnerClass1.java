 package Com.SauceDemo.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"Features/LogInCheckoutLogout.feature","Features/NegativeTestCases.feature"},
		glue = {"Com.SauceDemo.StepDef","Com.SauceDemo.Hooks"},
		plugin = {"pretty","json:target/cucumber.json"},
		dryRun = false,
		monochrome = true
		)

public class RunnerClass1 extends AbstractTestNGCucumberTests{
	
	

}
