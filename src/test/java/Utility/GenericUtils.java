package Utility;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	WebDriver driver;
	public GenericUtils(WebDriver driver) {
		this.driver = driver;
	}
	public void closeBrowser() {
		driver.quit();
	}

}
