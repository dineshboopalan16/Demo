package TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="@E2ETest",
                 features = {"src/test/resources/Features"},
                 glue = "StepDefinitions",
                 plugin = {"pretty", "html:target/htmlresults.html",
                		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                		   "rerun:target/failed_scenarios.txt"}
		)

public class CucumberTestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
	
}
