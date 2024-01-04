package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageFactory.CartPage;
import PageFactory.CheckoutPage;
import PageFactory.ProductsPage;
import Utility.TestContextSetup;
import io.cucumber.java.en.Then;

public class CheckoutPageStepDefinition {
	WebDriver driver;
	CheckoutPage chkoutPage;
	CartPage cartpage;
	ProductsPage prdPage;
	String prdName;
    String cartPrdName;
    String chkoutPrdname;
    TestContextSetup testcontextsetup;
	
    public CheckoutPageStepDefinition (TestContextSetup testcontextsetup) {
 		this.testcontextsetup = testcontextsetup;
 		chkoutPage = testcontextsetup.pagecreationmanager.getCheckOutPage();
 	}
	
	@Then("User provided {string} {string} {string} in the checkout page")
	public void user_provided(String firstname, String secondname, String postalcode) {
	    
	    chkoutPage.enterInformation(firstname, secondname, postalcode);
	}
	@Then("User click on continue")
	public void user_click_on_continue() {
	   chkoutPage.clickOnContinue();
	}
	@Then("User verifed that added product name is displayed correctly in the checkout screen")
	public void user_verifed_that_added_product_name_is_displayed_correctly_in_the_checkout_screen() {
		chkoutPrdname = chkoutPage.getChkoutPrdName();
		Assert.assertEquals(testcontextsetup.prdName, chkoutPrdname, testcontextsetup.cartPrdName);
	}
	@Then("User clicks on finish")
	public void user_clicks_on_finish() {
		chkoutPage.clickOnFinish();
	  
	}
	@Then("User verifies the order confirmation message")
	public void user_verifies_the_order_confirmation_message() {
		chkoutPage.verifyMsg();
	}
}
