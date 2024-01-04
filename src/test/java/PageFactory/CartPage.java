package PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	WebDriver driver;
    
	@FindBy(xpath="//*[@id=\"item_4_title_link\"]/div")
	WebElement lbl_cartPrdName;
	@FindBy(xpath="//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")
	WebElement btn_chkOut;
	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	public String getCartPrdName() {
		return lbl_cartPrdName.getText();
	}
	public void clickOnCheckOut() {
		btn_chkOut.click();
	}
}
