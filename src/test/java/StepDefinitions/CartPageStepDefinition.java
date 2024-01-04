package StepDefinitions;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageFactory.CartPage;
import PageFactory.ProductsPage;
import Utility.TestContextSetup;
import io.cucumber.java.en.Then;

public class CartPageStepDefinition {
	CartPage cartpage;
	ProductsPage prdPage;
	String prdName;
    String cartPrdName;
	WebDriver driver;
    TestContextSetup testcontextsetup;
	
   public CartPageStepDefinition (TestContextSetup testcontextsetup) {
		this.testcontextsetup = testcontextsetup;
		cartpage = testcontextsetup.pagecreationmanager.getCartPage();
	}
	@Then("User verifed that added product name is displayed correctly in the cart screen")
	public void user_verifed_that_added_product_name_is_displayed_correctly_in_the_cart_screen() {
		
		testcontextsetup.cartPrdName = cartpage.getCartPrdName();
		Assert.assertEquals(testcontextsetup.prdName, testcontextsetup.cartPrdName);
	}
	@Then("User clicked on Checkout")
	public void user_clicked_on_checkout() {
	   cartpage.clickOnCheckOut();
	}
}
