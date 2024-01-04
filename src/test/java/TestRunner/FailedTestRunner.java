package TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="",
                 features = {"@target/failed_scenarios.txt"},
                 glue = "StepDefinitions",
                 plugin = {"pretty", "html:target/htmlresults.html",
                		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                		  }
		)

public class FailedTestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
	
}
