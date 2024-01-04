package PageFactory;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	WebDriver driver;
    String msg = "THANK YOU FOR YOUR ORDER";
	@FindBy(xpath="//*[@id=\"first-name\"]")
	WebElement txt_firstname;
	@FindBy(xpath="//*[@id=\"last-name\"]")
	WebElement txt_secondname;
	@FindBy(xpath="//*[@id=\"postal-code\"]")
	WebElement txt_postalcode;
	@FindBy(xpath="//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")
	WebElement btn_continue;
	@FindBy(xpath="//*[@id=\"item_4_title_link\"]/div")
	WebElement lbl_chkoutPrdname;
	@FindBy(xpath="//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")
	WebElement btn_finish;
	@FindBy(xpath="//*[@id=\"checkout_complete_container\"]/h2")
	WebElement lbl_msg;
	
	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	public void enterInformation(String firstname, String secondname, String postalcode) {
		txt_firstname.sendKeys(firstname);
		txt_secondname.sendKeys(secondname);
		txt_postalcode.sendKeys(postalcode);
	}
	public void clickOnContinue() {
		btn_continue.click();
	}
	public String getChkoutPrdName() {
		return lbl_chkoutPrdname.getText();
	}
	public void clickOnFinish() {
		btn_finish.click();
	}
	public void verifyMsg() {
     lbl_msg.getText().equalsIgnoreCase(msg);
	}
	
}
