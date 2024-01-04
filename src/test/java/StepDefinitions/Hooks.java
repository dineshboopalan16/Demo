package StepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utility.TestContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;


public class Hooks {
	WebDriver driver;
	TestContextSetup testcontextsetup;
	public Hooks(TestContextSetup testcontextsetup) {
		this.testcontextsetup = testcontextsetup;
	}
	@After
	public void closeBrowser() throws IOException {
	testcontextsetup.testbase.WebDriverManager().quit();
	}
	@AfterStep
    public void addScreenshot(Scenario scenario) throws IOException {
		WebDriver driver = testcontextsetup.testbase.WebDriverManager();
		if(scenario.isFailed()) 
		{
			File sourcepath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(sourcepath);
			scenario.attach(fileContent, "image/png", "image");
			
		}
    	
    }
}
