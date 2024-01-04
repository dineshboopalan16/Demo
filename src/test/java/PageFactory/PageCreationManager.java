package PageFactory;

import org.openqa.selenium.WebDriver;

public class PageCreationManager {
	public LoginPage loginpage;
	public ProductsPage productspage;
	public CartPage cartpage;
	public CheckoutPage checkoutpage; 
	public WebDriver driver;
	
	public PageCreationManager (WebDriver driver) {
		this.driver=driver;
	}
	
	public LoginPage getLoginPage() {	
		loginpage = new LoginPage(driver);
		return loginpage;
	}
	public ProductsPage getProductsPage() {	
		productspage = new ProductsPage(driver);
		return productspage;
	}
	public CartPage getCartPage() {	
		cartpage = new CartPage(driver);
		return cartpage;
	}
	public CheckoutPage getCheckOutPage() {	
		checkoutpage = new CheckoutPage(driver);
		return checkoutpage;
	}
    
    
}
