package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By txt_username = By.xpath("//input[@id='user-name']");
	By txt_password = By.xpath("//input[@id='password']");
	By btn_login = By.xpath("//input[@id='login-button']");
	By lbl_homePrd = By.xpath("//div[@class='product_label']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
	public void isHomePageDisplayed() {
		driver.findElement(lbl_homePrd).isDisplayed();
	}

	

}
