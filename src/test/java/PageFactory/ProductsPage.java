package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	WebDriver driver;
    String prdName;
	@FindBy(xpath="//*[@id=\"item_4_title_link\"]/div")
	WebElement lbl_prdName;
	@FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")
	WebElement btn_addToCart;
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
	WebElement btn_shoppingCart;
	public ProductsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	public void isProdNameDisplayed() {
	lbl_prdName.isDisplayed();
	}
	public String getPrdname() {
		return lbl_prdName.getText();
	}
	public void clickonAddToCart() {
		btn_addToCart.click();
	}
	public void clickonShoppingCart() {
		btn_shoppingCart.click();
	}
}
