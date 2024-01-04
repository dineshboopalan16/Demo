package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageFactory.LoginPage;
import Utility.TestContextSetup;
import io.cucumber.java.en.*;

public class LoginPageStepDefinition {

	WebDriver driver;
	LoginPage login;
	TestContextSetup testcontextsetup;
	
	public LoginPageStepDefinition (TestContextSetup testcontextsetup) {
		this.testcontextsetup = testcontextsetup;
		login = testcontextsetup.pagecreationmanager.getLoginPage();
	}
	

	@Given("User launches saucedemo webpage")
     public void user_launches_saucedemo_webpage() throws IOException {
		testcontextsetup.testbase.WebDriverManager();
	}

	@When("User enter {string}")
	public void user_enter(String username) {
		
	    
		login.enterUsername(username);
	}

	@When("User enters {string}")
	public void user_enters(String password) {
		login.enterPassword(password);
	}

	@Then("User clicks on login button")
	public void user_clicks_on_login_button() {
		login.clickLogin();

	}
	

}
