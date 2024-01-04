package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	WebDriver driver;

	public WebDriver WebDriverManager() throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\GlobalVaribales.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		
		if (driver == null) 
		{
		
		if (prop.getProperty("browser").equalsIgnoreCase("chrome"))
				{
			driver = new ChromeDriver();
		        }	
		if (prop.getProperty("browser").equalsIgnoreCase("firefox"))
				{
			driver = new FirefoxDriver();
		}
		
		driver.get(url);
		}
		return driver;
		
	}
}

