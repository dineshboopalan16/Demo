package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@FindBy(xpath="//input[@id='user-name']")
	WebElement txt_username;
	@FindBy(xpath="//input[@id='password']")
	WebElement txt_password;
	@FindBy(xpath="//input[@id='login-button']")
	WebElement btn_login;
	
	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}
    public void clickLogin() {
    	btn_login.click();
    }
    public LoginPage(WebDriver driver) {
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    }
}
