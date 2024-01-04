package Utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageFactory.PageCreationManager;
import StepDefinitions.Hooks;

public class TestContextSetup {
	
public WebDriver driver;
public String prdName;
public String cartPrdName;
public PageCreationManager pagecreationmanager;
public TestBase testbase;
public GenericUtils genericutils;


public TestContextSetup () throws IOException {
	
	testbase = new TestBase();
	pagecreationmanager = new PageCreationManager(testbase.WebDriverManager());
	genericutils = new GenericUtils(testbase.WebDriverManager());

}

}
