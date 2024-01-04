
package StepDefinitions;

import org.openqa.selenium.WebDriver;
import PageFactory.ProductsPage;
import Utility.TestContextSetup;
import io.cucumber.java.en.*;

public class ProductsPageStepDefinition {

	WebDriver driver;
	ProductsPage prdPage;
    TestContextSetup testcontextsetup;
	
    public ProductsPageStepDefinition (TestContextSetup testcontextsetup) {
		this.testcontextsetup = testcontextsetup;
		prdPage = testcontextsetup.pagecreationmanager.getProductsPage();
	}
	

	@Then("User navigates to home page")
	public void user_navigates_to_home_page() {
		
		prdPage.isProdNameDisplayed();
	}
	@Then("User added the product {string} to the cart")
	public void user_added_the_product_to_the_cart(String string) {
		prdPage.clickonAddToCart();
		testcontextsetup.prdName = prdPage.getPrdname();
	}
	@Then("User clicked on Cart icon")
	public void user_clicked_on_cart_icon() {
		prdPage.clickonShoppingCart();
	}

}
